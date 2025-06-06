package cis112_2025_1_midterm_1_q1_group2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import cis112_2025_1_midterm_1_q1_group2.StudentInfo;

@TestMethodOrder(MethodOrderer.MethodName.class)

/**
 * Test cases for {@code StackChar}.
 * 
 * @author bingol
 */

public class TS_DataBaseCourse_jUnit {

	private static final boolean DEBUG = true;
	
	
	/*
     * jUnit working
     */

    @Test
    void zz_jUnitWorking() {
           System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

           StudentInfo.studentTag();
           System.out.println("You got one additional point since jUnit is working.");
    }

	
	@Test
	void CreditsByInstructor_Çelik() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		Stack<Course> stackCourse = new Stack<>();
		Stack<Section> stackSection = new Stack<>();
		
		String fileName = "CourseDetail-2.csv";
		stackCourse = DataBaseCourse.populate(fileName);
		
		fileName = "CourseProgram-2.csv";
		stackSection = DataBaseSection.populate(fileName);
		
		String instructor = "Çelik";
		int actual = DataBaseCourse.creditsByInstructor(stackSection, stackCourse, instructor);
		int expected = 6;
		if (DEBUG) {
			System.out.println("expected:" + expected);
			System.out.println("actual  :" + actual);
		}
		assertEquals(expected, actual);
	}
	
	
	@Test
	void CreditsByInstructor_Bingöl() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		Stack<Course> stackCourse = new Stack<>();
		Stack<Section> stackSection = new Stack<>();
		
		String fileName = "CourseDetail-10.csv";
		stackCourse = DataBaseCourse.populate(fileName);
		
		fileName = "CourseProgram-10.csv";
		stackSection = DataBaseSection.populate(fileName);
		
		String instructor = "Bingöl";
		int actual = DataBaseCourse.creditsByInstructor(stackSection, stackCourse, instructor);
		int expected = 6;
		if (DEBUG) {
			System.out.println("expected:" + expected);
			System.out.println("actual  :" + actual);
		}
		assertEquals(expected, actual);
	}
	
	
	@Test
	void CreditsByInstructor_Tufan() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		Stack<Course> stackCourse = new Stack<>();
		Stack<Section> stackSection = new Stack<>();
		
		String fileName = "CourseDetail-10.csv";
		stackCourse = DataBaseCourse.populate(fileName);
		
		fileName = "CourseProgram-10.csv";
		stackSection = DataBaseSection.populate(fileName);
		
		String instructor = "Tufan";
		int actual = DataBaseCourse.creditsByInstructor(stackSection, stackCourse, instructor);
		int expected = 3;
		if (DEBUG) {
			System.out.println("expected:" + expected);
			System.out.println("actual  :" + actual);
		}
		assertEquals(expected, actual);
	}

}

