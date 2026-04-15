package pr3.delivery.model;

public class Truck extends Vehicle {
	private int maxLoad;
	
	public Truck(String model,double baseCost,Engine engine,int maxload) {
		super(model,baseCost,engine);
		this.maxLoad=maxLoad;
	}
	
@Override
public double calculateDeliveryCost() {
	return baseCost + maxLoad * 5;
}

public double calculateDeliveryCost(double distance,double fuelPrice) {
	return calculateDeliveryCost() + distance * fuelPrice;
}
@Override
public String getInfo() {
	return super.getInfo() + ", Max load: "+ maxLoad;
}
	

}
