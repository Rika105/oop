package problem3;

public interface MyCollection<E> {
	void add(E element);
	
	void remove(E element);
	
	int size();
	
	boolean isEmpty();
	
	void clear();
	
	boolean contains(E element);
	
	

}
