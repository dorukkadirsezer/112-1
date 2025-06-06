package cis112_2025_1_midterm_1_q1_group1;



public class Course {
	
	public static final int I_COURSE_ID = 0;
	public static final int I_NAME = 1;
	public static final int I_CREDITS = 2;
	public static final int I_ECTC_CREDITS = 3;
	public static final int I_DEPARTMENT = 4;
	
	
	String courseID;		 // ID of the course
	String name;			 // name of the course
	int credits;			 // number of credits
	int ectcCredits;   		 // ectc credits
	String department;		 // first time course was offered
	

	public Course(String courseID, String name, int credits, int ectcCredits, String department) {
		super();
		this.courseID = courseID;
		this.name = name;
		this.credits = credits;
		this.ectcCredits = ectcCredits;
		this.department = department;
	}
	
	
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Course [courseID=" + courseID + ", name=" + name + ", credits=" + credits + ", "
				+ "ectc credits=" + ectcCredits + ", department=" + department + "]";
	}
	
}
