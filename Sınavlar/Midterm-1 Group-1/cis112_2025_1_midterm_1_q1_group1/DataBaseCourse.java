package cis112_2025_1_midterm_1_q1_group1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class DataBaseCourse {

	public static Stack<Course> populate(String fileName) {

		final String pathToDirectory = "src/cis112_2025_1_midterm_q1_group1";
		final String pathToFile = pathToDirectory + File.separator + fileName;

		Stack<Course> stackAll = new Stack<>();

		try {
			String line;
			String[] token;
			Course course;
			Scanner scanner;

			File file = new File(pathToFile);
			scanner = new Scanner(file);
			// skip header line
			if (scanner.hasNext()) {
				scanner.next();
			}
			// read data
			while (scanner.hasNext()) {
				line = scanner.next();
				token = line.split(",");
				
				course = new Course(//
						token[Course.I_COURSE_ID].trim()//
						, token[Course.I_NAME].trim()//
						, Integer.valueOf(token[Course.I_CREDITS].trim())//
						, Integer.valueOf(token[Course.I_ECTC_CREDITS].trim())//
						, token[Course.I_DEPARTMENT].trim()//
				);
				stackAll.push(course);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stackAll;
	}

	
		
	/**
	 * 
	 * @param sectionStack
	 * @param courseStack
	 * @return total credits for all courses in the sectionStack.
	 */
	public static int totalCredits(Stack<Section> sectionStack, Stack<Course> courseStack) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int credits = 0;

		Stack<Section> stackTmp = new Stack<>();
		Section section = null;
		
		Stack<Course> stackTmp2 = new Stack<>();
		Course course = null;
		
		
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		// below-0123456789-9876543210-V solution >>>>>>>>> V
		
		
		
		
		// above-0123456789-9876543210-A solution <<<<<<<<< A

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
		
		return credits;
	}	
}
