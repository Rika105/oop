package problem6;
import java.io.Serializable;

public class Person implements Identifiable, Comparable<Person>, Serializable,Workable {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public void doWork() {
    	System.out.println("Doing some work");
    }

    @Override
    public String getId() { return id; }

    @Override
    public int compareTo(Person other) {
        return this.id.compareTo(other.id);
    }
}
