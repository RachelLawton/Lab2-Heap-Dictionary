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
		int k = values.size()-1;
		while (k > 0) {
			int p = (k-1)/2;
			T value = values.get(k);
			T parent = values.get(p);

			if(value.compareTo(parent)>0){

				values.set(k, parent);
				values.set(p, value);

				k = p;
			}else{
				break;
			}
		}
	}
	
	public void insert(T value){
		values.add(value);
		siftUp();
		System.out.println(values);
	}

	private void siftDown(){
		int k = 0;
		int l =2*k+1;
		while(l < values.size()){
			int max = l, r=l+1;
			if(r < values.size())
				if(values.get(r).compareTo(values.get(l)) > 0){
					T temp = values.get(k);
					values.set(k, values.get(max));
					values.set(max,temp);
					k = max;
					l = 2*k+1;
				}else{
					break;
				}
		}
	}

	public T delete()
			throws NoSuchElementException {
		if (values.size() == 0){
			throw new NoSuchElementException(); // if you call this on an empty heap it will throw no such element exception
		} 
		if(values.size() == 1){
			return values.remove(0);
		}
		T hold = values.get(0); // take the max and put it aside
		values.set(0, values.remove(values.size()-1));
		siftDown();
		return hold;
	}

	public int size() {
		return values.size();
	}

	public boolean isEmpty() {
		return values.isEmpty();
	}

	public String toString(){
		return values.toString();
	}

	@Override
	public Comparable<T> removeMax() {
		if(values.isEmpty()){
			return null;
		}
		else{
			Comparable<T> v = delete();
			
			return v;
		}
	}

	@Override
	public Comparable getMax() {
		if(values.isEmpty()){
			return null;
		}
		else{
			return values.get(0);
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
