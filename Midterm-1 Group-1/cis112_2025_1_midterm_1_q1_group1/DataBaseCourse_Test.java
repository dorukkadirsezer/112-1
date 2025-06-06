package cis112_2025_1_midterm_1_q1_group1;

import java.util.Stack;

public class DataBaseCourse_Test {

	public static void main(String[] args) {
		Stack<Course> stackCourse = new Stack<>();
		Stack<Section> stackSection = new Stack<>();

		String fileName = "CourseDetail-2.csv";
		stackCourse = DataBaseCourse.populate(fileName);
		
		
		fileName = "CourseProgram-2.csv";
		stackSection = DataBaseSection.populate(fileName);
		
		// total credits
		int totalCredits=DataBaseCourse.totalCredits(stackSection, stackCourse);
		System.out.println("\ntotalCredits\n"//
			+ totalCredits);
	}

}
