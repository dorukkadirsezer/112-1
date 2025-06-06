package cis112_2025_1_midterm_1_q1_group1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Stack;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.MethodName.class)

/**
 * Test cases for {@code StackChar}.
 * 
 * @author bingol
 */

public class DataBaseCourse_jUnit {

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
	void totalCredits_2() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		
		Stack<Course> stackCourse = new Stack<>();
		Stack<Section> stackSection = new Stack<>();
		
		String fileName = "CourseDetail-2.csv";
		stackCourse = DataBaseCourse.populate(fileName);
		
		fileName = "CourseProgram-2.csv";
		stackSection = DataBaseSection.populate(fileName);
		
		int expected = 6;
		int actual = DataBaseCourse.totalCredits(stackSection, stackCourse);
		if (DEBUG) {
			System.out.println("expected:" + expected);
			System.out.println("actual  :" + actual);
		}
		assertEquals(expected, actual);
	}
	
	
	@Test
	void totalCredits_10() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		
		Stack<Course> stackCourse = new Stack<>();
		Stack<Section> stackSection = new Stack<>();
		
		String fileName = "CourseDetail-10.csv";
		stackCourse = DataBaseCourse.populate(fileName);
		
		fileName = "CourseProgram-10.csv";
		stackSection = DataBaseSection.populate(fileName);
		
		int expected = 12;
		int actual = DataBaseCourse.totalCredits(stackSection, stackCourse);
		if (DEBUG) {
			System.out.println("expected:" + expected);
			System.out.println("actual  :" + actual);
		}
		assertEquals(expected, actual);
	}
}

