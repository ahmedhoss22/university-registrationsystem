package project;

import java.util.InputMismatchException;

public class courses extends university{
	private static double counter=0;  //used in 16-a to calculate overall GPA , GPA is double to return the decimal value of GPA
	private String typeOfCourse;
	private String tutorName;  //11
	private int tutorCode;     //11

	private   static int maximumCreditHours=140;           // 15-a
	protected static int finshedCreditHours;    // should computed from the array of object through the finshed cousrses      // 15-b
	private static int currentCreditHours;
	private   static int  remainingCreditHours;         // 15-d
	
	private static double overallGPA;  				  // 16 a)
	private static int finshedSemesters;     // 			      // 16 b) if finshedGPA =0 then overallGPA=0
	private static double[] semestersGPAs=new double[10]; // 16 c)  
	
	private int coursesNumber;          // 17-1
	private static int totalCreditHours;       // 17 -2 + 15-b +15-c it will be the finshed credit hours in the array of object finishedCourses
	private int courseCode;   		// 17-3
	private String courseName;	    // 17-4
	private int courseCreditHours; 	    // 17-5
	private int numberTimes;            // 17-6
	private int semesterOfCourse;       // 17-7
	private int yearOfCourse;           // 17-8
	private String [] courseTutor =new String[3];  // 17-9     rows ( [0]lecturer  - [1]GTA -[2] GTA lab)
	private double[] marksOutOf30=new double[7];        // 17-11
	private double[] marksOutOf20=new double[12];       // 17-12
	private double yearWork;                            // 17-13    out of 10 marks  
    private double finalExam;                           // 17-14    out of 40 marks 
	private double sumOfMarks;                          // 17-15    out of 100 marks
	private double grade;							    // 17-16
	private String absencePercentage;                   // 17-17
	private int numberOfAbsence;						// 17-17
	
	
//	////////////////////////////////////////////////////////////////////////////////////
	public courses(String typeOfCourse,boolean x) {//12  used to get the current term through to pervent the counter from counting 
		this.typeOfCourse=typeOfCourse;
	}  
	public courses(String typeOfCourse) throws illegalTypeOfCourse{
		this.typeOfCourse=typeOfCourse;
		if(typeOfCourse=="finshed") {counter++;}                       //used in 16-a to calculate overall GPA
		if(counter==6 || counter==12 || counter==18 || counter==24 || counter==30 || counter==36 || counter==42 || counter==48 || counter==54 || counter==60) {
			this.setSemestersGPAs();    //16-c 
	}
		}
		////////////////////////////////////////////////////////////////////////////15-a
		public void setMaximumCreditHours(int max) throws InputMismatchException{
		maximumCreditHours=max;
		}
		public int getMaximumCreditHours() {
		return maximumCreditHours;
		}
//		////////////////////////////////////////////////////////////15-b
		public int getFinshedCreditHours() {
			return finshedCreditHours;
		}
		private void setFinshedCreditHours(int finshedCreditHour) throws InputMismatchException{
			courses.finshedCreditHours=finshedCreditHour;   // the finshedCreditHour set through setCourseCreditHours method in 17-5
 		}
		/////////////////////////////////////////////////////////// 15-c	
		public int getCurrentCreditHours1() {
			return currentCreditHours;
		}
		private void setCurrentCreditHours(int currentCreditHour) throws InputMismatchException{
			courses.currentCreditHours=currentCreditHour;   // the currentCreditHour set through setCourseCreditHours method in 17-5
 		}
		//////////////////////////////////////////////////////////////////////////15-d
		public int getRemainingCreditHours() {
		 remainingCreditHours=courses.maximumCreditHours - finshedCreditHours-currentCreditHours;
		 return remainingCreditHours;
		}
//		////////////////////////////////////////////////////////////////////////////16-a
		public double  getOverallGPA() {
			return overallGPA/counter;
		} 
//		////////////////////////////////////////////////////////////////////////////16-b

		public int getfinshedSemesters() {
			finshedSemesters=super.getCurrentTerm()-1;	
			return finshedSemesters;
		}
				//////////////////////////////////////////////////////////////////16-c  *important* must call the setter before the getter to 
				public String getSemestersGPAs() {
					return semestersGPAs.toString();
				}
				public void setSemestersGPAs() {
					switch((int)this.counter) {    //16 c) to set the semsersGPAs
					case(6):
						semestersGPAs[0]=this.getOverallGPA();
					break;
					case(12):
						semestersGPAs[1]=this.getOverallGPA()-semestersGPAs[0];
					break;
					case(18):
						semestersGPAs[2]=this.getOverallGPA()-semestersGPAs[1]-semestersGPAs[0];
					break;
					case(24):
						semestersGPAs[3]=this.getOverallGPA()-semestersGPAs[2]-semestersGPAs[1]-semestersGPAs[0];
					break;
					case(30):
						semestersGPAs[4]=this.getOverallGPA()-semestersGPAs[3]-semestersGPAs[2]-semestersGPAs[1]-semestersGPAs[0];
					break;
					case(36):
						semestersGPAs[5]=this.getOverallGPA()-semestersGPAs[4]-semestersGPAs[3]-semestersGPAs[2]-semestersGPAs[1]-semestersGPAs[0];
					break;
					case(42):
						semestersGPAs[6]=this.getOverallGPA()-semestersGPAs[5]-semestersGPAs[4]-semestersGPAs[3]-semestersGPAs[2]-semestersGPAs[1]-semestersGPAs[0];
					break;
					case(48):
						semestersGPAs[7]=this.getOverallGPA()-semestersGPAs[6]-semestersGPAs[5]-semestersGPAs[4]-semestersGPAs[3]-semestersGPAs[2]-semestersGPAs[1]-semestersGPAs[0];
					break;
					case(54):
						semestersGPAs[8]=this.getOverallGPA()-semestersGPAs[7]-semestersGPAs[6]-semestersGPAs[5]-semestersGPAs[4]-semestersGPAs[3]-semestersGPAs[2]-semestersGPAs[1]-semestersGPAs[0];
					break;
					case(60):
						semestersGPAs[9]=this.getOverallGPA()-semestersGPAs[8]-semestersGPAs[7]-semestersGPAs[6]-semestersGPAs[5]-semestersGPAs[4]-semestersGPAs[3]-semestersGPAs[2]-semestersGPAs[1]-semestersGPAs[0];
					break;
					}
				}
					
//		//////////////////////////////////////////////////////////////////////////17-1
		public void setCoursesNumber(int CoursesNumber)throws InputMismatchException{
			this.coursesNumber=CoursesNumber;
		}
		public int getCoursesNumber() {
			return coursesNumber;
		}
//		////////////////////////////////////////////////////////////////////////17-2
		public int getTotalCreditHours() {
			return totalCreditHours;
		}
//		///////////////////////////////////////////////////////////////////////// 17-3
		public int getCourseCode() {
			return courseCode;
		}
		public void setCourseCode(int courseCode) throws InputMismatchException{
			this.courseCode = courseCode;
		}
//		///////////////////////////////////////////////////////////////////////////////////17-4
		public String getCourseName() {
			return courseName;
		}
		public void setCourseName(String courseName) throws InputMismatchException{
			this.courseName = courseName;
		}
//		/////////////////////////////////////////////////////////////////////////////17-5
		public int getCourseCreditHours() {
			return courseCreditHours;
		}
		public void setCourseCreditHours(int courseCreditHours) throws InputMismatchException{
			this.courseCreditHours = courseCreditHours;
			totalCreditHours+=courseCreditHours;
			if(this.typeOfCourse=="current") {              //15-c
				this.setCurrentCreditHours(courseCreditHours);
			}
			else if(this.typeOfCourse=="finshed") {
				this.setFinshedCreditHours(courseCreditHours);  // 15-b
			}
		}
//		////////////////////////////////////////////////////////////////////////////17-6
		public int getNumberTimes() {
			return numberTimes;
		}
		public void setNumberTimes(int numberTimes) throws InputMismatchException{
			this.numberTimes = numberTimes;
		}
//		//////////////////////////////////////////////////////////////////////////17-7
		public int getSemesterOfCourse() {
			return semesterOfCourse;
		}
		public void setSemesterOfCourse(int semesterOfCourse) throws InputMismatchException{
			this.semesterOfCourse = semesterOfCourse;
		}
//		//////////////////////////////////////////////////////////////////////////17-8
		public int getYearOfCourse() {
			return yearOfCourse;
		}
		public void setYearOfCourse(int yearOfCourse) throws InputMismatchException{
			this.yearOfCourse = yearOfCourse;
		}
//		//////////////////////////////////////////////////////////////////////////////17-9
		public void setCourseTutor(String lecturer,String GTA,String GTALab) {
			courseTutor[0]=lecturer;
			courseTutor[1]=GTA;
			courseTutor[2]=GTA;
		}
		public String getCourseTutor() {
			return courseTutor[0]+"/"+courseTutor[1]+"/"+courseTutor[2];
		}	
		
		//////////////////////////////////////////////////////////////////////////17-11
	public double getMarksOutOf30(int index) throws InputMismatchException,IndexOutOfBoundsException{         
		return marksOutOf30[index]; 
	}
	public void setMarksOutOf30(int x,double mark) throws InputMismatchException,IndexOutOfBoundsException{
		this.marksOutOf30[x] =mark;
	}
//	//////////////////////////////////////////////////////////////////////  17-12
	public double getMarksOutOf20(int index) throws InputMismatchException,IndexOutOfBoundsException{         
		
		return marksOutOf20[index];       
	}
	public void setMarksOutOf20(int x,double mark) throws InputMismatchException,IndexOutOfBoundsException{
		this.marksOutOf20 [x] =mark;
	}
//	///////////////////////////////////////////////////////////////////////17-13	
	public double getYearWork() {
		return yearWork;
	}
	public void setYearWork(double yearWork) throws InputMismatchException{
		this.yearWork = yearWork;
	}
//	//////////////////////////////////////////////////////////////////////17-14
	public double getFinalExam() {
		return finalExam;
	}
	public void setFinalExam(double finalExam) throws InputMismatchException{
		this.finalExam = finalExam;
	}
//	////////////////////////////////////////////////////////////////////////////17-15
	public double getSumOfMarks() {		
		double sumOfMarksOutOf20=0;
		double sumOfMarksOutOf30=0;
			for(int i=0;i<7;i++) {marksOutOf30[i]+= sumOfMarksOutOf30;}     //  calculate the sum of marks
			for(int i=0;i<12;i++) {marksOutOf30[i]+= sumOfMarksOutOf20;}     //  calculate the sum of marks
		this.sumOfMarks=(sumOfMarksOutOf20+sumOfMarksOutOf30+this.getFinalExam()+this.yearWork)/4;  // save the sum of marks ,this statement instead of setter   
		return (sumOfMarksOutOf20+sumOfMarksOutOf30+this.getFinalExam()+this.yearWork)/4;
	}
////////////////////////////////////////////////////////////////////////////////17-16
	public String getGrade() {
		
		
	
		if (this.getSumOfMarks()>=90) {this.grade=4.0;overallGPA+=4.0;return "A";}
		else if(this.getSumOfMarks()>=85) {this.grade=3.67;overallGPA+=3.67; return "A-";}
		else if(this.getSumOfMarks()>=80) {this.grade=3.3;overallGPA+=3.3; return "B+";}
		else if(this.getSumOfMarks()>=75) {this.grade=3.0;overallGPA+=3.0; return "B";}
		else if(this.getSumOfMarks()>=70) {this.grade=2.7;overallGPA+=2.7; return "B-";}
		else if(this.getSumOfMarks()>=65) {this.grade=2.3;overallGPA+=2.3; return "C+";}
		else if(this.getSumOfMarks()>=60) {this.grade=2.0;overallGPA+=2.0; return "C";}
		else if(this.getSumOfMarks()>=55) {this.grade=1.7;overallGPA+=1.7; return "C-";}
		else if(this.getSumOfMarks()>=50) {this.grade=1.3;overallGPA+=1.3; return "D";}
		else {return "F";}
	}
//	/////////////////////////////////////////////////////////////////////////////////17-17
	public String getAbsencePercentage() {
		return absencePercentage;
	}
	public void setNumberOfAbsence(int numberOfAbsence) throws InputMismatchException{
		this.numberOfAbsence = numberOfAbsence;
		this.absencePercentage=(numberOfAbsence/12)*100+"%";
	}
	

	
	











}
