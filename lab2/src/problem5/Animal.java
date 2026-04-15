package problem5;

abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String getSound();
    
    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + name;
    }
}

class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }
    @Override public String getSound() { return "Meow"; }
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }
    @Override public String getSound() { return "Woof"; }
}

class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }
    @Override public String getSound() { return "Chirp"; }
}
