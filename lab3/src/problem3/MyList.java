package problem3;
import java.util.*;

public class MyList<E> implements MyCollection<E> {

	private Object[] data;
    private int size;      

    
    public MyList() {
        this.data = new Object[10];
        this.size = 0;
    }

    @Override
    public void add(E element) {
        if (size == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        data[size] = element; 
        size++;               
    }

    @Override
    public void remove(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                System.arraycopy(data, i + 1, data, i, size - i - 1);
                data[--size] = null;
                return;
            }
        }
    }

    @Override
    public int size() {
        return size; 
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        data = new Object[10];
        size = 0;
    }
}
