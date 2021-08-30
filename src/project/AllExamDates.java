package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class AllExamDates implements ActionListener{

	String district,area,area2,road,road2;
	JFrame frame;
	JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16;
	ImageIcon paperIcon,profileIcon;
	JButton button1,button2;


	public AllExamDates() {
		
	}
	
	public AllExamDates(String district , String area, String road,String road2,String area2) {
		this.district = district;
		this.area = area;
		this.road = road;
		this.road2 = road2;
		this.area2 = area2;
		
		label1 = new JLabel("1. October 14, 2021, 10:00 - 12:45");
		label1.setBounds(50, 25, 380, 100);
		label1.setFont(new Font("Arial",Font.BOLD,22));
		
		paperIcon = new ImageIcon("paper.png");
		
		label2 = new JLabel("Listening, Reading & Writing");
		label2.setIcon(paperIcon);
		label2.setBounds(50,58,350,100);
		label2.setFont(new Font("Arial",Font.BOLD,16));
		
		
		
		label3 = new JLabel("October 11, 2021, 5:00 - 6:00");
		label3.setBounds(50, 150, 380, 100);
		label3.setFont(new Font("Arial",Font.BOLD,22));
		
		profileIcon = new ImageIcon("profile.png");
		
		label4 = new JLabel("Speaking");
		label4.setIcon(profileIcon);
		label4.setBounds(50, 200, 350, 100);
		label4.setFont(new Font("Arial",Font.BOLD,16));
		
		
		label5 = new JLabel("Speaking address");
		label5.setBounds(50, 250, 300, 100);
		label5.setForeground(new Color(0x6C757D));
		label5.setFont(new Font("Serif",Font.PLAIN,19));
		
		
		label6 = new JLabel(this.road);
		label6.setBounds(50, 280, 300, 100);
		label6.setForeground(new Color(0x6C757D));
		label6.setFont(new Font("Serif",Font.PLAIN,19));
		
		label7 = new JLabel(this.area);
		label7.setBounds(50, 310, 300, 100);
		label7.setForeground(new Color(0x6C757D));
		label7.setFont(new Font("Serif",Font.PLAIN,19));
		
		label8 = new JLabel(this.district);
		label8.setBounds(50, 340, 100, 100);
		label8.setForeground(new Color(0x6C757D));
		label8.setFont(new Font("Serif",Font.PLAIN,19));
		
		
		button1 = new JButton("Book the test");
		button1.setFocusable(false);
		button1.setBounds(50, 420, 200, 60);
		button1.setFont(new Font("Arial",Font.PLAIN,19));
		button1.addActionListener(this);
	    
		
		
		
		label9 = new JLabel("2. November 23, 2021, 11:00 - 1:30");
		label9.setBounds(440, 25, 380, 100);
		label9.setFont(new Font("Arial",Font.BOLD,22));
		
		paperIcon = new ImageIcon("paper.png");
		
		label10 = new JLabel("Listening, Reading & Writing");
		label10.setIcon(paperIcon);
		label10.setBounds(440,58,350,100);
		label10.setFont(new Font("Arial",Font.BOLD,16));
		
		
		
		label11 = new JLabel("October 20, 2021, 10:40 - 11:00");
		label11.setBounds(440, 150, 380, 100);
		label11.setFont(new Font("Arial",Font.BOLD,22));
		
		profileIcon = new ImageIcon("profile.png");
		
		label12 = new JLabel("Speaking");
		label12.setIcon(profileIcon);
		label12.setBounds(440, 200, 350, 100);
		label12.setFont(new Font("Arial",Font.BOLD,16));
		
		
		label13 = new JLabel("Speaking address");
		label13.setBounds(440, 250, 300, 100);
		label13.setForeground(new Color(0x6C757D));
		label13.setFont(new Font("Serif",Font.PLAIN,19));
		
		
		label14 = new JLabel(this.road2);
		label14.setBounds(440, 280, 300, 100);
		label14.setForeground(new Color(0x6C757D));
		label14.setFont(new Font("Serif",Font.PLAIN,19));
		
		label15 = new JLabel(this.area2);
		label15.setBounds(440, 310, 300, 100);
		label15.setForeground(new Color(0x6C757D));
		label15.setFont(new Font("Serif",Font.PLAIN,19));
		
		label16 = new JLabel(this.district);
		label16.setBounds(440, 340, 100, 100);
		label16.setForeground(new Color(0x6C757D));
		label16.setFont(new Font("Serif",Font.PLAIN,19));
		
		
		button2 = new JButton("Book the test");
		button2.setFocusable(false);
		button2.setBounds(440, 420, 200, 60);
		button2.setFont(new Font("Arial",Font.PLAIN,19));
	    button2.addActionListener(this);
	    	
		
	
		
		frame = new JFrame("All Exam Dates");
		frame.add(label1);
		frame.add(label2);
		frame.add(label3);
		frame.add(label4);
		frame.add(label5);
		frame.add(label6);
		frame.add(label7);
		frame.add(label8);
		frame.add(button1);
		
		frame.add(label9);
		frame.add(label10);
		frame.add(label11);
		frame.add(label12);
		frame.add(label13);
		frame.add(label14);
		frame.add(label15);
		frame.add(label16);
		frame.add(button2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(830, 680);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button1 || e.getSource()==button2) {
			
			RegisterForm registerForm = new RegisterForm();
			
			
		}
		
		
	}
	
	
	
	
}
