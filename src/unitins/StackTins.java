package unitins;

public class StackTins<T>{
	
	private LinkedTins<T> array = new LinkedTins<T>();

	public void push(T newElement) {
		array.add(0, newElement);
	}
	
	public T pop() {
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
