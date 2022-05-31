package project;

import java.awt.EventQueue;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JTree;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.swing.JDesktopPane;
public class system extends JFrame {
	private  JPanel contentPane;
	private static JTextField first;
	private static JTextField middle;
	private static JTextField last;
	private static JTextField nationality;
	private static JTextField nationalityID;
	private static JLabel lblNewLabel_5;
	private static JTextField flatNumber;
	private static JLabel lblNewLabel_6;
	private static JTextField houseNumber;
	private static JTextField streetName;
	private static JTextField districtName;
	private static JTextField governotayrName;
	private static JTextField country;
	private static JLabel lblNewLabel_15;
	private static JSpinner month;
	private static JLabel lblNewLabel_13;
	private static JSpinner year;
	private static JTextField postalCode;
	private static JTextField bankOfTransaction;
	private static JTextField dateOfTransaction;
	private static JTextField courseCode;
	private static JTextField courseName;
	private static JTextField courseLcturer;
	private static JTextField courseGTA;
	private static JTextField courseLabGTA;
	static      ButtonGroup  group=new ButtonGroup();
	static JComboBox type = new JComboBox();
	static	JComboBox termOfEnrolment = new JComboBox();
	static	JSpinner yearOfEnrolment = new JSpinner();
	static JTextArea screen = new JTextArea();
	JButton saveStudentData = new JButton("Save");
	static	JButton showStudentData = new JButton("Show data");
	static	JButton addPayments = new JButton("Add");
	static JComboBox typeOfFunding = new JComboBox();
	static JSpinner numberOfPayments = new JSpinner();
	static JButton showPayments = new JButton("Show data");
	static	JButton addCourse = new JButton("Add");
	static	JSpinner maxCreditHours = new JSpinner();
	static	int   counter =-1;
	static JComboBox courseType = new JComboBox();
	courses[]finishedCourses=new courses[100];
	courses[]currentCourses=new courses[8];
	static File f=new File("student1.txt");
	
	
	payments pay;
	static university std=new university();
	static address stda ;
	private JTextField cityName;
	private JTextField amount;
	/**
	 * Launch the application.
	 * @throws InputMismatchException 
	 */
	public static void main(String[] args) throws InputMismatchException {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					system frame = new system();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public system() {
		setResizable(false);
		setTitle("University System");
		
		

			
			

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1218, 833);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("First name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		first = new JTextField();
		first.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Middle name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		middle = new JTextField();
		middle.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Last name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		last = new JTextField();
		last.setColumns(10);
		
		nationality = new JTextField();
		nationality.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Nationality");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_4 = new JLabel("Nationality ID");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		nationalityID = new JTextField();
		nationalityID.setColumns(10);
		
		lblNewLabel_5 = new JLabel("Flat number");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		flatNumber = new JTextField();
		flatNumber.setColumns(10);
		
		lblNewLabel_6 = new JLabel("House number");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		houseNumber = new JTextField();
		houseNumber.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Type of ID");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		type.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		type.setModel(new DefaultComboBoxModel(new String[] {" National ID", "Passport"}));
		
		JLabel lblNewLabel_8 = new JLabel(" Street name");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		streetName = new JTextField();
		streetName.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("District name");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		districtName = new JTextField();
		districtName.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel(" Governorate name");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		governotayrName = new JTextField();
		governotayrName.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Country");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		country = new JTextField();
		country.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Postal code");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner day = new JSpinner();
		day.setModel(new SpinnerNumberModel(1, 1, 31, 1));
		
		JLabel lblNewLabel_14 = new JLabel("Day");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		lblNewLabel_15 = new JLabel("Month");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		month = new JSpinner();
		month.setModel(new SpinnerNumberModel(1, 1, 12, 1));
		
		lblNewLabel_13 = new JLabel("Year");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, ١٥));
		
		year = new JSpinner();
		year.setModel(new SpinnerNumberModel(2000, 1980, 2022, 1));
		
		postalCode = new JTextField();
		postalCode.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Gender");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JRadioButton male = new JRadioButton("male");
		male.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JRadioButton female = new JRadioButton("Female");
		female.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_17 = new JLabel("Term of enrolment");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		termOfEnrolment.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		termOfEnrolment.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		
		JLabel lblNewLabel_18 = new JLabel("Year of enrolment");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		yearOfEnrolment.setModel(new SpinnerNumberModel(2000, 2000, 2022, 1));
		
		JLabel lblNewLabel_19 = new JLabel("University registration system");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, ١٨));
		
		JLabel lblNewLabel_20 = new JLabel("Department");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JComboBox Deoartment = new JComboBox();
		Deoartment.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		Deoartment.setModel(new DefaultComboBoxModel(new String[] {"General", "AI", "Business", "Health care", "Cyber Security", "Media"}));
		
		JLabel lblNewLabel_21 = new JLabel("Payments");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, ١٨));
		
		JLabel lblNewLabel_22 = new JLabel("Type of funding");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		typeOfFunding.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		typeOfFunding.setModel(new DefaultComboBoxModel(new String[] {"cash", "visa"}));
		
		JLabel lblNewLabel_23 = new JLabel("Number of payments done");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		numberOfPayments.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		
		JLabel lblNewLabel_24 = new JLabel("Amount");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_25 = new JLabel("Bank of transaction");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		bankOfTransaction = new JTextField();
		bankOfTransaction.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Date of transaction");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		dateOfTransaction = new JTextField();
		dateOfTransaction.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Maximum credit Hours");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		maxCreditHours.setModel(new SpinnerNumberModel(120, 120, 150, 1));
		
		JLabel lblNewLabel_28 = new JLabel("Courses");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, ١٨));
		
		courseType.setModel(new DefaultComboBoxModel(new String[] {"Finshed", "Current"}));
		courseType.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_29 = new JLabel("Number of courses");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner NumberOfCourses = new JSpinner();
		NumberOfCourses.setModel(new SpinnerNumberModel(30, 30, 50, 1));
		NumberOfCourses.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_30 = new JLabel("Course Code");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		courseCode = new JTextField();
		courseCode.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Course Name");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		courseName = new JTextField();
		courseName.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("Course credit hours");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_33 = new JLabel("Type of course");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner courseCreditHoure = new JSpinner();
		courseCreditHoure.setModel(new SpinnerNumberModel(1, 1, 3, 1));
		courseCreditHoure.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_34 = new JLabel("Number of times taking course");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, ١٤));
		
		JSpinner NumberOfTimesTakingCourse = new JSpinner();
		NumberOfTimesTakingCourse.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		NumberOfTimesTakingCourse.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_35 = new JLabel("Date of birth:");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_36 = new JLabel("semester/year");
		lblNewLabel_36.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JComboBox semesterOfCourse = new JComboBox();
		semesterOfCourse.setModel(new DefaultComboBoxModel(new String[] {"1", "2"}));
		semesterOfCourse.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner yearOfCourse = new JSpinner();
		yearOfCourse.setModel(new SpinnerNumberModel(2020, 2000, 2022, 1));
		
		JLabel lblNewLabel_37 = new JLabel("Course lecturer name");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		courseLcturer = new JTextField();
		courseLcturer.setColumns(10);
		
		JLabel lblNewLabel_38 = new JLabel("Course GTA name");
		lblNewLabel_38.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		courseGTA = new JTextField();
		courseGTA.setColumns(10);
		
		JLabel lblNewLabel_39 = new JLabel("Course lab GTA");
		lblNewLabel_39.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		courseLabGTA = new JTextField();
		courseLabGTA.setColumns(10);
		
		addPayments.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		showPayments.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_40 = new JLabel("Marks out of  30");
		lblNewLabel_40.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf301 = new JSpinner();
		outOf301.setModel(new SpinnerNumberModel(new Float(15), new Float(1), new Float(30), new Float(0)));
		outOf301.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf302 = new JSpinner();
		outOf302.setModel(new SpinnerNumberModel(new Float(15), new Float(1), new Float(30), new Float(0)));
		outOf302.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf303 = new JSpinner();
		outOf303.setModel(new SpinnerNumberModel(new Float(15), new Float(1), new Float(30), new Float(0)));
		outOf303.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf304 = new JSpinner();
		outOf304.setModel(new SpinnerNumberModel(15, 1, 30, 1));
		outOf304.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf305 = new JSpinner();
		outOf305.setModel(new SpinnerNumberModel(15, 1, 30, 1));
		outOf305.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf306 = new JSpinner();
		outOf306.setModel(new SpinnerNumberModel(15, 1, 30, 1));
		outOf306.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf307 = new JSpinner();
		outOf307.setModel(new SpinnerNumberModel(15, 1, 30, 1));
		outOf307.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel outOf20 = new JLabel("Marks out of  20");
		outOf20.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf201 = new JSpinner();
		outOf201.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf201.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf202 = new JSpinner();
		outOf202.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf202.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf203 = new JSpinner();
		outOf203.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf203.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf204 = new JSpinner();
		outOf204.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf204.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf205 = new JSpinner();
		outOf205.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf205.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf206 = new JSpinner();
		outOf206.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf206.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf207 = new JSpinner();
		outOf207.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf207.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf208 = new JSpinner();
		outOf208.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf208.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf209 = new JSpinner();
		outOf209.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf209.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf2010 = new JSpinner();
		outOf2010.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf2010.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf2011 = new JSpinner();
		outOf2011.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf2011.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner outOf2012 = new JSpinner();
		outOf2012.setModel(new SpinnerNumberModel(10, 1, 20, 1));
		outOf2012.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_41 = new JLabel("Year work");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner yearWork = new JSpinner();
		yearWork.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		yearWork.setModel(new SpinnerNumberModel(5, 1, 10, 1));
		
		JLabel lblNewLabel_42 = new JLabel("Final exam");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(20, 0, 40, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JDesktopPane desktopPane = new JDesktopPane();
		screen.setEditable(false);
		
		addCourse.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		saveStudentData.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		showStudentData.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JButton showCoursesData = new JButton("Show data");
		showCoursesData.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		JLabel lblNewLabel_43 = new JLabel("City name");
		lblNewLabel_43.setFont(new Font("Tahoma", Font.PLAIN, ١٦));
		
		cityName = new JTextField();
		cityName.setColumns(10);
		
		amount = new JTextField();
		amount.setColumns(10);
		
		JButton Exit = new JButton("Exit");
		Exit.setFont(new Font("Tahoma", Font.PLAIN, ١٧));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(214)
							.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 318, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(30)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(lblNewLabel_32)
																.addComponent(lblNewLabel_37))
															.addGap(4)
															.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addComponent(courseCreditHoure, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(lblNewLabel_34))
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addComponent(courseLcturer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.UNRELATED)
																	.addComponent(lblNewLabel_38, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
															.addPreferredGap(ComponentPlacement.RELATED)
															.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(courseGTA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addComponent(NumberOfTimesTakingCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																	.addGap(29)
																	.addComponent(lblNewLabel_39)
																	.addGap(18)
																	.addComponent(courseLabGTA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(day, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
																.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
																	.addGroup(gl_contentPane.createSequentialGroup()
																		.addComponent(lblNewLabel_22, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(typeOfFunding, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
																	.addGroup(gl_contentPane.createSequentialGroup()
																		.addComponent(lblNewLabel_18, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(ComponentPlacement.RELATED)
																		.addComponent(yearOfEnrolment, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)))
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addComponent(lblNewLabel_24, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE)
																	.addGap(2)
																	.addComponent(amount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
															.addGap(18)
															.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																		.addGroup(gl_contentPane.createSequentialGroup()
																			.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
																			.addGap(6))
																		.addGroup(gl_contentPane.createSequentialGroup()
																			.addComponent(lblNewLabel_15, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
																			.addPreferredGap(ComponentPlacement.RELATED)))
																	.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_contentPane.createSequentialGroup()
																			.addComponent(Deoartment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addGap(178)
																			.addComponent(showStudentData, GroupLayout.PREFERRED_SIZE, 136, GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_contentPane.createSequentialGroup()
																			.addComponent(month, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
																			.addGap(28)
																			.addComponent(lblNewLabel_13, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
																			.addPreferredGap(ComponentPlacement.RELATED)
																			.addComponent(year, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
																			.addGap(18)
																			.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
																			.addPreferredGap(ComponentPlacement.UNRELATED)
																			.addComponent(termOfEnrolment, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))))
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_contentPane.createSequentialGroup()
																			.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																				.addComponent(lblNewLabel_21, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblNewLabel_23))
																			.addPreferredGap(ComponentPlacement.RELATED)
																			.addComponent(numberOfPayments, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
																		.addGroup(gl_contentPane.createSequentialGroup()
																			.addComponent(lblNewLabel_25)
																			.addPreferredGap(ComponentPlacement.UNRELATED)
																			.addComponent(bankOfTransaction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
																	.addGap(16)
																	.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																		.addGroup(gl_contentPane.createSequentialGroup()
																			.addComponent(addPayments)
																			.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
																			.addComponent(showPayments)
																			.addGap(79))
																		.addGroup(gl_contentPane.createSequentialGroup()
																			.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																				.addComponent(saveStudentData, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
																				.addComponent(lblNewLabel_26))
																			.addPreferredGap(ComponentPlacement.UNRELATED)
																			.addComponent(dateOfTransaction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))))))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
													.addGap(4)
													.addComponent(country, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
															.addGap(18)
															.addComponent(nationality, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
															.addGap(18)
															.addComponent(first, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
													.addGap(36)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
															.addGap(10)
															.addComponent(nationalityID, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
															.addGap(18)
															.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(type, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(middle, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
															.addGap(26)
															.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
															.addComponent(last, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))))
												.addComponent(lblNewLabel_35)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(postalCode, 0, 0, Short.MAX_VALUE))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(streetName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
													.addGap(30)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel_6)
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addComponent(houseNumber, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
															.addGap(32)
															.addComponent(lblNewLabel_5)
															.addGap(18)
															.addComponent(flatNumber, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addComponent(lblNewLabel_43, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
																	.addGap(18)
																	.addComponent(cityName))
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
																	.addGap(12)
																	.addComponent(districtName, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addComponent(lblNewLabel_10)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(governotayrName, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE))
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addComponent(lblNewLabel_16)
																	.addGap(18)
																	.addComponent(male)
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(female)))))))
											.addPreferredGap(ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
											.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(40)
									.addComponent(lblNewLabel_27)
									.addGap(16)
									.addComponent(maxCreditHours, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(12)
									.addComponent(lblNewLabel_29, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(NumberOfCourses, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(lblNewLabel_31)
									.addGap(10)
									.addComponent(courseName, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(43)
									.addComponent(lblNewLabel_33)
									.addGap(14)
									.addComponent(courseType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(14)
									.addComponent(lblNewLabel_30)
									.addGap(11)
									.addComponent(courseCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(21)
									.addComponent(lblNewLabel_36)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(semesterOfCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(yearOfCourse, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
									.addGap(139))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(34)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_40, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(outOf301, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addGap(7)
											.addComponent(outOf302, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addGap(9)
											.addComponent(outOf303, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addGap(13)
											.addComponent(outOf304, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addGap(11)
											.addComponent(outOf305, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addGap(5)
											.addComponent(outOf306, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addGap(10)
											.addComponent(outOf307, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(lblNewLabel_41)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(yearWork, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(lblNewLabel_42)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(outOf20, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
											.addGap(18)
											.addComponent(outOf201, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(outOf202, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(showCoursesData, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(outOf203, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(outOf204, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(outOf205, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(outOf206, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(outOf207, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(outOf208, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(outOf209, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(outOf2010, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(outOf2011, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
													.addPreferredGap(ComponentPlacement.RELATED)
													.addComponent(outOf2012, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(324)
									.addComponent(lblNewLabel_28, GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(117)
									.addComponent(addCourse, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
									.addComponent(Exit, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
									.addGap(278)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(screen, GroupLayout.PREFERRED_SIZE, 360, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(lblNewLabel_19, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(first, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(middle, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(last, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(1)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
									.addComponent(nationality, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
							.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(3)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(nationalityID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addComponent(type, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE))))
						.addComponent(desktopPane, GroupLayout.PREFERRED_SIZE, 1, GroupLayout.PREFERRED_SIZE))
					.addGap(15)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(3)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_12, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
								.addComponent(postalCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
								.addComponent(houseNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
							.addComponent(flatNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addComponent(streetName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_10, GroupLayout.PREFERRED_SIZE, 13, GroupLayout.PREFERRED_SIZE)
								.addComponent(governotayrName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_11, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(6)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(country, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_43)
										.addComponent(cityName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
								.addComponent(districtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(9)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_35)
						.addComponent(day, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_14, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(month, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_15, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
						.addComponent(lblNewLabel_13, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(year, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_17, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(termOfEnrolment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_18, GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
						.addComponent(yearOfEnrolment, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addComponent(Deoartment, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(showStudentData)
						.addComponent(saveStudentData))
					.addGap(5)
					.addComponent(lblNewLabel_21, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_22, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(typeOfFunding, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_23, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(numberOfPayments, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_26)
						.addComponent(dateOfTransaction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_24)
								.addComponent(lblNewLabel_25)
								.addComponent(bankOfTransaction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(amount, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(7))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(showPayments)
							.addComponent(addPayments)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_28)
									.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_27)
											.addGap(8))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_29)
											.addGap(5))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(NumberOfCourses, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
											.addGap(3))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_31)
											.addGap(6))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(maxCreditHours, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(7)))
							.addPreferredGap(ComponentPlacement.RELATED, 5, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_33)
									.addGap(6))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(courseType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel_30)
									.addGap(6))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(courseCode, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(4))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNewLabel_36)
										.addComponent(semesterOfCourse, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
										.addComponent(yearOfCourse, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
									.addGap(1))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(courseName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(41)))
					.addGap(26)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_32)
						.addComponent(courseCreditHoure, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_34)
						.addComponent(NumberOfTimesTakingCourse, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_39)
						.addComponent(courseLabGTA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_37)
						.addComponent(courseLcturer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_38)
						.addComponent(courseGTA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(outOf301, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_40)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(outOf302, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(outOf303, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(outOf304, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(19)
							.addComponent(outOf305, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(outOf306, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(17)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(outOf307, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_41)
								.addComponent(yearWork, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_42)
								.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(outOf20, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
							.addComponent(outOf201, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
						.addComponent(outOf202, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf203, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf204, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf205, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf206, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf207, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf208, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf209, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf2010, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf2011, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(outOf2012, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(addCourse)
							.addComponent(showCoursesData, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
						.addComponent(Exit))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(47, Short.MAX_VALUE)
					.addComponent(screen, GroupLayout.PREFERRED_SIZE, 739, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(210, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(female)
						.addComponent(male)
						.addComponent(lblNewLabel_16))
					.addGap(547))
		);
		
		group.add(female);
		group.add(male);
		contentPane.setLayout(gl_contentPane);
//		middle.addActionListener(name);
//		last.addActionListener(name);
		
		saveStudentInfo save=new saveStudentInfo();
		saveStudentData.addActionListener(save);
		showStudentData.addActionListener(save);
		addPayments.addActionListener(save);
		showPayments.addActionListener(save);
		addCourse.addActionListener(save);
		}
	public class saveStudentInfo implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==saveStudentData) {
			std.setName(first.getText(), middle.getText(), last.getText());
			std.setNationality(nationality.getText());
			std.setNationalId(Integer.parseInt(nationalityID.getText()));
			std.setTypeOfId(type.getSelectedItem().toString());
			stda=new address(Integer.parseInt(flatNumber.getText()),Integer.parseInt(houseNumber.getText()),streetName.getText(),districtName.getText(),cityName.getText(),governotayrName.getText(),country.getText(),Integer.parseInt(postalCode.getText()));
			std.setGender(group.getSelection().getActionCommand());	//
			//std.setDateOfBirth(day, ALLBITS, ABORT);
		//	std.setFirstEnrolment(Integer.parseInt(termOfEnrolment.getSelectedItem().toString()),Integer.parseInt(yearOfEnrolment.getSelectedItem().toString()) ;
			try {
				FileWriter fr;
				fr = new FileWriter(f,true);
				PrintWriter pw=new PrintWriter(fr);
				pw.write(std.toString());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			else if(e.getSource()==showStudentData) {
			screen.setText(std.toString());
		}
		else if	(e.getSource()==addPayments) {
			pay=new payments(Double.parseDouble(amount.getText()),bankOfTransaction.getText(),dateOfTransaction.getText());
			std.setTypeOfFunding(typeOfFunding.getSelectedItem().toString());
		//	std.setNumberOfPaymentsDone(Integer.parseInt(numberOfPayments.getSelectedItem().toString()));
			String m="Added successfully";
			screen.setText(m);
			File f=new File("student.txt");
			
				try {
					FileWriter fr;
					fr = new FileWriter(f,true);
					PrintWriter pw=new PrintWriter(fr);
					pw.write(std.toString());
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			} 
		else if (e.getSource()==showPayments) {
			screen.setText(pay.toString());
		}
		else if(e.getSource()==addCourse) {
			counter++;
				if(courseType.getSelectedItem().toString()=="Current") {
					try {
						currentCourses[counter]=new courses(courseType.getSelectedItem().toString());
					} catch (illegalTypeOfCourse e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
		}}
	
	}	

}
