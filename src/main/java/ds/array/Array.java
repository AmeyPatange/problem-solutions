package ds.array;

/**
 * 
 * @author Amey
 *
 */
public interface Array<T>{
	
	boolean isEmpty();
	
	void traverse();
	
	boolean insertAtBeginning(T data);
	
	boolean insertAtEnd(T data);
	
	/**
	 * Position starts from 1. Index starts from 0
	 * @param position
	 * @return T data
	 */
	T get(int position);
	
	void removeFirst();
	
	void removeLast();
	
	int size();
}
