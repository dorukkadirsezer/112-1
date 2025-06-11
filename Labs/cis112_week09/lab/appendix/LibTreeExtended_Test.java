package cis112_week09.lab.appendix;

import cis112_week09.theory.MyBinaryTree;
import cis112_week09.theory.MyBinaryTreeConstructor;

public class LibTreeExtended_Test {

	public static void main(String[] args) {
		testAreStructurallyEquivalent();

		testBalanced();

	}

	private static void testBalanced() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		
		MyBinaryTree<String> t = MyBinaryTreeConstructor.constructBT_S_t_lr_ll_llr();
		MyBinaryTree<String> b = LibTreeExtended.<String>balanced(t);

//		System.out.println(b);
		t.plot();
		b.plot();
	}

	private static void testAreStructurallyEquivalent() {
		System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		
		MyBinaryTree<String> t1 = MyBinaryTreeConstructor.constructBT_S_t_l();
		MyBinaryTree<String> t2 = MyBinaryTreeConstructor.constructBT_S_t_l_eq();

		t1.plot();
		t2.plot();
		
		boolean b = LibTreeExtended.<String>areStructurallyEquivalent(t1, t2);

		System.out.println(b);
	}

}
