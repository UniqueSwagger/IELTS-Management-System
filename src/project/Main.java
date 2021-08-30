package project;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
	
	
	//static String path ="ExamineeInfo.txt";

	public static void main(String[] args) throws IOException, ClassNotFoundException, ParseException {
		
//	    Date date = new Date();
//        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");
//		String strDate = dateFormat.format(date); 
//		
//		  String sDate1="19/08/2021";  
//		  Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1); 
//		
//	
//         Examinee examinee = new Examinee("Mahi Rahman","Sylhet","198625795448698","Male","09/01/1997",date1);
//	     Main main = new Main();
//	
//	
//	     main.writeObject(path, examinee);
//	     Examinee readExaminee = (Examinee) main.readObjectFromFile(path);
//	
//	     System.out.println("Name: "+readExaminee.getFullName()+"\n"+
//                   "City: "+readExaminee.getCityName()+"\n"+
//			           "Passport no: "+readExaminee.getPassportNumber()+"\n"+
//	                   "Gender: "+readExaminee.getGender()+"\n"+
//			           "Date of Birth: "+readExaminee.getDob()+"\n"+
//			           "Test date: "+readExaminee.getTestDate());
	     
	     
	    
		
		TakeAnExam takeAnExam = new TakeAnExam();
		
		

	}
	
	//Created writeObject method to write a save any object (save data)
//	public void writeObject(String path, Object object) throws IOException {
//		ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(path));
//		objectOut.writeObject(object);
//		objectOut.close();
//		
//	}
//	
//	//Created readObjectFromFile method to read object from file. (read/Collect/load data)
//	public Object readObjectFromFile(String path) throws IOException, ClassNotFoundException {
//		 
//        ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(path));
//        Object object = objectIn.readObject();
//        objectIn.close();
//        return object;
//    }
	
	
}
