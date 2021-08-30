package project;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.*;

public class ChooseFrame implements ActionListener{

	JFrame frame;
	JLabel label1,label2,label3;
	
	JRadioButton allButton,academicButton,generalButton,allButton2,computerButton,paperBasedButton;
	ButtonGroup group,group2;
	JButton submitButton,backButton;
	
	
	ChooseFrame(){
		
		
		label1 = new JLabel("Select an IELTS test right for you");
		label1.setBounds(20, 10, 350, 120);
		label1.setFont(new Font("Arial",Font.BOLD,20));
		
		label2 = new JLabel("Choose which IELTS test you want:");
		label2.setBounds(20, 100, 250, 40);
		label2.setFont(new Font("Arial",Font.PLAIN,16));
		
		
		label3 = new JLabel("Choose your preferred test format:");
		label3.setBounds(20, 310, 250, 40);
		label3.setFont(new Font("Arial",Font.PLAIN,16));
		
		
		allButton = new JRadioButton("All");
		allButton.setFocusable(false);
		allButton.setBounds(25, 140, 300, 40);
		allButton.setFont(new Font("Serif",Font.PLAIN,18));
		
		
		academicButton = new JRadioButton("IELTS Academic");
		academicButton.setFocusable(false);
		academicButton.setBounds(25,180,300,40);
		academicButton.setFont(new Font("Serif",Font.PLAIN,18));
		
		
		generalButton = new JRadioButton("IELTS General Training");
		generalButton.setFocusable(false);
		generalButton.setBounds(25,220,300,40);
		generalButton.setFont(new Font("Serif",Font.PLAIN,18));
		
		group = new ButtonGroup();
		group.add(allButton);
		group.add(academicButton);
		group.add(generalButton);
		
		
		allButton2 = new JRadioButton("All");
		allButton2.setFocusable(false);
		allButton2.setBounds(25, 350, 300, 40);
		allButton2.setFont(new Font("Serif",Font.PLAIN,18));
		
		
		computerButton = new JRadioButton("Computer-delivered");
		computerButton.setFocusable(false);
		computerButton.setBounds(25, 390, 300, 40);
		computerButton.setFont(new Font("Serif",Font.PLAIN,18));
		
		paperBasedButton = new JRadioButton("Paper-based");
		paperBasedButton.setFocusable(false);
		paperBasedButton.setBounds(25, 430, 300, 40);
		paperBasedButton.setFont(new Font("Serif",Font.PLAIN,18));
		
		
		group2 = new ButtonGroup();
		group2.add(allButton2);
		group2.add(computerButton);
		group2.add(paperBasedButton);
		
		
		
		submitButton = new JButton("Submit");
		submitButton.setFocusable(false);
		submitButton.setBounds(180, 500, 100, 30);
		submitButton.setFont(new Font("Arial",Font.BOLD,12));
		submitButton.addActionListener(this);
	     
		backButton = new JButton("Back");
		backButton.setFocusable(false);
		backButton.setFont(new Font("Arial",Font.BOLD,12));
		backButton.setBounds(280, 500, 100, 30);
		backButton.addActionListener(this);
		
		
		
		frame = new JFrame("Select a Test");
		frame.add(label1);
		frame.add(label2);
		frame.add(allButton);
		frame.add(academicButton);
		frame.add(generalButton);
		frame.add(label3);
		frame.add(allButton2);
		frame.add(computerButton);
		frame.add(paperBasedButton);
		frame.add(submitButton);
		frame.add(backButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(590, 650);
	    frame.setLocationRelativeTo(null);
	    frame.setLayout(null);
	    frame.setVisible(true);
	        
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
      if(e.getSource()==submitButton && group.isSelected(null)) {
			
			JOptionPane.showMessageDialog(null, "Please Select a Test");
			
		}
      
      else if(e.getSource()==submitButton && group.isSelected(null) || group2.isSelected(null)) {
			
			JOptionPane.showMessageDialog(null, "Please Select Both");
			
		}
      
	   else{
			
			LocationAndDate locationAndDate = new LocationAndDate();
			
		}
		
		
	}
	
	
	
}
