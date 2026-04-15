package problem3;

public class TestCollection {
    public static void main(String[] args) {
   
        MyCollection<String> students = new MyList<>();

        students.add("Didar");
        students.add("Almaty");
        students.add("Java Developer");

   
        System.out.println("Сколько элементов в списке? " + students.size());
        
        if (students.contains("Didar")) {
            System.out.println("Дидар найден в списке!");
        }

       
        MyCollection<Integer> grades = new MyList<>();
        grades.add(95);
        grades.add(100);
        
        System.out.println("Количество оценок: " + grades.size());
        
        students.clear();
        System.out.println("Список пуст после очистки? " + students.isEmpty());
    }
}
