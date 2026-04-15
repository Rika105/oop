package problem5;
public class PetTest {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "Comp. Science", "AI");
        
        Animal murka = new Cat("Murka", 5);
        
        john.assignPet(murka); 
        
        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);
        
        System.out.println("--- До отпуска ---");
        System.out.println(registry);
       
        john.leavePetWith(alice);
        
        System.out.println("\n--- Во время отпуска ---");
        System.out.println(registry);
        
        john.retrievePetFrom(alice);
        
        System.out.println("\n--- После возвращения ---");
        System.out.println(registry);
        
        Animal rex = new Dog("Rex", 3);
        alice.assignPet(rex); 
    }
}
