package cis112_week09.lab;

import cis112_week09.theory.LibTree;
import cis112_week09.theory.MyBinaryTree;
import cis112_week09.theory.NodeBinaryInterface;

/**
 * Extends {@code LibTree} by adding a few new methods.
 * 
 * @param <T>
 * @author bingol
 */
public class LibTreeExtended<T> extends LibTree<T> {

	private static final boolean DEBUG = false;
	private static final boolean DEBUG_M = true; // show method name

	/**
	 * Searches {@code value} in the {@code tree}.
	 * 
	 * @param <T>
	 * @param tree
	 * @param value
	 * @return {@code true} if found, {@code false} otherwise.
	 */
	public static <T> boolean find(MyBinaryTree<T> tree, T data) {
		return find(tree.getRoot(), data);
	}

	/**
	 * Searches {@code value} in the subtree rooted by {@code node}.
	 * 
	 * @param <T>
	 * @param node
	 * @param value
	 * @return {@code true} if found, {@code false} otherwise.
	 */
	public static <T> boolean find(NodeBinaryInterface<T> node, T data) {
		if (DEBUG_M) {
			System.out.println("\n->" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		boolean b = false;

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A

		return b;
	}

	/**
	 * Number of nodes in the {@code tree}.
	 * 
	 * @param <T>
	 * @param tree
	 * @return
	 */
	public static <T> int size(MyBinaryTree<T> tree) {
		return size(tree.getRoot());
	}

	/**
	 * Number of nodes in the subtree whose root is the given {@code node}.
	 * 
	 * @return
	 */
	public static <T> int size(NodeBinaryInterface<T> node) {
		if (DEBUG_M) {
			System.out.println("\n-" + StackWalker.getInstance().walk(s -> s.skip(0).findFirst()).get().getMethodName());
		}

		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return -314; // ~~fake~~

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
