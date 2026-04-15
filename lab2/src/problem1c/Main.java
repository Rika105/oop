package problem1c;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		HashSet<Car> cars=new HashSet<>();
		Car car1=new Car("Toyota",2020,"Camry");
		Car car2=new Car("Toyota", 2020,"Camry");
		cars.add(car2);
		cars.add(car1);
		
		
		System.out.println(car1.equals(car2));
		System.out.println(cars.size());
	}

}
