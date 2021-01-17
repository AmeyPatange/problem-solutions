package ds.array;

public abstract class AbstractArray<T> implements Array<T>{

	@Override
	public void traverse() {
		if(isEmpty()) {
			System.out.println("Array is Empty");
			return;
		}
		traverseArr();
	}
	
	protected abstract void traverseArr();

	@Override
	public T get(int position) {
		if(position < 1 || position > this.size())
			return null;
		return getElementAt(position);
	}
	
	protected abstract T getElementAt(int position);
	
}
