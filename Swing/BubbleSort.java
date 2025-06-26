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
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class BubbleSort extends JFrame {

	private JPanel contentPane;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BubbleSort frame = new BubbleSort();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public BubbleSort() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.PINK);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel jLable = new JLabel("SORTING");
		jLable.setFont(new Font("Tahoma", Font.BOLD, 16));
		jLable.setBounds(171, 11, 76, 20);
		contentPane.add(jLable);
		
		JLabel numberJLabel = new JLabel("ENTER NUMBER FOR SORTING");
		numberJLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		numberJLabel.setForeground(Color.DARK_GRAY);
		numberJLabel.setBounds(10, 69, 179, 15);
		contentPane.add(numberJLabel);
		
		JLabel jlabelNumberAfterSorting = new JLabel("NUMBER AFTER SORTING");
		jlabelNumberAfterSorting.setForeground(Color.DARK_GRAY);
		jlabelNumberAfterSorting.setFont(new Font("Tahoma", Font.BOLD, 12));
		jlabelNumberAfterSorting.setBounds(38, 95, 151, 15);
		contentPane.add(jlabelNumberAfterSorting);
		
		JTextArea textAreaEnterNumber = new JTextArea();
		textAreaEnterNumber.setColumns(5);
		textAreaEnterNumber.setBounds(199, 65, 225, 22);
		contentPane.add(textAreaEnterNumber);
		
		JTextArea textAreaAfterSorting = new JTextArea();
		textAreaAfterSorting.setColumns(5);
		textAreaAfterSorting.setBounds(199, 91, 225, 22);
		contentPane.add(textAreaAfterSorting);
		
		JButton jbuttonBubbleSort = new JButton("BUBBLE SORT");
		jbuttonBubbleSort.setFont(new Font("Tahoma", Font.BOLD, 11));
		jbuttonBubbleSort.setForeground(Color.BLACK);
		jbuttonBubbleSort.setBackground(Color.ORANGE);
		jbuttonBubbleSort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentance=textAreaEnterNumber.getText();
				String arr[]=sentance.split(" ");
				String help;
				for (int i = 0; i < arr.length-2; i++) {
					for (int j = 0; j < arr.length-2-i; j++) {
						if(Integer.valueOf(arr[j])>Integer.valueOf(arr[j+1])) {
							help=arr[j+1];
							arr[j+1]=arr[j];
							arr[j]=help;
						}
					}
				}
				String result="";
				for (int i = 0; i < arr.length-1; i++) {
					result=result+arr[i]+" ";
				}
				textAreaAfterSorting.setText(result);
				}
			
		});
		jbuttonBubbleSort.setBounds(163, 154, 107, 23);
		contentPane.add(jbuttonBubbleSort);
	}
}
