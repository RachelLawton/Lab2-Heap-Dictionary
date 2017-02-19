

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class TranslationFileReader {


	public HashMap <String, String> terms = new HashMap <String , String>();

	public TranslationFileReader() throws IOException 
	{
		readWords();
	}

	public void readWords() throws IOException 
	{
		int lineNo = 1;
		String dictionary = "words.txt";// reading in words
		File wordDictionary = new File(dictionary);
		Scanner dictionaryScanner = new Scanner(wordDictionary);
		String delims = "\t";// telling it that there is tabs.
		dictionaryScanner.nextLine();// gets rid of first stray line
		while (dictionaryScanner.hasNextLine()) {
			String wordPair = dictionaryScanner.nextLine().trim();// cleans up white space at the start
			String[] wordPairs = wordPair.split(delims);// splits the weight from the term

			// output word data to console.
			if (wordPairs.length == 2) {
				terms.put(wordPairs[0], wordPairs[1]);
			} else {		
				throw new IOException("Invalid line:" + lineNo);
			}
			lineNo++;
		}
		dictionaryScanner.close();
	}
	
	public String search(String s){
		String result = terms.get(s);
		return result;
	}
	
	public HashMap <String, String> getWords(){
		return terms;
	}
}

