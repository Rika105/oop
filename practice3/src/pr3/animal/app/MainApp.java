package pr3.animal.app;
import pr3.animal.model.*;
import java.util.*;

public class MainApp {
	public static void main(String[]  args) {
		Animal dog1=new Dog("Buddy",3,"Labrador");
		Dog dog2= new Dog("Max",5,"German Shepherd");
		
		List<Animal> animals=new ArrayList<>();
		animals.add(dog1);
		animals.add(dog2);
		
		for(Animal a:animals) {
			a.makeSound();
			a.eat();
			a.eat("meat");
			a.getInfo();
			
		}
		
		
		
	}

}
