package teachers_calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class GUI{
	private JFrame frame;

	
	private JTextField input;

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;


	
	private JButton add;
	private JButton equals;
	
	int num=0, num2=0, sum=0, temp=0;
	
	GUI() {
		frame = new JFrame();
		
		input = new JTextField();
		input.setBounds(10, 10, 290, 40); //50
		
	
		
		btn1 = new JButton("1");
		btn1.setBounds(10, 60, 50, 50);
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "1");
			}
			
		});
		
	
			
		btn2 = new JButton("2");
		btn2.setBounds(70, 60, 50, 50);
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "2");
			}
			
		});
		
		btn3 = new JButton("3");
		btn3.setBounds(130, 60, 50, 50);
		btn3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "3");
			}
			
		});
		
		btn4 = new JButton("4");
		btn4.setBounds(10, 120, 50, 50);
		btn4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "4");
			}
			
		});
		
		btn5 = new JButton("5");
		btn5.setBounds(70, 120, 50, 50);
		btn5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "5");
			}
			
		});
		
		btn6 = new JButton("6");
		btn6.setBounds(130, 120, 50, 50);
		btn6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "6");
			}
			
		});
		
		btn7 = new JButton("7");
		btn7.setBounds(10, 180, 50, 50);
		btn7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "7");
			}
			
		});
		
		btn8 = new JButton("8");
		btn8.setBounds(70, 180, 50, 50);
		btn8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "8");
			}
			
		});
		
		btn9 = new JButton("9");
		btn9.setBounds(130, 180, 50, 50);
		btn9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				input.setText(input.getText() + "9");
			}
			
		});
		
		add = new JButton("+");
		add.setBounds(190, 60, 50, 50);
		add.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if ((!input.getText().equals(""))) {
					num = Integer.parseInt(input.getText());
					num2 = num;
					input.setText("");
					
				}
				
			}
			
		});
	
		
		equals = new JButton("=");
		equals.setBounds(250, 60, 50, 50);
		equals.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (temp == num) {
					sum = temp + Integer.parseInt(input.getText());
					input.setText(Integer.toString(sum));
				}
				else if ((!input.getText().equals("")) && (num > 0)) {
					num2 = Integer.parseInt(input.getText()); //7
					
					
					sum = num + num2; //6 + 7
					
					input.setText(Integer.toString(sum));
				}
				temp = num2; //6
				num = num2; //6
			}
			
		});
	
		
		
		
		frame.add(input);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(btn3);
		frame.add(btn4);
		frame.add(btn5);
		frame.add(btn6);
		frame.add(btn7);
		frame.add(btn8);
		frame.add(btn9);
		frame.add(add);
		frame.add(equals);
		frame.setLayout(null);
		frame.setSize(325, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		
	}

}