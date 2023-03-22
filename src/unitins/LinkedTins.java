package unitins;

public class LinkedTins<T> {

    private Node<T> head = null;
    private int qtdElements = 0;

    public boolean isEmpty(){
        return head == null;
    }

    public int size() {
        return qtdElements;
    }

    public void add(T newElement){
        Node<T> newNode = new Node<>(newElement);
        qtdElements ++;

        if (isEmpty()){
            head = newNode;
            return;
        }

        Node<T> aux = head;

        while ( aux.getNext() != null ) {
            aux = aux.getNext();
        }

        aux.setNext(newNode);
    }

    public T get(int position){
        if(position < 0 || position >= size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        
        Node<T> aux = head;

        for(int count=0; count < position; count++){
            aux = aux.getNext();
        }

        return aux.getData();
    }
    
    private Node<T> getNode(int position){
        Node<T> aux = head;

        for(int count=0; count < position; count++){
            aux = aux.getNext();
        }

        return aux;
    }
    
    public void add(int position, T newElement) {
    	if(position < 0 || position > size()) {
    		throw new ArrayIndexOutOfBoundsException();
    	}
    	
    	Node<T> newNode = new Node<>(newElement);
    	qtdElements ++;
    	
    	if(position == 0) {
    		newNode.setNext(head);
    		head = newNode;
    		return;
    		
    	}
    	
    	if(position == size()) {
    		Node<T> last = getNode(size()-1);
    		last.setNext(newNode);
    		return;
    		
    	}
    	
		Node<T> previousNode = getNode(position - 1);
		newNode.setNext(previousNode.getNext());
		previousNode.setNext(newNode);
    }
    
    public T remove(int position) {
    	if(position < 0 || position >= size()) {
    		throw new ArrayIndexOutOfBoundsException();
    	}
    	
    	Node<T> oldNode = getNode(position);
    
    	if(position == 0) {
    		head = oldNode.getNext();
    	}
    	else {
    		Node<T> previousNode = getNode(position - 1);
    		previousNode.setNext(oldNode.getNext());	
    	}
		
		qtdElements --;
		return oldNode.getData();
    	
    }


    @Override
    public String toString(){
        String result = "[";

        Node<T> aux = head;

        do {
            result += aux.getData() + ", ";
            aux = aux.getNext();
        } while (aux.getNext() != null);

        result += aux.getData() + "]";

        return result;
    }

}