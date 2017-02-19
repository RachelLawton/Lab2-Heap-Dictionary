import java.util.ArrayList;

public interface MaxHeapInterface < T extends Comparable < ? super T >>
{
    /** Task: Adds a new entry to the heap.
    * @param newEntry an object to be added */
    public void add (T newEntry); // done
    
    /** Task: Removes and returns the largest item in the heap.
    * @return either the largest object in the heap or,
    * if the heap is empty before the operation, null */
    public T removeMax (); // done
    
    /** Task: Retrieves the largest item in the heap.
    * @return either the largest object in the heap or,
    * if the heap is empty, null */
    public T getMax (); // done
    
    /** Task: Detects whether the heap is empty.
    * @return true if the heap is empty, else returns false */
    public boolean isEmpty (); // done
    
    /** Task: Gets the size of the heap.
    * @return the number of entries currently in the heap */
    public int getSize (); // done
    
    /** Task: Removes all entries from the heap. */
    public void clear (); // done

    
} // end MaxHeapInterface