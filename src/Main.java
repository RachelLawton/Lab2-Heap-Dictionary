import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private Scanner input;
	TranslationFileReader translator;
	Heap<String> heap = new Heap<String>();
	private String translation;
	private boolean dictionary;

	public static void main(String[] args) throws IOException{
		Main app = new Main();
	}

	public Main() throws IOException
	{
		input = new Scanner(System.in);
		heap = new Heap<String>();
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
			
		
			//String translation = translator.search("gracias");
		}
	}






