package com.tcs.basicsjava;

public class Student {

	private String studentName;
	private String rollnumber;
	private long phoneNumber;
	private String emailId;
	private static String standard;
	private static String teacherName;

	public String getStudentName() {
		return studentName;
	}

	public Student(String studentName, String rollnumber) {
		this.studentName = studentName;
		this.rollnumber = rollnumber;
	}

	public Student(String studentName, String rollnumber, long phoneNumber) {
		this.studentName = studentName;
		this.rollnumber = rollnumber;
		this.phoneNumber = phoneNumber;
	}

	public Student(String studentName, String rollnumber, long phoneNumber, String emailId) {
		this.studentName = studentName;
		this.rollnumber = rollnumber;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public void setStudentName(String studentName, int otp) {
		if (1247 == otp) {
			this.studentName = studentName;
		} else {
			// System.out.println("please eneter a proper OTP");
		}

	}

	public String getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(String rollnumber, int otp) {
		String val = 1247 == otp ? this.rollnumber = rollnumber : "please enter valid OTP";
		// System.out.println(val);
	}

	public static String getStandard() {
		return standard;
	}

	public static void setStandard(String standard) {
		Student.standard = standard;
	}

	public static String getTeacherName() {
		return teacherName;
	}

	public static void setTeacherName(String teacherName) {
		Student.teacherName = teacherName;
	}

	public static void main(String[] args) {

		Student.setStandard("BE");
		Student.setTeacherName("XYZ");

		Student s1 = new Student("chandrashear", "abcde");
		s1.setStudentName("chandrashekhar", 1247);
		s1.setRollnumber("1234abc", 1247);

		Student s2 = new Student("yuvar", "uhuk909");
		s2.setStudentName("yuvarj", 1247);
		s2.setRollnumber("1244abc", 1247);

		Student s3 = new Student("akshay", "uhuk9i09",9483600119l);
//		s2.setStudentName("yuvarj", 12470);
//		s2.setRollnumber("1244abc", 12470);
		
		Student s4 = new Student("akshay", "uhuk9i09",9483600119l,"abc@yaho.com");
//		s2.setStudentName("yuvarj", 12470);
//		s2.setRollnumber("1244abc", 12470);

		System.out.println(s1.getRollnumber());
		System.out.println(s1.getStudentName());
		System.out.println(s1.phoneNumber);
		System.out.println(s1.emailId);

		System.out.println(s2.getRollnumber());
		System.out.println(s2.getStudentName());

		System.out.println(s3.getRollnumber());
		System.out.println(s3.getStudentName());
		System.out.println(s3.phoneNumber);
		System.out.println(s3.emailId);
		
		
		System.out.println(s4.getRollnumber());
		System.out.println(s4.getStudentName());
		System.out.println(s4.phoneNumber);
		System.out.println(s4.emailId);
		
		// int i =123; //321
	}

}
