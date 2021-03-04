package ds.stack;

public interface Stack {

	void push(int x);
	
	int peek();
	
	int pop();
	
	boolean isEmpty();
	
	boolean isFull();
	
	int size();
	
}
