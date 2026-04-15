package lab1;

public class TemperatureTest {
    public static void main(String[] args) {
        Temperature t1 = new Temperature(); 
        Temperature t2 = new Temperature(100); 
        Temperature t3 = new Temperature('F');
        Temperature t4 = new Temperature(98.6, 'F');

        System.out.println("--- Тест конструкторов ---");
        System.out.println("T1 (default): " + t1.getCelsius() + " C");
        System.out.println("T4 (Fahrenheit): " + t4.getFahrenheit() + " F");

        System.out.println("\n--- Тест конвертации ---");
        System.out.println("100C в Фаренгейтах: " + t2.getFahrenheit() + " F");
        System.out.println("98.6F в Цельсиях: " + t4.getCelsius() + " C");
 
        System.out.println("\n--- Тест изменения значений ---");
        t1.setValueAndScale(36.6, 'C');
        System.out.println("Новая температура T1: " + t1.getCelsius() + " " + t1.getScale());
    }
}
