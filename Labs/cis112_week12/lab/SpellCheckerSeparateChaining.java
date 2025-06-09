package cis112_week12.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * A spell checker using a hash table with separate chaining for collision
 * resolution.
 * 
 * @author bingol
 */
public class SpellCheckerSeparateChaining implements SpellCheckerInterface {

	private static final int DEFAULT_CAPACITY = 10_000;

	private Node[] dictionary;
	private int capacity;

	public SpellCheckerSeparateChaining() {
		this(DEFAULT_CAPACITY);
	}

	public SpellCheckerSeparateChaining(int initialCapacity) {
		capacity = initialCapacity;
		dictionary = new Node[capacity];
		for (int i = 0; i < capacity; i++) {
			dictionary[i] = null;
		}

	}

	@Override
	public void loadDictionary(String pathToFile) throws IOException {
		List<String> words = Files.readAllLines(Paths.get(pathToFile));
		for (String word : words) {
			addWord(word.trim());
		}
	}

	@Override
	public void addWord(String word) {
		if (word == null || word.isEmpty()) {
			return;
		}
		word = word.toLowerCase();
		int index = hash(word);
		
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.


		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	@Override
	public boolean isCorrect(String word) {
		if (word == null || word.isEmpty()) {
			return true;
		}
		word = word.toLowerCase();
		int index = hash(word);

		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 return false; // ~~fake~~

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
	}

	private int hash(String word) {
		if (word == null || word.isEmpty()) {
			return 0;
		}
		final int prime = 31;
		int hash = 7; // Prime seed
		for (int i = 0; i < word.length(); i++) {
			hash = (prime * hash + word.charAt(i)) % capacity;
		}
		return Math.abs(hash);
	}

	public String canonical() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < dictionary.length; i++) {
			sb.append("" + i + ":");
			if (dictionary[i] != null) {
				sb.append(" " + dictionary[i].canonical());
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	@Override
	public String toString() {
		return "[SpellCheckerSeparateChaining: dictionary=" + Arrays.toString(dictionary) + ", capacity=" + capacity
				+ "]";
	}
	
	/**
	 * Node for linked list
	 * 
	 * @author bingol
	 */
	public class Node {

		String word;
		Node next;

		public Node(String word) {
			this.word = word;
			next = null;
		}

		public boolean search(String word) {
			Node current = this;
			while (current != null) {
				if (current.word.equals(word)) {
					return true;
				} else {
					current = current.next;
				}
			}
			return false;
		}

		public String canonical() {
			Node current = this;
			StringBuilder sb = new StringBuilder();
			while (current != null) {
				sb.append(", " + current.word);
				current = current.next;
			}
			return sb.toString();
		}

	}

}
