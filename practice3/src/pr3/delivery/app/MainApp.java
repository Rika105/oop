 package pr3.delivery.app;
import pr3.delivery.model.*;
import pr3.delivery.service.*;
import java.util.*;

public class MainApp {
	public static void main(String[] args) {
		Engine engine1=new Engine("Petrol",180);
		Engine engine2=new Engine("Diesel",300);
		
		Car car=new Car("Toyota Camry",1000,engine1,5);
		Truck truck= new Truck("Volvo truck",2000,engine2,10);
		
		List<Vehicle> vehicles=new ArrayList<>();
		vehicles.add(car);
		vehicles.add(truck);
		
		DeliverService service=new DeliverService();
		
		service.printAllVehicles(vehicles);
		service.calculateAllDeliveries(vehicles);
		
		System.out.println("Total cost: "+ service.calculateTotalCost(vehicles));
		
	}

}
