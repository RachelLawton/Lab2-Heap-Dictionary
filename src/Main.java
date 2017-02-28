import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	private Scanner input;
	TranslationFileReader translator;
	Heap<String> heap = new Heap<String>();
	HashMap<String, String> terms = new HashMap<String, String>();
	private String add;

	public static void main(String[] args) throws IOException {
		Main app = new Main();
	}

	// constructor
	public Main() throws IOException {
		// tasks
		// 1. initialise the variables
		input = new Scanner(System.in);
		heap = new Heap<String>();
		terms = new HashMap<String, String>();
		
		// 2. read in the data into the heap/hashmap
		translator = new TranslationFileReader();
		
		// 3. launch the menu system
		launcher();
	}

	private void launcher() throws IOException {
		int option = 0;
		do {
			option = printMenu();
			switch (option) {
			case 1:
				runStringSearch();
				break;

			case 2:
				runInsert();
			}

		} while (option != 0);
	}
	
	private int printMenu() {
		System.out.println(" Hello Welcome to the Spanish - English Dictionary");
		System.out.println("-------------");
		System.out.println(" 1) Spanish to English Dictionary");
		System.out.println("-------------");
		System.out.println(" 2) Add a new word");
		System.out.println("-------------");
		System.out.println(" 0) Exit");
		System.out.println("-------------");
		// System.out.println();
		int option = input.nextInt();
		input.nextLine();
		return option;
	}

	public void runStringSearch() throws IOException {

		if (translator == null)
		{
			translator = new TranslationFileReader();
		}

		System.out.println("Please insert Spanish Word");
		String spanish = input.nextLine();

		System.out.println(translator.search(spanish));
	}

	public void runInsert() throws IOException {
		System.out.println("Please insert spanish word followed by tab then english word");
		terms.put(input.next(), add);
		String answer = input.nextLine();
		PrintWriter out = new PrintWriter(new FileWriter("addedwords.txt"));
		out.println(answer);
		out.close();

		// System.out.println(answer);
		System.out.println(terms);

	}

}
