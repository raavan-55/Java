import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseString extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseString frame = new ReverseString();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReverseString() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabelHeading = new JLabel("REVERSE STRING");
		jLabelHeading.setFont(new Font("Times New Roman", Font.BOLD, 22));
		jLabelHeading.setBounds(123, 11, 192, 26);
		contentPane.add(jLabelHeading);
		
		JLabel jLabelEnterString = new JLabel("Enter String :");
		jLabelEnterString.setFont(new Font("Times New Roman", Font.BOLD, 14));
		jLabelEnterString.setBounds(10, 58, 85, 17);
		contentPane.add(jLabelEnterString);
		
		JLabel jLabelOutput = new JLabel("Output :");
		jLabelOutput.setFont(new Font("Times New Roman", Font.BOLD, 14));
		jLabelOutput.setBounds(42, 186, 53, 17);
		contentPane.add(jLabelOutput);
		
		JTextArea textAreaEnterString = new JTextArea();
		textAreaEnterString.setBounds(96, 55, 287, 67);
		contentPane.add(textAreaEnterString);
		
		JTextArea textAreaOutput = new JTextArea();
		textAreaOutput.setBounds(96, 183, 287, 67);
		contentPane.add(textAreaOutput);
		
		JButton jButton = new JButton("Press To Reverse");
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val=textAreaEnterString.getText();
				String arr[]=val.split("");
				String result="";
				for (int i = arr.length-1; i >=0; i--) {
					result=result+arr[i];
					}
				textAreaOutput.setText(result);
				}
		});
		jButton.setBounds(96, 138, 117, 23);
		contentPane.add(jButton);
	}
}
