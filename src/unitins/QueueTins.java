package unitins;

public class QueueTins<T> {
	
	private LinkedTins<T> array = new LinkedTins<T>();
	
	public void enqueue(T newElement) {
		array.add(newElement);
	}
	
	public T dequeue() {
		return array.remove(0);
	}
	
	public int size() {
		return array.size();
	}
	
	public boolean isEmpty() {
		return array.isEmpty();
	}
	
	@Override
    public String toString(){
		return array.toString();
	}
}
