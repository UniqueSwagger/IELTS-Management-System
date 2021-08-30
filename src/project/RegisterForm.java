package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;





public class RegisterForm extends JFrame implements ActionListener  {
	String path ="ExamineeInfo.txt";
	RegisterForm form;
	
    private Container c;
    private JLabel title;

    private JLabel fullNameLabel;
    private JTextField fullNameText;

    
    private JLabel cityNameLabel;
    private JTextField cityNameText;

    private JLabel passportNumberLabel;
    private JTextField passportNumberText;
    
    
    private JLabel genderLabel;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup genderGroup;
    
    private JLabel dobLabel;
    private JTextField dobText;
    
    private JButton submitButton,resetButton,loadButton;
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    
    
    private JLabel alertMessageLabel;
    String sDate1="14/10/2021"; 
    
    private String[]columns = {"Full Name","City Name","Passport Number","Gender","Date of Birth"};
    private String[]rows =new String[5];
    
//    private JLabel testDateLabel;
//    private JTextField testDateText;

	
	public RegisterForm(){
		
		    setTitle("About You");
	        setBounds(70, 90, 1200, 600);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	        setResizable(false);
	        
	        
		
	        c = getContentPane();
	        //c.setBackground(new Color(0x93CAFF));
	        c.setLayout(null);
	        
	        title = new JLabel("Register Here");
	        title.setFont(new Font("Serif", Font.PLAIN, 30));
	        title.setSize(600, 38);
	        title.setLocation(150, 30);
	        c.add(title);
	        
	       
	        fullNameLabel = new JLabel("Full Name");
	        fullNameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
	        fullNameLabel.setSize(200, 20);
	        fullNameLabel.setLocation(30, 100);
	        c.add(fullNameLabel);
	        
	        fullNameText = new JTextField();
	        fullNameText.setFont(new Font("Serif", Font.PLAIN, 15));
	        fullNameText.setSize(190, 20);
	        fullNameText.setLocation(150, 103);
	        c.add(fullNameText);
		
	        
	        cityNameLabel = new JLabel("City Name");
	        cityNameLabel.setFont(new Font("Serif", Font.PLAIN, 20));
	        cityNameLabel.setSize(200, 30);
	        cityNameLabel.setLocation(30, 150);
	        c.add(cityNameLabel);
	        
	        cityNameText = new JTextField();
	        cityNameText.setFont(new Font("Serif", Font.PLAIN, 15));
	        cityNameText.setSize(190, 20);
	        cityNameText.setLocation(150, 155);
	        c.add(cityNameText);
	        
	        
	        passportNumberLabel = new JLabel("Passport Number");
	        passportNumberLabel.setFont(new Font("Serif", Font.PLAIN, 20));
	        passportNumberLabel.setSize(200, 30);
	        passportNumberLabel.setLocation(30, 200);
	        c.add(passportNumberLabel);

	        passportNumberText = new JTextField();
	        passportNumberText.setFont(new Font("Serif", Font.PLAIN, 15));
	        passportNumberText.setSize(140, 20);
	        passportNumberText.setLocation(180, 208);
	        c.add(passportNumberText);

	        genderLabel = new JLabel("Gender");
	        genderLabel.setFont(new Font("Serif", Font.PLAIN, 20));
	        genderLabel.setSize(100, 20);
	        genderLabel.setLocation(30, 250);
	        c.add(genderLabel);

	        male = new JRadioButton("Male");
	        male.setFont(new Font("Serif", Font.PLAIN, 15));
	        male.setSelected(true);
	        male.setFocusable(false);
	        male.setSize(75, 20);
	        male.setLocation(150, 252);
	        c.add(male);

	        female = new JRadioButton("Female");
	        female.setFont(new Font("Serif", Font.PLAIN, 15));
	        female.setSelected(false);
	        female.setFocusable(false);
	        female.setSize(80, 20);
	        female.setLocation(230, 252);
	        c.add(female);
	        
	        genderGroup = new ButtonGroup();
	        genderGroup.add(male);
	        genderGroup.add(female);
	        
	        
	        
	        dobLabel = new JLabel("Date of Birth");
	        dobLabel.setFont(new Font("Serif", Font.PLAIN, 20));
	        dobLabel.setSize(110, 25);
	        dobLabel.setLocation(30, 300);
	        c.add(dobLabel);

	        dobText = new JTextField();
	        dobText.setFont(new Font("Serif", Font.PLAIN, 15));
	        dobText.setSize(190, 20);
	        dobText.setLocation(150,305);
	        c.add(dobText);
	        
//	        
//	        alertMessageLabel = new JLabel("You Successfully Registered for the exam. Your exam date is: "+sDate1);
//	        alertMessageLabel.setBounds(50, 450, 650, 80);
//	        alertMessageLabel.setFont(new Font("Serif",Font.PLAIN,20));
//	        alertMessageLabel.setForeground(Color.red);
//	        alertMessageLabel.setVisible(false);
//	        c.add(alertMessageLabel);
	        
	        
	        submitButton = new JButton("Submit");
	        submitButton.setFocusable(false);
			submitButton.setBounds(40, 380, 100, 30);
			submitButton.setFont(new Font("Arial",Font.PLAIN,15));
			submitButton.addActionListener(this);
			c.add(submitButton);
			
		     
	        resetButton = new JButton("Reset");
	        resetButton.setFocusable(false);
	        resetButton.setBounds(140, 380, 100, 30);
		    resetButton.setFont(new Font("Arial",Font.PLAIN,15));
		    resetButton.addActionListener(this);
			c.add(resetButton);
	        
			loadButton = new JButton("Load Examinee Data");
			loadButton.setFocusable(false);
			loadButton.setBounds(630, 380, 250, 40);
			loadButton.setFont(new Font("Arial",Font.PLAIN,15));
			loadButton.addActionListener(this);
			c.add(loadButton);
			
			
			
			model = new DefaultTableModel();
			model.setColumnIdentifiers(columns);
	        
			
			table = new JTable();
			table.setModel(model);
			table.setRowHeight(60);
			
			scroll = new JScrollPane(table);
			scroll.setBounds(400, 100, 740, 265);
			c.add(scroll);
			
			
			

			
			
	        loadData();
	        setVisible(true);

	        
	        
	        
	        
	        
	}

@Override
public void actionPerformed(ActionEvent e) {
	
	
	
	
	if(e.getSource()==resetButton) {
		
		fullNameText.setText("");
		cityNameText.setText("");
		passportNumberText.setText("");
		male.setSelected(true);
		dobText.setText("");
		
	}
	
	
//	if(e.getSource()==loadButton) {
//		
//		String gender;
//		
//		if(male.isSelected()) {
//			gender ="Male";
//		}
//		else {
//			gender ="Female";
//		}
//		rows[0]= fullNameText.getText();
//		rows[1]= cityNameText.getText();
//		rows[2]= passportNumberText.getText();
//		rows[3]= gender;
//		rows[4]= dobText.getText();
//		model.addRow(rows);
//		
//	}
//	
	  
	if (e.getSource() == submitButton){
    	String gender;
    	if(male.isSelected()) {
    		gender = "Male";
    	}
    	else {
    		gender ="Female";
    	}
    	
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
		String strDate = dateFormat.format(date); 
		
	    //String sDate1="14/10/2021";  
	    try {
			Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e1) {
			
			e1.printStackTrace();
		} 
    	Examinee examinee = new Examinee(
    			
    			fullNameText.getText(),
    			cityNameText.getText(),
    			passportNumberText.getText(),
    			gender,
    			dobText.getText(),
    			date
    			);
    	
    	//alertMessageLabel.setVisible(true);
        JOptionPane.showMessageDialog(null, "You Successfully Registered for the exam. Your exam date is: "+sDate1);
    	
        //form = new RegisterForm();
    	try {
    		writeData(examinee);
    		loadData();
    		}
    	catch (IOException e1) {
			
			e1.printStackTrace();
		}
    	
		
    	
   }//End Of Submit Button
	

    	
}



void writeData(Examinee examinee) throws IOException {
	ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(path));
	objectOut.writeObject(examinee);
	objectOut.close();
}
void loadData() {
	try {
	    ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(path));
	    //Object object = objectIn.readObject()
		Examinee readExaminee = (Examinee)  objectIn.readObject();
		objectIn.close();
		rows[0]= readExaminee.getFullName();
		rows[1]= readExaminee.getCityName();
		rows[2]= readExaminee.getPassportNumber();
		rows[3]= readExaminee.getGender();
		rows[4]= readExaminee.getDob();
		model.addRow(rows);
	} catch (ClassNotFoundException | IOException e1) {
		e1.printStackTrace();
	}
}
	
}	
	

