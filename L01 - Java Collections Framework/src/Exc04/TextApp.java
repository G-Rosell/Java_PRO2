package Exc04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TextApp {

    public static void main(String[] args) throws FileNotFoundException {

        String filename = "L01/src/Exc04/Text/";
        File in = new File(filename);
        try (Scanner scanner = new Scanner(in)) {
            scanner.useDelimiter("[^\\wæøåÆØÅ]+");
            Set<String> words = new TreeSet<>();
            ArrayList<String> arrWords = new ArrayList<>();
            while (scanner.hasNext()) {
                String word = scanner.next();
                words.add(word.toLowerCase());
                arrWords.add(word.toLowerCase());

            }
            // Printer opgave a)
            System.out.println("Opgave a)");
            System.out.println("Total words: " + arrWords.size());
            System.out.println("Total different words: " + words.size());
            System.out.println();
        }

        // Opgave b)

        try (Scanner scanner = new Scanner(in)) {
            scanner.useDelimiter("[^\\wæøåÆØÅ]+"); // Delimiter som fjerner gentagende ord med ,-.' mm. som fx: (hjem, hjem. hjem-
            Map<String, Integer> map = new TreeMap<>();
            int sum = 0;
            while (scanner.hasNext()) {
                String word = scanner.next();
                map.put(word.toLowerCase(), sum++);
            }
            int i = 0;
            for (String word : map.keySet()) {
                i++;
                if (i >= 1000) {
                    // Printer ord makker
                    // Skrevet ud fordi det fucker lortet makker
                    // System.out.println(word);

                }
            }
            System.out.println("Opgave b)");
            // Printer antal ord
            System.out.println("Total words: " + sum);

            // Printer de forskellige ord vha. treemap:
            System.out.println("Total different words: " + map.size());
        }

        //
    }
}
