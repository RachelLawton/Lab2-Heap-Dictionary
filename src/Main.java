import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private Scanner input;
	TranslationFileReader translator;
	Heap<String> heap = new Heap<String>();

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
			case 1: runTranslatorSearch();
			break;
			}
		}while
		       (option != 0);
	}

		
		
		private void runTranslatorSearch() throws IOException{
		translator = new TranslationFileReader();
		String translation = translator.search("");
		
		
		for(int i = 0; i < heap.size(); i++)
		{
			System.out.println("Spainish word: ");// + translator.search(""));
			System.out.println("English Word:  " + translation);
		}

		

		
		
		
		
		
		
		//System.out.println(translation);
		System.out.println(translator.getWords().toString());
		//	} catch (IOException e) {
		// TODO Auto-generated catch block
		//		e.printStackTrace();
		//heap.add("Radhel");
				//heap.add("Rachel");
				//heap.add("Yasmin");
				//heap.add("Zach");
				//heap.add("David");
				//heap.add("Yoda");
				//heap.add("Daniel");
				//heap.add("David");


				//System.out.println(heap.getMax());
				//System.out.println(heap.removeMax());
				//System.out.println(heap.getMax());

				//try {

	}
}

