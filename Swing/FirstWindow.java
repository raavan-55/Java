import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldFirstNumber;
	private JTextField textFieldSecondNumber;
	private JTextField textFieldResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstWindow frame = new FirstWindow();
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
	public FirstWindow() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("CALCULATOR");
		heading.setForeground(Color.BLACK);
		heading.setFont(new Font("Tahoma", Font.BOLD, 16));
		heading.setBounds(157, 11, 111, 20);
		contentPane.add(heading);
		
		JLabel labelFirstNumber = new JLabel("FIRST NUMBER");
		labelFirstNumber.setBounds(117, 61, 73, 14);
		contentPane.add(labelFirstNumber);
		
		JLabel labelSecondNumber = new JLabel("SECOND NUMBER");
		labelSecondNumber.setBounds(105, 86, 85, 14);
		contentPane.add(labelSecondNumber);
		
		JLabel labelResult = new JLabel("RESULT");
		labelResult.setBounds(153, 233, 37, 14);
		contentPane.add(labelResult);
		
		textFieldFirstNumber = new JTextField();
		textFieldFirstNumber.setForeground(Color.BLACK);
		textFieldFirstNumber.setBounds(195, 58, 111, 20);
		contentPane.add(textFieldFirstNumber);
		textFieldFirstNumber.setColumns(10);
		
		textFieldSecondNumber = new JTextField();
		textFieldSecondNumber.setForeground(Color.BLACK);
		textFieldSecondNumber.setColumns(10);
		textFieldSecondNumber.setBounds(195, 83, 111, 20);
		contentPane.add(textFieldSecondNumber);
		
		textFieldResult = new JTextField();
		textFieldResult.setForeground(Color.BLACK);
		textFieldResult.setColumns(10);
		textFieldResult.setBounds(200, 230, 111, 20);
		contentPane.add(textFieldResult);
		
		JButton buttonADD = new JButton("ADD");
		buttonADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  String data1=textFieldFirstNumber.getText();
			  String data2=textFieldSecondNumber.getText();
			  int var1=Integer.valueOf(data1);
			  int var2=Integer.valueOf(data2);
			  int res=var1+var2;
			  String result=String.valueOf(res);
			  textFieldResult.setText(result);
			   }
		});
		buttonADD.setBounds(33, 173, 53, 23);
		contentPane.add(buttonADD);
		
		JButton buttonSUB = new JButton("SUB");
		buttonSUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String data1=textFieldFirstNumber.getText();
				  String data2=textFieldSecondNumber.getText();
				  int var1=Integer.valueOf(data1);
				  int var2=Integer.valueOf(data2);
				  int res=var1-var2;
				  String result=String.valueOf(res);
				  textFieldResult.setText(result);
			}
		});
		buttonSUB.setBounds(107, 173, 53, 23);
		contentPane.add(buttonSUB);
		
		JButton buttonMultiply = new JButton("MUL");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=textFieldFirstNumber.getText();
				  String data2=textFieldSecondNumber.getText();
				  int var1=Integer.valueOf(data1);
				  int var2=Integer.valueOf(data2);
				  int res=var1*var2;
				  String result=String.valueOf(res);
				  textFieldResult.setText(result);
			}
		});
		buttonMultiply.setBounds(183, 173, 53, 23);
		contentPane.add(buttonMultiply);
		
		JButton buttonDivision = new JButton("DIV");
		buttonDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=textFieldFirstNumber.getText();
				  String data2=textFieldSecondNumber.getText();
				  float var1=Float.valueOf(data1);
				  float var2=Float.valueOf(data2);
				  float res=var1/var2;
				  String result=String.valueOf(res);
				  textFieldResult.setText(result);
			}
		});
		buttonDivision.setBounds(258, 173, 49, 23);
		contentPane.add(buttonDivision);
		
		JButton buttonMod = new JButton("MOD");
		buttonMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String data1=textFieldFirstNumber.getText();
				  String data2=textFieldSecondNumber.getText();
				  int var1=Integer.valueOf(data1);
				  int var2=Integer.valueOf(data2);
				  int res=var1%var2;
				  String result=String.valueOf(res);
				  textFieldResult.setText(result);
			}
		});
		buttonMod.setBounds(334, 173, 55, 23);
		contentPane.add(buttonMod);
	}
}
