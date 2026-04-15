package problem1;

abstract class Animal {
 String name;

 void breathe() {
     System.out.println("Животное дышит...");
 }

 abstract void makeSound();
}

interface Swimmable {
 void swim();
}


 public class Penguin extends Animal implements Swimmable {
 @Override
 void makeSound() {
     System.out.println("Пингвин крякает");
 }

 @Override
 public void swim() {
     System.out.println("Пингвин отлично плавает в ледяной воде");
 }
}