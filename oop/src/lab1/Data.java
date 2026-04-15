package lab1;

public class Data {
	private double sum;
	private double max;
	private int count;
	
	public Data() {
		this.sum=0;
		this.count=0;
		this.max=-Double.MAX_VALUE;
	}
	
	public void AddValue(double value) {
		sum=sum+value;
		if(count==0|| value>max) {
			max=value;
		}
		count++;
	}
	public double getAverage() {
		if(count==0) return 0;
		return sum/count;
	}
	public double getMax() {
		if(count==0)return 0;
		return max;
	}

}
