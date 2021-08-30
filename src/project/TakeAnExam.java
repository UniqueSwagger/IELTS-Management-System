package project;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TakeAnExam implements ActionListener {

	JFrame frame;
	ImageIcon EarthIcon;
	JLabel label1,label2,alertLabel;
	JComboBox countryBox;
	String country[]= {"Choose a country/terrirory","Australia","Austria","Afganistan","Bahrain","Bangladesh","Belgium","Colombia","Cyprus","Canada"};
	JButton registerbutton,backButton;
	JPanel panel;
	public TakeAnExam(){
		
		
		EarthIcon = new ImageIcon("earth.png");
		
		label1 = new JLabel();
		label1.setIcon(EarthIcon);
		label1.setBounds(180, 10, 100, 100);
		
		label2 = new JLabel("Take an Exam");
		label2.setFont(new Font("Arial",Font.BOLD,20));
		label2.setBounds(137, 20, 200, 200);
		
		alertLabel = new JLabel("Please choose a country");
		alertLabel.setForeground(Color.red);
		alertLabel.setVisible(false);
		alertLabel.setFont(new Font("Arial",Font.PLAIN,14));
		alertLabel.setBounds(125, 252, 200, 200);
		
		countryBox = new JComboBox(country);
		countryBox.setFont(new Font("Serif",Font.PLAIN,20));
		countryBox.setBounds(80, 160, 240, 50);
		
		
		registerbutton = new JButton("Press Here");
		registerbutton.setFocusable(false);
		registerbutton.setFont(new Font("Arial",Font.PLAIN,17));
		registerbutton.setBounds(116, 250, 170, 50);
		registerbutton.addActionListener(this);
		
		
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setSize(420, 420);
		panel.add(label1);
		panel.add(label2);
		panel.add(countryBox);
		panel.add(registerbutton);
		panel.add(alertLabel);
		
		
		
		
		
		frame = new JFrame("Take an exam");
		
		frame.add(panel);
		//frame.add(label1);
		//frame.add(label2);
		//frame.add(countryBox);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
	    frame.setVisible(true);
	    
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
        if(e.getSource()==registerbutton && countryBox.getSelectedIndex()==0) {
			
			alertLabel.setVisible(true);	
			
		}
		
        else if(e.getSource()==registerbutton && countryBox.getSelectedIndex()>0) {
			
			ChooseFrame chooseFrame = new ChooseFrame();
			frame.setVisible(false);
			
		}
		
		
	}
	
	
}
