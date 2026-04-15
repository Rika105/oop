package lab1;
import java.util.Scanner;
import practice2.Student;

public class GradeBookTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Course ooop = new Course("CS101", "Object-oriented Programming and Design", 5, "None");
        GradeBook gb = new GradeBook(ooop);

        gb.displayMessage();
        System.out.println("\nPlease, input grades for students:");

        String[] names = {"A", "B", "C", "D", "E"};
        for (String name : names) {
            System.out.print("Student " + name + ": ");
            int grade = sc.nextInt();
            gb.addStudent(new Student(name, grade)); 
        }

        System.out.println();
        gb.displayGradeReport();
    }
}