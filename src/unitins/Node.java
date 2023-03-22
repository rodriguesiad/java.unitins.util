package unitins;

public class Node<T>{

    private T data = null;
    private Node<T> next = null;

    public Node(T data){
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }
    
    public String toString() {
    	return data.toString();
    }

}