package pr3.delivery.model;

public class Car extends Vehicle {
	private int numberofSeats;
	
	public Car(String model,double baseCost,Engine engine,int numberofSeats) {
		super(model,baseCost,engine);
		this.numberofSeats=numberofSeats;
	}

@Override
public double calculateDeliveryCost() {
	return baseCost + numberofSeats*10;
}
	
	
public double calculateDeliveryCost(double extraWeight) {
	return calculateDeliveryCost() + extraWeight *2;
	}

@Override
public String getInfo() {
	return super.getInfo() + ", Number of seats: "+ numberofSeats;
	}
	

}
