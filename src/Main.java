import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Heap<String> heap = new Heap<String>();
		TranslationFileReader translator;
		
		heap.add("Radhel");
		heap.add("Rachel");
		heap.add("Yasmin");
		heap.add("Zach");
		heap.add("David");
		//heap.add("Yoda");
		heap.add("Daniel");
		heap.add("David");
		
		
		System.out.println(heap.getMax());
		System.out.println(heap.removeMax());
		System.out.println(heap.getMax());
		
		try {
			translator = new TranslationFileReader();

			// write your menu system for reading in spanish words and searching for them in the translator hashmap.
			String translation = translator.search("gracias");
			
			System.out.println(translation);
			System.out.println(translator.getWords().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
