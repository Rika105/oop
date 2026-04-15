package problem6;

public class Lab6Test {
    public static void main(String[] args) {
        Animal cat = new Animal("CAT-001", "Кот");
        Person student = new Person("ST-2026", "Didar");

        Identifiable[] items = {cat, student};

        for (Identifiable item : items) {
            System.out.println("Найден объект с ID: " + item.getId());
        }
        
        student.doWork();
    }
}
