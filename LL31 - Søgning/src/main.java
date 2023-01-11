import java.lang.reflect.Array;
import java.nio.charset.MalformedInputException;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

public class main {
    public static void main(String[] args) {
        // Generate an array of random integers
        Random r = new Random();
        int[] ints = r.ints(1000000, 1, 10000).toArray();

        // Create three ArrayList objects with the same numbers
        int[] numbers4 = ints.clone();
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();
        for (int e : ints) {
            numbers1.add(e);
            numbers2.add(e);
            numbers3.add(e);
        }

        // Measure the execution time of the bubble sort algorithm
        long startTime = System.currentTimeMillis();
        bubbleSort(numbers1);
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Execution time of bubble sort: " + elapsedTime + " milliseconds");

        // Measure the execution time of the selection sort algorithm
        startTime = System.currentTimeMillis();
        selectionSort(numbers2);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Execution time of selection sort: " + elapsedTime + " milliseconds");

        // Measure the execution time of the insertion sort algorithm
        startTime = System.currentTimeMillis();
        insertionSort(numbers3);
        endTime = System.currentTimeMillis();
        elapsedTime = endTime - startTime;
        System.out.println("Execution time of insertion sort: " + elapsedTime + " milliseconds");

        // Measure the execution time of the insertion sort algorithm
        startTime = System.currentTimeMillis();
        endTime = System.currentTimeMillis();
        quickSort(numbers4, 1, 10);
        elapsedTime = endTime - startTime;
        System.out.println("Execution time of quick sort: " + elapsedTime + " milliseconds");
    }

    public static void bubbleSort(ArrayList<Integer> numbers) {
        // Implementation of bubble sort algorithm
        int n = numbers.size();
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numbers.get(j) > numbers.get(j+1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j+1));
                    numbers.set(j+1, temp);
                }
            }
        }
        /**
         * BobleSort:
         *
         * Gennemløber gentagne gange ArrayList, sammenligner tilstødende elementer og bytter dem, hvis de er i den forkerte rækkefølge
         * Det største element "bobler op" til slutningen af ArrayList med hver iteration, indtil ArrayList er sorteret
         * Tidskompleksitet: O(n^2)
         */
    }

    public static void selectionSort(ArrayList<Integer> numbers) {
        // Implementation of selection sort algorithm
        int n = numbers.size();
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (numbers.get(j) < numbers.get(minIndex)) {
                    minIndex = j;
                }
            }
            int temp = numbers.get(minIndex);
            numbers.set(minIndex, numbers.get(i));
            numbers.set(i, temp);
        }
        /**
         * SelectionSort:
         *
         * Vælger gentagne gange det mindste element fra den usorterede del af ArrayList og tilføjer det til den sorterede del
         * Tidskompleksitet: O(n^2)
         */
    }

    public static void insertionSort(ArrayList<Integer> numbers) {
        // Implementation of insertion sort algorithm
        int n = numbers.size();
        for (int i = 1; i < n; i++) {
            int key = numbers.get(i);
            int j = i - 1;
            while (j >= 0 && numbers.get(j) > key) {
                numbers.set(j+1, numbers.get(j));
                j--;
            }
            numbers.set(j+1, key);
        }
        /**
         * InsertionSort:
         *
         * Indsætter gentagne gange det næste element på den korrekte position i den sorterede del af ArrayList
         * Tidskompleksitet: O(n^2)
         */
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = (low - 1);

        for (int  j = low; j <= high - 1; j++){
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }


/**
 * Bemærk: Tidskompleksiteten for en algoritme refererer til mængden af tid, der skal bruges for at køre den, i forhold til størrelsen af input. O(n^2) betyder, at tiden for algoritmen er proportionel med kvadratet af størrelsen af input.
 */
}
