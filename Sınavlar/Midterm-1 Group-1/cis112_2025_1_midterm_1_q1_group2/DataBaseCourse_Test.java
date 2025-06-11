package cis112_2025_1_midterm_1_q1_group2;

import java.util.Stack;

public class DataBaseCourse_Test {

	public static void main(String[] args) {
		
		Stack<Course> stackCourse = new Stack<>();
		Stack<Section> stackSection = new Stack<>();

		String fileName = "CourseDetail-2.csv";
		stackCourse = DataBaseCourse.populate(fileName);
		
		
		fileName = "CourseProgram-2.csv";
		stackSection = DataBaseSection.populate(fileName);
		

		int creditsByInstructor=DataBaseCourse.creditsByInstructor(stackSection, stackCourse, "Çelik");
		System.out.println("\ncreditsByInstructor\n"//
				+ creditsByInstructor);
	
	}

}
