package problem5;

abstract class Person {
    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getOccupation();

    public void assignPet(Animal pet) {
        if (this instanceof PhDStudent && pet instanceof Dog) {
            System.out.println("Ошибка: PhDStudent " + name + " слишком занят для собаки!");
            return;
        }
        this.pet = pet;
    }

    public void removePet() { this.pet = null; }
    public boolean hasPet() { return this.pet != null; }
    public Animal getPet() { return this.pet; }

    public void leavePetWith(Person caretaker) {
        if (!this.hasPet()) {
            System.out.println(name + " не имеет питомца, чтобы его оставить.");
            return;
        }
        
        Animal temporaryPet = this.pet;
        caretaker.assignPet(temporaryPet);
        
        if (caretaker.getPet() == temporaryPet) { 
            this.removePet();
            System.out.println(name + " оставил " + temporaryPet + " у " + caretaker.name);
        }
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker.hasPet()) {
            Animal returnedPet = caretaker.getPet();
            this.assignPet(returnedPet);
            caretaker.removePet();
            System.out.println(name + " забрал " + returnedPet + " назад.");
        }
    }

    @Override
    public String toString() {
        return name + " (" + getOccupation() + "), питомец: " + (hasPet() ? pet : "нет");
    }
}

class Employee extends Person {
    private String jobTitle;
    public Employee(String name, int age, String jobTitle) {
        super(name, age);
        this.jobTitle = jobTitle;
    }
    @Override public String getOccupation() { return "Employee: " + jobTitle; }
}

class PhDStudent extends Person {
    private String major;
    private String researchTopic;
    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age);
        this.major = major;
        this.researchTopic = researchTopic;
    }
    @Override public String getOccupation() { return "PhD Student in " + major; }
}
