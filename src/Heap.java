//Rachel Lawton iot yr2
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Heap<T extends Comparable<T>> implements MaxHeapInterface{

	private ArrayList<T> values = new ArrayList<T>();

	public Heap(){
	}

	private void siftUp() {
		int k = values.size()-1;//k is the size of the arraylist
		while (k > 0) {//while k is grater than 0. so arraylist not empty
			int p = (k-1)/2;//p becomes the formula which is calculating the number that gets compared
			T value = values.get(k);////value become k
			T parent = values.get(p);//parent becomes p

			if(value.compareTo(parent)>0){//comparing method to see which is bigger

				values.set(k, parent);//swaps which ever one is bigger closest to the start of the arraylisy
				values.set(p, value);

				k = p;
			}else{
				break;
			}
		}
	}
	
	public void insert(T value){//inserts a value to the arraylist
		values.add(value);
		siftUp();//siftup then occurs
		System.out.println(values);//print out values
	}

	private void siftDown(){//oposite of siftup. this is used when the max is removed
		int k = 0;
		int l =2*k+1;
		while(l < values.size()){ //while l is in the parameter of the arraylist
			int max = l, r=l+1;//max = l r = l+1 beacuse l is already 2*k+1
			if(r < values.size())// if there is a right child
				if(values.get(r).compareTo(values.get(l)) > 0){//then the left and right childern are compared
					T temp = values.get(k);
					values.set(k, values.get(max));//the switch takes place
					values.set(max,temp);
					k = max;
					l = 2*k+1;//l is recomputed to be ready for the next siftdown
				}else{
					break;
				}
		}
	}

	public T delete()
			throws NoSuchElementException {
		if (values.size() == 0){//if there is nothing in the array
			throw new NoSuchElementException(); // if you call this on an empty heap it will throw no such element exception
		} 
		if(values.size() == 1){//if values = 1 dont remove beacuse its already the max
			return values.remove(0);
		}
		T hold = values.get(0); // take the max and put it aside
		values.set(0, values.remove(values.size()-1));//last value is moved 
		siftDown();//sift down occurs
		return hold;
	}

	public int size() {
		return values.size();//return size of values
	}

	public boolean isEmpty() {
		return values.isEmpty();
	}

	public String toString(){
		return values.toString();
	}

	@Override
	public Comparable<T> removeMax() {//remove max value
		if(values.isEmpty()){
			return null;//if arraylist is empty return null
		}
		else{
			Comparable<T> v = delete();//else comparable v is deleted 
			
			return v;
		}
	}

	@Override
	public Comparable getMax() {//if arraylist is empty return null
		if(values.isEmpty()){
			return null;
		}
		else{
			return values.get(0);//0 is always the max
		}
	}

	@Override
	public int getSize() {
		return size();
	}

	@Override
	public void clear() {
		values.clear();	
	}

	@Override
	public void add(Comparable newEntry) {
		insert((T) newEntry);
	}

	
}
