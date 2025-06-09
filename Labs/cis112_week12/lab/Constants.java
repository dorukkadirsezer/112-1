package cis112_week12.lab;

import java.io.File;

/**
 * Constants.
 * 
 * @author bingol
 */
public interface Constants {

	String PATH_TO_FILE = "src" //
			+ File.separator + "cis112_week12" //
			+ File.separator + "lab"//
			+ File.separator//
	;

	String FILE_10 = PATH_TO_FILE + "Test10.txt";
	
	String FILE_10k = PATH_TO_FILE + "Google10k.txt";

	String[] TEST_WORDS_10 = { "ThAT", "the", "theta", "bent", "AaA", "aaaa" };

	String[] TEST_WORDS_10K = { "ThAT", "the", "theta", "infringement", "bent", "laos", "subjective", "monsters",
			"asylum", "lightbox", "robbie", "of", "cocktail", "outlets", "swaziland", "varieties", "arbor", "mediawiki",
			"configurations", "poison", "aaa", "aaaa" };

}
