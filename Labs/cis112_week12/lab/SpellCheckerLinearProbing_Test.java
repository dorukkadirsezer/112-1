package cis112_week12.lab;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class SpellCheckerLinearProbing_Test {

	public static void main(String[] args) {
		SpellCheckerLinearProbing sp;

		try {
			sp = new SpellCheckerLinearProbing(15);
			sp.loadDictionary(Constants.FILE_10);
			
			sp = new SpellCheckerLinearProbing(15_000);
			sp.loadDictionary(Constants.FILE_10k);

			// test and timing
			Instant start = Instant.now();
			for (String word : Constants.TEST_WORDS_10) {
				boolean correct = sp.isCorrect(word);
				System.out.printf("'%s' is %s%n", word, correct ? "correct" : "incorrect");

//				// suggestions
//				if (!correct) {
//					List<String> suggestions = sp.getSuggestions(word);
//					if (!suggestions.isEmpty()) {
//						System.out.println("  Suggestions: " + suggestions);
//					}
//				}
			}
			Duration elapsed = Duration.between(start, Instant.now());
			System.out.printf("Method executed in: %,d ns %n", elapsed.toNanos());
		} catch (IOException e) {
			System.err.println("Error loading dictionary: " + e.getMessage());
		}
	}

}
