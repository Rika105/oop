package pr5.io.app;

import java.io.*;
import java.util.*;

public class WordCounter {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                line = line.toLowerCase().replaceAll("[^a-zа-я0-9 ]", "");

                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        map.put(word, map.getOrDefault(word, 0) + 1);
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("File error");
        }

        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        try (PrintWriter pw = new PrintWriter("report.txt")) {
            for (Map.Entry<String, Integer> entry : list) {
                pw.println(entry.getKey() + " : " + entry.getValue());
            }
        } catch (IOException e) {
            System.out.println("Write error");
        }
    }
}
