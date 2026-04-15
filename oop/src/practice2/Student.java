package practice2;
import java.util.Scanner;

public class Student{
	public String name;
	public int id;
	public int course;
	public int grade;
	
	/*public Student(String name,int id,int course) {
		this.name=name;
		this.id=id;
		this.course=course;
	}*/
	public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
	public String getName() {
		return name;
	}
	
	public int getId() {
		return id;
	}
	public int getcourse() {
		return course;
	}
	public int incrcourse() {
		return course++;
	}
	public int getGrade() {
		return grade;
	}
	@Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
	
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter Student's name:");
	String name=input.nextLine();
	
	System.out.print("Enter Srudent's ID:");
	int id=input.nextInt();
	
	System.out.print("Enter Student's year of study:");
	int course=input.nextInt();
	
	/*Student st=new Student(name,id,course);
	System.out.println(st.getname());
	System.out.println(st.getid());
	System.out.println(st.getcourse());
	st.incrcourse();
	System.out.println(st.incrcourse());*/
	input.close();
	
	
	
	
	
}
 }