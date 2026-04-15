package problem4;


import java.util.Date;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee("Ivan", 500.0, new Date(), "INS001");
        Employee emp2 = new Employee("Anna", 700.0, new Date(), "INS002");

        Manager boss = new Manager("Didar", 2000.0, new Date(), "BOSS01", 500.0);
        boss.addEmployee(emp1);

        Manager bossClone = (Manager) boss.clone();
        bossClone.addEmployee(emp2);

        System.out.println("Original team size: " + boss.toString());
        System.out.println("Clone team size: " + bossClone.toString());
        
        if (emp2.compareTo(emp1) > 0) {
            System.out.println("Анна получает больше Ивана");
        }
    }
}