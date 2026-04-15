package def1;

public class Friend {
	private String name;
	private int age;
	
	public Friend(String name,int age){
		this.name=name;
		this.age=age;
	}
@Override
public String toString() {
	return this.name + this.age;
}
	

}
