package pr3.delivery.model;

public class Vehicle {
	protected String model;
	protected double baseCost;
	protected Engine engine;
	
	public Vehicle(String model,double baseCost,Engine engine) {
		this.model=model;
		this.baseCost=baseCost;
		this.engine=engine;
	}
	
	public double calculateDeliveryCost() {
		return baseCost * 1.1;
	}
	
  public String getInfo() {
	  return "Model: " + model + " , Base cost: " + baseCost + " , Engine type: "+ engine.getType() + " , Horse power: " + engine.getHorsePower(); }

}
