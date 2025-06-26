import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ReverseWordOfSentense extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReverseWordOfSentense frame = new ReverseWordOfSentense();
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
	public ReverseWordOfSentense() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabelHeading = new JLabel("REVERSE SENTANCE");
		jLabelHeading.setFont(new Font("Yu Gothic", Font.BOLD, 19));
		jLabelHeading.setBounds(119, 11, 200, 31);
		contentPane.add(jLabelHeading);
		
		JLabel jLabelEnterSentance = new JLabel("Enter Sentance");
		jLabelEnterSentance.setFont(new Font("Times New Roman", Font.BOLD, 13));
		jLabelEnterSentance.setBounds(10, 56, 83, 16);
		contentPane.add(jLabelEnterSentance);
		
		JTextArea textAreaEnterSentance = new JTextArea();
		textAreaEnterSentance.setBounds(100, 52, 285, 73);
		contentPane.add(textAreaEnterSentance);
		
		JLabel jLabelOutput = new JLabel("Output");
		jLabelOutput.setFont(new Font("Times New Roman", Font.BOLD, 13));
		jLabelOutput.setBounds(55, 181, 38, 16);
		contentPane.add(jLabelOutput);
		
		JTextArea textAreaOutput = new JTextArea();
		textAreaOutput.setBounds(100, 177, 285, 73);
		contentPane.add(textAreaOutput);
		
		JButton jButton = new JButton("Press To Reverse");
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val=textAreaEnterSentance.getText();
				String arr[]=val.split("");
				String result="";
				
				for (int i = arr.length-1; i >=0; i--) {
					result=result+arr[i];
					}
				
				String arr2[]=result.split(" ");
				String result2="";
				
				for (int j =arr2.length-1;j>=0; j--){
					result2=result2+arr2[j]+" ";
					}
				textAreaOutput.setText(result2);
				}
			});
		jButton.setFont(new Font("Times New Roman", Font.BOLD, 11));
		jButton.setBounds(100, 136, 119, 21);
		contentPane.add(jButton);
	}
}
