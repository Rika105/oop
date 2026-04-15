package problem5;

public class Main {
	public static void main(String[] args) {
	    Chocolate[] fridge = {
	        new Chocolate("Mars", 50),
	        new Chocolate("Snickers", 80),
	        new Chocolate("Alpen Gold", 90),
	        new Chocolate("Kazakhstan", 100)
	    };

	    Sort.bubbleSort(fridge); 

	    for (Chocolate c : fridge) {
	        System.out.println(c);
	    }
	}

}
