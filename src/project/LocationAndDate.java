package project;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

import com.toedter.calendar.JCalendar;

public class LocationAndDate implements ActionListener{
	AllExamDates allExamDates;
	JFrame frame;
	JLabel label1,label2;
	JComboBox<String> placeBox;
	String[]localArea = {"Chittagong","Dhaka","Khulna","Comilla","Sylhet","Rajshahi"};
	JRadioButton dateButton1,dateButton2;
	ButtonGroup group;
	JButton searchButton;
	JCalendar calendar;
	
	public LocationAndDate(){
		
		
		label1 = new JLabel("Where would you like to take your test?");
		label1.setBounds(50, 40,350, 60);
		label1.setFont(new Font("Arial",Font.BOLD,18));
		
		placeBox = new JComboBox<String>(localArea);
		placeBox.setFont(new Font("Serif",Font.PLAIN,20));
		placeBox.setBounds(100, 100, 240, 50);
		
		
		label2 = new JLabel("When would you like to take your test?");
		label2.setBounds(50, 140, 350, 60);
		label2.setFont(new Font("Arial",Font.BOLD,18));
		
		
		dateButton1 = new JRadioButton("Show me all dates");
		dateButton1.setFocusable(false);
		dateButton1.setBounds(55, 280, 200, 70);
		dateButton1.setFont(new Font("Serif",Font.PLAIN,18));
		
		dateButton2 = new JRadioButton("Let me choose the dates");
		dateButton2.setFocusable(false);
		dateButton2.setBounds(55, 325, 200, 70);
		dateButton2.setFont(new Font("Serif",Font.PLAIN,18));
		//calander

		
// 		group = new ButtonGroup();
//		group.add(dateButton1);
//		group.add(dateButton2);
		
		
		searchButton = new JButton("Search for dates");
		searchButton.setFocusable(false);
		searchButton.setBounds(130, 400 , 200, 50);
		searchButton.setFont(new Font("Arial",Font.PLAIN,18));
		searchButton.addActionListener(this);
		
		JLabel chooseDate = new JLabel("Pick a Date for your exam");
		chooseDate.setFont(new Font("Serif",Font.ITALIC,12));
		chooseDate.setBounds(100, 110, 250, 200);
		
	    calendar = new JCalendar();  
	 	calendar.setBounds(100, 220, 250, 200);
	 
		frame = new JFrame("Location and Date");
		
		frame.add(label1);
		frame.add(placeBox);
		frame.add(label2);
		frame.add(chooseDate);
		frame.add(calendar);
		frame.add(searchButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 550);
		frame.setLayout(null);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String date = calendar.getCalendar().getInstance().toString();

		//"Chittagong","Dhaka","khulna","Comilla","Sylhet","Rajshahi"
		
		if(e.getSource()==searchButton && placeBox.getSelectedIndex()==0) {
				
			  allExamDates = new AllExamDates("Chittagong","92 Agrabad",
					 "Rafique Tower(8th Floor),",
					 "ctg1020 chittagong",
					 "Clinic Moore ctg");
			System.out.print(date);
			}
		 else if(e.getSource()==searchButton && placeBox.getSelectedIndex()==1) {
				
			  allExamDates = new AllExamDates("Dhaka","Lalmatia,Dhaka,1207","Satmasjid Road,","uttara 3200","Bonani road2");
				
			}
		 else if(e.getSource()==searchButton && placeBox.getSelectedIndex()==2) {
				
			  allExamDates = new AllExamDates("Khulna"," 9100,Khulna","82 Rupsah Stand Road,"," Natun Bazar 1200","kalimabad khulna");
				
			}
		 else if(e.getSource()==searchButton && placeBox.getSelectedIndex()==3) {
				
			  allExamDates = new AllExamDates("Comilla",
					 "Rajendrapur, Comilla-3500","Opposite Bishwa Road","comilla cantonment","Elephat road,comilla");
				
			}
			
		 else if(e.getSource()==searchButton && placeBox.getSelectedIndex()==4) {
				
			  allExamDates = new AllExamDates("Sylhet",
					 "Mirzajangal, Sylhet","Arcadia, Floor 5 Dorshon Dewri,","Nirvana inn,","Zindabazar,Sylhet");
				
			}
		 else if(e.getSource()==searchButton && placeBox.getSelectedIndex()==5) {
				
			  allExamDates = new AllExamDates("Rajshahi",
					 "Angel Drop, Uposhahar, Rajshahi",
					 "House No: 12,Uttora Clinic Moore,","E-block lalmatia","ShahJalal Road,3200");
				
			}
		
		
		
		
		
		
		
//		else
//		{
//			  allExamDates = new ();
//		}
		
	}
	
	
}
