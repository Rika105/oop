package pr5.io.app;

import java.io.*;
import java.util.Random;

public class SensorApp {
    public static void main(String[] args) {

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("sensor.bin"))) {

            Random rand = new Random();

            for (int i = 0; i < 60; i++) {
                double temp = 15 + (35 - 15) * rand.nextDouble();
                dos.writeDouble(temp);
            }

        } catch (IOException e) {}

        
        try (RandomAccessFile raf = new RandomAccessFile("sensor.bin", "rw")) {
            raf.seek(29 * 8); 
            raf.writeDouble(999.9);
        } catch (IOException e) {}

        
        try (DataInputStream dis = new DataInputStream(new FileInputStream("sensor.bin"))) {

            double max = Double.MIN_VALUE;
            double sum = 0;

            for (int i = 0; i < 60; i++) {
                double val = dis.readDouble();
                sum += val;
                if (val > max) max = val;
            }

            System.out.println("Average: " + (sum / 60));
            System.out.println("Max: " + max);

        } catch (IOException e) {}
    }
}
