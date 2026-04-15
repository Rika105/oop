package pr5.io.app;

import java.io.*;
import java.util.*;

public class ExpressionParser {

    public static void main(String[] args) {

        try (
            BufferedReader br = new BufferedReader(new FileReader("input1.txt"));
            PrintWriter results = new PrintWriter("results.txt");
            PrintWriter log = new PrintWriter("log.txt");
        ) {
            String line;

            while ((line = br.readLine()) != null) {
                try {
                    StringTokenizer st = new StringTokenizer(line, "+-*/", true);

                    double a = Double.parseDouble(st.nextToken());
                    String op = st.nextToken();
                    double b = Double.parseDouble(st.nextToken());

                    double res;

                    switch (op) {
                        case "+": res = a + b; break;
                        case "-": res = a - b; break;
                        case "*": res = a * b; break;
                        case "/": res = a / b; break;
                        default: throw new UnsupportedOperationException();
                    }

                    results.println(line + " = " + res);

                } catch (NoSuchElementException e) {
                    log.println("Missing operand: " + line);
                } catch (NumberFormatException e) {
                    log.println("Invalid number: " + line);
                } catch (UnsupportedOperationException e) {
                    log.println("Unsupported operator: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}