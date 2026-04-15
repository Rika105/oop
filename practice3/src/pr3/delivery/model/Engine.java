package pr3.delivery.model;

public class Engine {
	private String type;
	private double horsePower;
	
	public Engine(String type,double horsePower) {
		this.type=type;
		this.horsePower=horsePower;}
	public void getInfo(){
		System.out.println("Type: "+ type);
		System.out.println("Horsepower: "+ horsePower);
	}
	
	public String getType() {
		return type;
	}
	
	public double getHorsePower() {
		return horsePower;
		
	}

}
