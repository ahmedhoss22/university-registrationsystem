package project;

import java.time.YearMonth;
import java.util.Arrays;
import java.util.InputMismatchException;

public class university {
	private String[] name=new String[3];  // first-middle-last name 1st Question
	private static int counter =-1;  // used in registration number
	private String registerationNumber;   // should created auto
	private String nationality;  // 3
	private int nationalId;    // 4-a
	private String typeOfId;   //  4-b
	private address studentAddress;   // object contain the req. in question 5 
	private int[] dateOfBirth=new int[3]; // index 0 for day , index 1 for month , index 2 for year    //7
	private int age ;   //7
	private String gender;  // 8
	private int[] firstEnrolment=new int[2]; //9   index 0 (term)  , index 1 (year)
	private String department;  // 10
	protected int currentTerm; // 12
	private String typeOfFunding;      //13-a
	private static int numberOfPaymentsDone;  //13-b
	protected static int totalAmountPaid;       //13-c
	private static payments[] paymentDetails=new payments[numberOfPaymentsDone];  //13-d
	private static int transactionNumber=0;  //13 D) 2
	private String email; 		//14
	private int homePhone;		//14
	private int mobileNumber;	//14
	protected int totalHoursNumber;	
//	////////////////////////////////////////////////////////////////////
public university () {
	counter ++ ;
}
public  String getCounter() {
	if (counter <10) {
		return "000"+ counter;
	}
	else if(counter<100) {
		return "00"+ counter;
	}
	else if(counter<1000) {
		return "0"+ counter;
	}
	else {return Integer.toString(counter);}
}
////////////////////////////////////////////////////////////////// 1
public void setName(String first,String middle,String last) throws InputMismatchException{
	this.name[0]=first;
	this.name[1]=middle;
	this.name[2]=last;
}
public String getName() {
	return name[0]+" "+name[1]+" "+name[2];
}
// //////////////////////////////////////////////////////////////  2
   public String getRegisterationNumber() {
	   registerationNumber=YearMonth.now().getYear()+university.getCurrentTerm()+25+"01"+this.getCounter();
	   return registerationNumber;
   }

//   ////////////////////////////////////////////////// //3
   public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) throws InputMismatchException{
		this.nationality = nationality;
	}
////////////////////////////////////////////////////////4
	public int getNationalId() {
		return nationalId;
	}
	public void setNationalId(int nationalId) throws InputMismatchException{
		this.nationalId = nationalId;
	}
	public String getTypeOfId() {
		return typeOfId;
	}
	public void setTypeOfId(String typeOfId) throws InputMismatchException{
		this.typeOfId = typeOfId;
	}
	public boolean isValidity() {
		return this.age>=16 && this.age<=23;
	}
// ////////////////////////////////////////////////////	5
	public void setStudentAddress(int flatNumber, int houseNumber, String streetName, String distinctName, String cityName,
			String government, String country, int postalCode) throws InputMismatchException{
		studentAddress=new address(flatNumber,houseNumber,streetName,distinctName,cityName,government,country,postalCode);
		}
	public String getStudentAddress() {
		return 		studentAddress.toString();
	}
//	///////////////////////////////////////////////////// //6
	public String getStudentMailingAddress() {
	return studentAddress.toString();
	}
//	////////////////////////////////////////////////////
public int getAge() {  												 // 7
     this.age = YearMonth.now().getYear()-dateOfBirth[2];      
    	 return age;	}

public String getDateOfBirth() {
	return dateOfBirth[2]+"/"+dateOfBirth[1]+"/"+dateOfBirth[0];
}
public void setDateOfBirth(int day,int month,int year) {
	this.dateOfBirth[0]=day;
	this.dateOfBirth[1]=month;
	this.dateOfBirth[2]=year;
}
/////////////////////////////////////////////////////////// //8
public String getGender() {
	return gender;
}
public void setGender(String gender) throws InputMismatchException{
	this.gender = gender;
}
////////////////////////////////////////////////////// //9
public String getFirstEnrolment() {
	return firstEnrolment[0]+"/"+firstEnrolment[1]  ;
}
public void setFirstEnrolment(int term,int year) throws InputMismatchException{
	this.firstEnrolment[0] = term;
	this.firstEnrolment[1] = year;

}
////////////////////////////////////////////////////////         //10
public String getDepartment() {
	return department;
}
public void setDepartment(String department) throws InputMismatchException{
	this.department = department;
}
///////////////////////////////////////////////////////
public static int getCurrentTerm() {                                         //12
	courses test=new courses("finshed",true);
	if((test.getTotalCreditHours()/17)%2==0)	{
		return 1;}
		else {return 2;}
}
///////////////////////////////////////////////////////////    13 -a
public String getTypeOfFunding() {
	return typeOfFunding;
}
public void setTypeOfFunding(String typeOfFunding) throws InputMismatchException{
	this.typeOfFunding = typeOfFunding;
}
//////////////////////////////////////////////////////////////   13-b
public static int getNumberOfPaymentsDone() {
	return numberOfPaymentsDone;
}
public static void setNumberOfPaymentsDone(int numberOfPaymentsDone) throws InputMismatchException{
	university.numberOfPaymentsDone = numberOfPaymentsDone;
}
///////////////////////////////////////////////////////////////     13-c
public static int getTotalAmountPaid() {
	return totalAmountPaid;
}
/////////////////////////////////////////////////////////////        13-d
public String getPaymentDetails() {
	return paymentDetails.toString();
}
public void setPaymentDetails(double amountPaid, String bankOfTransaction, String dateOfTransaction) {
	paymentDetails[transactionNumber]=new payments(amountPaid,bankOfTransaction,dateOfTransaction);
	 transactionNumber++;  //13 D) 2

}
public int getTransactionNumber() {
	return transactionNumber;
}
///////////////////////////////////////////////////////////   14
public String getEmail() {
	return email;
}

public void setEmail(String email) throws InputMismatchException{
	this.email = email;
}
public int getHomePhone() {
	return homePhone;
}
public void setHomePhone(int homePhone) throws InputMismatchException{
	this.homePhone = homePhone;
}
public int getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(int mobileNumber) throws InputMismatchException{
	this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "name=" + Arrays.toString(name) +"\n"+ ", registerationNumber=" + registerationNumber
			+"\n"+ ", nationality=" + nationality +"\n"+ ", nationalId=" + nationalId +"\n"+ ", typeOfId=" + typeOfId
			 +"\n"+ ", dateOfBirth=" + Arrays.toString(dateOfBirth) +"\n"+ ", age=" + age
			+"\n"+ ", gender=" + gender +"\n"+ ", currentTerm=" + currentTerm +"\n"+ ", typeOfFunding=" + typeOfFunding
			+"\n"+ ", homePhone=" + homePhone +"\n"+ ", mobileNumber=" + mobileNumber ;
}

}