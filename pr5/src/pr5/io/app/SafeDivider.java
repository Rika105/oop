package pr5.io.app;

import java.util.Scanner;
import java.util.InputMismatchException;

public class SafeDivider {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter first number: ");
                int x1 = Integer.parseInt(scan.nextLine());

                System.out.print("Enter second number: ");
                int x2 = Integer.parseInt(scan.nextLine());

                int result = x1 / x2;

                System.out.println("Result: " + result);
                break;

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero!");
            } catch (NumberFormatException e) {
                System.out.println("Error: Enter valid integers!");
            }
        }

        scan.close();
    }
}
