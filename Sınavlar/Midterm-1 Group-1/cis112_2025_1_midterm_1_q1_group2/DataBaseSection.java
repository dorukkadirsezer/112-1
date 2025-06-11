package cis112_2025_1_midterm_1_q1_group2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class DataBaseSection {

	public static Stack<Section> populate(String fileName) {
//		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		final String pathToDirectory = "src/cis112_2025_1_midterm_1_q1_group2_solution";
		final String pathToFile = pathToDirectory + File.separator + fileName;

		Stack<Section> stackAll = new Stack<>();

		try {
			String line;
			String[] token;
			Section section;
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
				section = new Section(//
						token[Section.I_COURSE_ID].trim()//
						, token[Section.I_SECTION].trim()//
						, token[Section.I_INSTRUCTOR].trim()//
						, token[Section.I_TYPE].trim()//
						, token[Section.I_DAY].trim()//
						, token[Section.I_TIME].trim()//
						, token[Section.I_CAPACITY].trim()//
						, token[Section.I_BUILDING].trim()//
						, token[Section.I_ROOM].trim()//
				);
				// System.out.println(section.toString());
				stackAll.push(section);
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stackAll;
	}

	public static Stack<String> listSectionsByInstructor(Stack<Section> stack, String instructor) {
//		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		Stack<String> stackString = new Stack<>();

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		// below-0123456789-9876543210-V solution >>>>>>>>> V

		instructor = instructor.trim();

		Stack<Section> stackTmp = new Stack<>();
		Section section = null;
		while (!stack.empty()) {
			section = stack.pop();
			stackTmp.push(section);
			if (section.getInstructor().equals(instructor)) {
				stackString.push(section.getSection());
			}
		}
		stack = stackTmp;
		// above-0123456789-9876543210-A solution <<<<<<<<< A

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		return stackString;
	}

	public static Set<String> listInstructors(Stack<Section> stack) {
//		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		Set<String> set = new HashSet<>();

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		// below-0123456789-9876543210-V solution >>>>>>>>> V

		Stack<Section> stackTmp = new Stack<>();
		Section section = null;

		while (!stack.empty()) {
			section = stack.pop();
			stackTmp.push(section);
			set.add(section.getInstructor());
		}
		stack = stackTmp;

		// above-0123456789-9876543210-A solution <<<<<<<<< A

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		return set;
	}

	
	
	
	public static int totalCapacity(Stack<Section> stack) {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());

		int capacity = 0;

		Stack<Section> stackTmp = new Stack<>();
		Section section = null;
		while (!stack.empty()) {
			section = stack.pop();
			stackTmp.push(section);
			capacity += Integer.parseInt(section.getCapacity());
		}
		stack = stackTmp;

		return capacity;
	}

}
