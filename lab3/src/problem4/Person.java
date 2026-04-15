package problem4;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name=name;
	}
	
	public String getName() {return name;}
	
	@Override
	public String toString() {
		return "Name: " + name;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(!(o instanceof Person)) return false;
		Person other=(Person)o;
		return name.equals(other.name);
	}
}
