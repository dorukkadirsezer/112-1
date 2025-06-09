package cis112_week12.lab;

import java.io.IOException;
import java.time.Instant;
import java.time.Duration;

public class SpellCheckerSeparateChaining_Test {

	public static void main(String[] args) {

		SpellCheckerSeparateChaining sp;

		try {
			sp = new SpellCheckerSeparateChaining(15);
			sp.loadDictionary(Constants.FILE_10);
			
			sp = new SpellCheckerSeparateChaining(15_000);
			sp.loadDictionary(Constants.FILE_10k);
			
			// test and timing 
			Instant start = Instant.now();
			for (String word : Constants.TEST_WORDS_10) {
				boolean correct = sp.isCorrect(word);
				System.out.printf("'%s' is %s%n", word, correct ? "correct" : "incorrect");
			}
			Duration elapsed = Duration.between(start, Instant.now());
			System.out.printf("Method executed in: %,d ns %n", elapsed.toNanos());
		} catch (IOException e) {
			System.err.println("Error loading dictionary: " + e.getMessage());
		}
	}

	static void printTimestamp() {
		Instant now = Instant.now();
		System.out.println("ts:" + now);
	}

}
