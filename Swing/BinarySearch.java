import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BinarySearch extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BinarySearch frame = new BinarySearch();
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
	public BinarySearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLabelHeading = new JLabel("BINARY SEARCH");
		jLabelHeading.setForeground(Color.BLACK);
		jLabelHeading.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		jLabelHeading.setBackground(Color.ORANGE);
		jLabelHeading.setBounds(143, 11, 153, 26);
		contentPane.add(jLabelHeading);
		
		JLabel jLabelEnterNumber = new JLabel("ENTER NUMBERS");
		jLabelEnterNumber.setFont(new Font("Times New Roman", Font.BOLD, 16));
		jLabelEnterNumber.setForeground(Color.DARK_GRAY);
		jLabelEnterNumber.setBounds(10, 64, 139, 20);
		contentPane.add(jLabelEnterNumber);
		
		JLabel jLabelEnterKey = new JLabel("ENTER KEY");
		jLabelEnterKey.setForeground(Color.DARK_GRAY);
		jLabelEnterKey.setFont(new Font("Times New Roman", Font.BOLD, 16));
		jLabelEnterKey.setBounds(59, 95, 90, 20);
		contentPane.add(jLabelEnterKey);
		
		JTextArea textAreaEnterNumbers = new JTextArea();
		textAreaEnterNumbers.setForeground(Color.BLACK);
		textAreaEnterNumbers.setBounds(159, 63, 241, 22);
		contentPane.add(textAreaEnterNumbers);
		
		JTextArea textAreaEnterKey = new JTextArea();
		textAreaEnterKey.setForeground(Color.BLACK);
		textAreaEnterKey.setBounds(159, 94, 37, 22);
		contentPane.add(textAreaEnterKey);
		
		JTextArea textAreaNumber = new JTextArea();
		textAreaNumber.setForeground(Color.BLACK);
		textAreaNumber.setBounds(159, 213, 241, 22);
		contentPane.add(textAreaNumber);
		
		JLabel jLabelOutput = new JLabel("OUTPUT");
		jLabelOutput.setForeground(Color.DARK_GRAY);
		jLabelOutput.setFont(new Font("Times New Roman", Font.BOLD, 16));
		jLabelOutput.setBounds(85, 215, 63, 20);
		contentPane.add(jLabelOutput);
		
		JButton jButton = new JButton("BINARY SEARCH");
		jButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String val1=textAreaEnterNumbers.getText();
				String arr[]=val1.split(" ");
				String val2=textAreaEnterKey.getText();
				String result="";
				
				int min=0;
			    int max=arr.length-1;
			    int mid;
			    
				while(max>=min) {
					mid=(min+max)/2;
					if(Integer.valueOf(arr[mid])==Integer.valueOf(val2)) {
						result=result+"Key is Found at the index :"+String.valueOf(mid);
						break;
					}
					else if(Integer.valueOf(val2)>Integer.valueOf(arr[mid])) {
						min=mid+1;
						max=max;
						
					}
					else {
						max=mid-1;
						min=min;
					}
					
				}
				if(min>max) {
					result=result+"Key not found...............";
				}
				
				
				textAreaNumber.setText(result);
			}
		});
		jButton.setFont(new Font("Georgia", Font.BOLD, 16));
		jButton.setBounds(159, 148, 175, 27);
		contentPane.add(jButton);
	}

}
