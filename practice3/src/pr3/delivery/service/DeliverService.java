package pr3.delivery.service;
import pr3.delivery.model.Vehicle;
import java.util.List;

public class DeliverService {
	public void printAllVehicles(List<Vehicle> vehicles) {
		for(Vehicle v:vehicles) {
			System.out.println(v.getInfo());
		}
	}
	
	public void calculateAllDeliveries(List<Vehicle> vehicles) {
		for(Vehicle v:vehicles) {
			System.out.println("Delivery cost: "+ v.calculateDeliveryCost());
		}
	}
	
	public double calculateTotalCost(List<Vehicle> vehicles) {
		double total=0;
		for(Vehicle v:vehicles) {
			total+=v.calculateDeliveryCost();
		}
		
		return total;
	}
	

}
