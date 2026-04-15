package lab1;
import java.util.Scanner;

public class Analyzer {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Data data=new Data();
		while(true) {
			System.out.print("Enter number or (Q to quit)");
			String input=scanner.next();
			if(input.equals("Q")||input.equals("q")) {
				break;
			}
			try {
				double val=Double.parseDouble(input);
				data.AddValue(val);
			}
			catch(NumberFormatException e){
				System.out.println("Invalid input.PLease enter a number or Q");
			}
		}
		System.out.println("Average = "+ data.getAverage());
		System.out.println("Maximum = "+ data.getMax());
		scanner.close();
	}


}
