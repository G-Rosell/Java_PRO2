import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SolutionA {
    public static void main(String[] args) throws IOException {

        // Opgave a)

//        TreeSet<String> words = new TreeSet<>(); // Create a TreeSet to store all different words
//        ArrayList<String> arrWords = new ArrayList<>(); // Create an ArrayList to store all with duplicates words
//        // Read the words from the text file and add them to the TreeSet
//        String filename = "LL01 - Java Collections Framework/src/Gjoengehoevdingen";
//        File in = new File(filename);
//        try (Scanner scanner = new Scanner(in))  {
//            scanner.useDelimiter("[^\\wæøåÆØÅ]+"); // Delimiter, som fjerne gentagende ord med "',-.'" mm. som fx; hjem, hjem. hjem- osv.
//            while (scanner.hasNext()) {
//                String word = scanner.next();
//                words.add(word.toLowerCase());
//                arrWords.add(word.toLowerCase());
//
//            }
//            // Print all words in the set, the total number of words, and the number of different words
//            System.out.println("All words in the set: " + words);
//            System.out.println();
//            System.out.println("Total number of words: " + arrWords.size());
//            System.out.println();
//            System.out.println("Number of different words: " + words.size());
//        }
        // Opgave b)
//        String filename = "LL01 - Java Collections Framework/src/Gjoengehoevdingen";
//        File in = new File(filename);
//        try (Scanner scanner = new Scanner(in)){
//            scanner.useDelimiter("[^\\wæøåÆØÅ]+"); // Delimiter, som fjerne gentagende ord med "',-.'" mm. som fx; hjem, hjem. hjem- osv.
//            Map<String, Integer> map = new TreeMap<>();
//            int count = 0;
//            while (scanner.hasNext()) {
//                String word = scanner.next();
//                map.put(word.toLowerCase(), count++);
//            }
//            int siu = 0;
//            for (String word : map.keySet()) {
//                siu++;
//                if (siu >= 1000) {
//                    System.out.println(word);
//                }
//            }
//            System.out.println();
//            System.out.println("Total words: " + count);
//            System.out.println("Total different words: " + map.size());
//        }

        // Opgave c)
        LinkedHashMap<Integer, Set<String>> hashCodeTing = new LinkedHashMap<>();

        String filename = "LL01 - Java Collections Framework/src/Gjoengehoevdingen";
        File in = new File(filename);
        try (Scanner scanner = new Scanner(in)){
            while (scanner.hasNext()) {
                String word = scanner.next();

                // calculate the hash code of the word
                int hashCode = word.hashCode();

                // Get the set of words with the same hash code
                Set<String> wordsWithSameHashCode = hashCodeTing.get(hashCode);
                if (wordsWithSameHashCode == null) {
                    // if there is not set of words with the same hashcode yet, create a new set and add it
                    wordsWithSameHashCode = new HashSet<>();
                    hashCodeTing.put(hashCode, wordsWithSameHashCode);
                }
                // add the word to the set of words with the same hash code
                wordsWithSameHashCode.add(word);
            }
        } catch (IOException e) {

        }
        for (int hashCode : hashCodeTing.keySet()) {
            Set<String> wordsWithSameHashCode = hashCodeTing.get(hashCode);
            if (wordsWithSameHashCode.size() == 2) {
                System.out.println("Hash code: " + hashCode);
                System.out.println("Set of words:" + wordsWithSameHashCode);
            }
        }
    }
}
