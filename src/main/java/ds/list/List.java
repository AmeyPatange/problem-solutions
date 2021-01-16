package ds.list;

/**
 * Represents Linked List Data structure
 * @author Amey
 */
public interface List<T>{

	boolean isEmpty();
	
	void traverse();
	
	void insertAtBeginning(T data);
	
	void insertAtEnd(T data);
	
	T get(int position);
	
	void removeFirst();
	
	void removeLast();
}
