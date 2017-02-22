import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	private Scanner input;
	TranslationFileReader translator;
	Heap<String> heap = new Heap<String>();
	HashMap <String, String> terms = new HashMap <String , String>();
	private String translation;
	private boolean dictionary;
	private boolean insert;
	private String add;

	public static void main(String[] args) throws IOException{
		Main app = new Main();
	}

	public Main() throws IOException
	{
		input = new Scanner(System.in);
		heap = new Heap<String>();
		terms = new HashMap <String , String>();

		runMenu();
	}

	private int mainMenu()
	{
		System.out.println(" Hello Welcome to the Spainish- English Dictionary");
		System.out.println("-------------");
		System.out.println(" 1) Spainish to English Dictionary");
		System.out.println("-------------");
		System.out.println(" 2) Add a new word");
		System.out.println("-------------");
		//System.out.println();
		int option = input.nextInt();
		return option;
	}

	private void runMenu() throws IOException
	{
		int option = 0;
		do
		{
			option = mainMenu();
			switch (option)
			{
			case 1: runStringSearch();
				break;
				
			case 2: runInsert();
			}
			
		}while
			(option != 0);
	}
	



		
		public void runStringSearch() throws IOException{
			
			if (dictionary != true);
			{
				translator = new TranslationFileReader();
			}
			

			System.out.println("Please insert Spainish Word");
			String result = input.nextLine();
			result = input.nextLine();
			System.out.println("English Word");
			String s = input.nextLine();
			System.out.println(translator.search(result));
		}
		
		public void runInsert(){
			System.out.println("Please insert spainish word followed by tab then english word");
			terms.put(input.next(), add);
			String answer = input.nextLine();
			//System.out.println(answer);
			System.out.println(terms);
			
		}
		
		
	}






