package project;

import java.io.Serializable;
import java.util.Date;

//Implemented Serializable interface
public class Examinee  implements Serializable {

	  //Attributes 
	    private String fullName;
	    private String cityName;
	    private String passportNumber;
	    private String gender;
	    private String dob;
	    private Date testDate;
	    
	    //Create a blank constructor for our purpose.
	    public Examinee() {
	    	
	    }
	    
	    //create a parameterized constructor
		public Examinee(String fullName, String cityName, String passportNumber, String gender, String dob , Date testDate) {
			super();
			this.fullName = fullName;
			this.cityName = cityName;
			this.passportNumber = passportNumber;
			this.gender = gender;
			this.dob = dob;
			this.testDate = testDate;
		}
		
		
		//Set and get methods
		
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		
		
		public String getFullName() {
			return fullName;
		}
		
		
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		
		
		public String getCityName() {
			return cityName;
		}
		
		
		public void setPassportNumber(String passportNumber) {
			this.passportNumber = passportNumber;
		}
		
		
		public String getPassportNumber() {
			return passportNumber;
		}
		
		
		public void setGender(String gender) {
			this.gender = gender;
		}
		
		
		public String getGender() {
			return gender;
		}
		
		
		public void setDob(String dob) {
			
			this.dob = dob;
		}
		
		public String getDob() {
			
			return dob;
		}
		
		
	    public void setTestDate(Date testDate) {
			this.testDate = testDate;
		}
		
		public Date getTestDate() {
			return testDate;
		}
		
		
		 
	    public String toString() {
	    	
	    	return fullName+"\n"+
	    	       cityName+"\n"+
	    		   passportNumber+"\n"+
	    	       gender+"\n"+
	    		   dob+"\n"+
	    	       testDate;
	    	
	    }

//	   
//	    this.fullName = fullName;
//		this.cityName = cityName;
//		this.passportNumber = passportNumber;
//		this.gender = gender;
//		this.dob = dob;
//		this.testDate = testDate;


	
	
	
}
