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

public class LinearSearch extends JFrame {

	private JPanel contentPane;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LinearSearch frame = new LinearSearch();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public LinearSearch() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jlabelHeading = new JLabel("LINEAR SEARCH");
		jlabelHeading.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
		jlabelHeading.setBounds(153, 11, 135, 23);
		contentPane.add(jlabelHeading);
		
		JLabel jlabelEnterelements = new JLabel("Enter Numbers");
		jlabelEnterelements.setForeground(Color.ORANGE);
		jlabelEnterelements.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlabelEnterelements.setBounds(22, 63, 90, 15);
		contentPane.add(jlabelEnterelements);
		
		JLabel jlabelKey = new JLabel("Enter Key");
		jlabelKey.setForeground(Color.ORANGE);
		jlabelKey.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlabelKey.setBounds(53, 89, 59, 15);
		contentPane.add(jlabelKey);
		
		JLabel jlabelResult = new JLabel("Output");
		jlabelResult.setForeground(Color.ORANGE);
		jlabelResult.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlabelResult.setBounds(67, 196, 45, 15);
		contentPane.add(jlabelResult);
		
		JTextArea textAreaEnterNumber = new JTextArea();
		textAreaEnterNumber.setBackground(Color.LIGHT_GRAY);
		textAreaEnterNumber.setBounds(122, 59, 269, 22);
		contentPane.add(textAreaEnterNumber);
		
		JTextArea textAreaKey = new JTextArea();
		textAreaKey.setBackground(Color.LIGHT_GRAY);
		textAreaKey.setBounds(122, 89, 59, 22);
		contentPane.add(textAreaKey);
		
		JTextArea textAreaResult = new JTextArea();
		textAreaResult.setBackground(Color.WHITE);
		textAreaResult.setBounds(122, 189, 269, 22);
		contentPane.add(textAreaResult);
		
		JButton btnLinearSearch = new JButton("LINEAR SEARCH");
		btnLinearSearch.setFont(new Font("Trebuchet MS", Font.BOLD, 12));
		btnLinearSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String var1=textAreaEnterNumber.getText();
				String key=textAreaKey.getText();
				           String arr[]=var1.split(" ");
				           String result="";
				           int i;
				           for (i = 0;i <=arr.length-1;i++) {
				        	   if(Integer.valueOf(arr[i])==Integer.valueOf(key)) {
				        		   result=result+"Key is found at index :"+String.valueOf(i);
				        		   break; 
				        	   }
				        	   }
				          if(i==arr.length) {
				        	   result=result+"Key not found....";
				          }
				        	   textAreaResult.setText(result);
				           }
		});
		btnLinearSearch.setForeground(Color.BLACK);
		btnLinearSearch.setBackground(Color.ORANGE);
		btnLinearSearch.setBounds(122, 122, 135, 45);
		contentPane.add(btnLinearSearch);
	}
}
