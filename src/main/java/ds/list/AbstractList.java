package ds.list;


public abstract class AbstractList<T> implements List<T>{

	@Override
	public void traverse() {
		if(isEmpty()) {
			System.out.println(this.hashCode() + " List is Empty");
			return;
		}
		traverseNonEmptyList();
	}
	
	protected abstract void traverseNonEmptyList();
	
	@Override
	public T get(int position) {
		if(isEmpty() || position < 1)
			return null;
		
		return getElementAt(position);
	}
	
	protected abstract T getElementAt(int position);
}
