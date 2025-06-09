package cis112_week12.lab;

import java.io.IOException;

/**
 * Spell checker.
 * 
 * @author bingol
 */
public interface SpellCheckerInterface {

	void loadDictionary(String pathToFile) throws IOException;

	boolean isCorrect(String word);

	void addWord(String word);
	
}
