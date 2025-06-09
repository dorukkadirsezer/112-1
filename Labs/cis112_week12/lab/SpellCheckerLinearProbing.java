package cis112_week12.lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * A spell checker using a hash table with linear probing for collision
 * resolution.
 * 
 * @author bingol
 */
public class SpellCheckerLinearProbing implements SpellCheckerInterface {

	private static final int DEFAULT_CAPACITY = 10_000;
//	private static final int DEFAULT_CAPACITY = 12;
	private static final double LOAD_FACTOR = 0.7;

	private String[] dictionary;
	private boolean[] isOccupied;
	private int size;
	private int capacity;

	public SpellCheckerLinearProbing() {
		this(DEFAULT_CAPACITY);
	}

	public SpellCheckerLinearProbing(int initialCapacity) {
		capacity = initialCapacity;
		dictionary = new String[capacity];
		isOccupied = new boolean[capacity];
		size = 0;
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
		if ((double) size / capacity >= LOAD_FACTOR) {
			resize();
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

	// Hash function using polynomial rolling hash
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

	// Resize the hash table when load factor is exceeded
	private void resize() {
		int capacityNew = 2 * capacity;
		String[] dictionaryNew = new String[capacityNew];
		boolean[] isOccupiedNew = new boolean[capacityNew];

		// Rehash all elements
		for (int i = 0; i < capacity; i++) {
			if (isOccupied[i]) {
				String word = dictionary[i];
				int newIndex = hash(word) % capacityNew;

				// Linear probing for new position
				while (isOccupiedNew[newIndex]) {
					newIndex = (newIndex + 1) % capacityNew;
				}

				dictionaryNew[newIndex] = word;
				isOccupiedNew[newIndex] = true;
			}
		}

		dictionary = dictionaryNew;
		isOccupied = isOccupiedNew;
		capacity = capacityNew;
	}

	// Get suggestions for misspelled words (simple implementation)
	public List<String> getSuggestions(String word) {
		List<String> suggestions = new ArrayList<>();
		if (word == null || word.isEmpty())
			return suggestions;

		String lowercaseWord = word.toLowerCase();

		// Generate possible variations
		for (int i = 0; i < lowercaseWord.length(); i++) {
			// Try removing each character
			String variation = lowercaseWord.substring(0, i) + lowercaseWord.substring(i + 1);
			if (isCorrect(variation)) {
				suggestions.add(variation);
			}

			// Try replacing each character with a-z
			for (char c = 'a'; c <= 'z'; c++) {
				if (c != lowercaseWord.charAt(i)) {
					variation = lowercaseWord.substring(0, i) + c + lowercaseWord.substring(i + 1);
					if (isCorrect(variation)) {
						suggestions.add(variation);
					}
				}
			}
		}

		// Try adding each character a-z at each position
		for (int i = 0; i <= lowercaseWord.length(); i++) {
			for (char c = 'a'; c <= 'z'; c++) {
				String variation = lowercaseWord.substring(0, i) + c + lowercaseWord.substring(i);
				if (isCorrect(variation)) {
					suggestions.add(variation);
				}
			}
		}

		return suggestions;
	}

}
