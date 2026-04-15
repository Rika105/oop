package lab1;
import java.util.ArrayList;
import practice2.Student; 

public class GradeBook {
    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>();
    }
    

    public void addStudent(Student s) {
        students.add(s);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course + "!"); 
    }

    public void displayGradeReport() {
        if (students.isEmpty()) return;

        System.out.println("Class average is " + determineClassAverage() + ".");
        
        Student low = students.get(0);
        Student high = students.get(0);

        for (Student s : students) {
            if (s.getGrade() < low.getGrade()) low = s;
            if (s.getGrade() > high.getGrade()) high = s;
        }

        System.out.println("Lowest grade is " + (int)low.getGrade() + 
            " (Student " + low.getName() + ", id: " + low.getId() + ").");
        System.out.println("Highest grade is " + (int)high.getGrade() + 
            " (Student " + high.getName() + ", id: " + high.getId() + ").");

        outputBarChart();
    }

    public double determineClassAverage() {
        double sum = 0;
        for (Student s : students) sum += s.getGrade();
        return sum / students.size();
    }

    public void outputBarChart() {
        System.out.println("\nGrades distribution:");
        int[] distribution = new int[11];

        for (Student s : students) {
            int grade = (int)s.getGrade();
            if (grade == 100) distribution[10]++;
            else distribution[grade / 10]++;
        }

        for (int i = 0; i < distribution.length; i++) {
            if (i == 10) System.out.print("  100: ");
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int j = 0; j < distribution[i]; j++) System.out.print("*");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook of " + course.getName();
    }
}