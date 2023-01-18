package Opg03;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>(Arrays.asList(8, 56, 45, 34, 15, 12, 34, 44));
        System.out.println();
        System.out.println("Printing list before mergeSort: " + testList);
        System.out.println();


        // testing merge...
        MergeSort ms = new MergeSort();
        ms.mergeSort(testList);

        System.out.println("Printing list after mergeSort: " + testList);
    }

    /**
     * Exercise 3;
     *
     The paper on Divide-Solve-Combine contains most of the code necessary to do a merge sort.
     The implementation of the method merge() is missing.
     Write the merge() method.
     Test your merge sort on [8, 56, 45, 34, 15, 12, 34, 44].
     */

    private void mergeSort(ArrayList<Integer> list, int l, int h) {
        if (l < h) {
            int m = (l + h) / 2;
            mergeSort(list, l, m);
            mergeSort(list, m + 1, h);
            merge(list, l, m, h);
        }
    }
    private void merge(ArrayList<Integer> list, int low, int middle, int high) {
        // Create temporary arrays to store the sublists
        int[] left = new int[middle - low + 1];
        int[] right = new int[high - middle];
        for (int i = 0; i < left.length; i++) {
            left[i] = list.get(low + i);
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = list.get(middle + 1 + i);
        }
        // Merge the sublists back into the original list
        int i = 0;
        int j = 0;
        int k = low;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                list.set(k, left[i]);
                i++;
            } else {
                list.set(k, right[j]);
                j++;
            }
            k++;
        }
        // Add any remaining elements from the sublists
        while (i < left.length) {
            list.set(k, left[i]);
            i++;
            k++;
        }
        while (j < right.length) {
            list.set(k, right[j]);
            j++;
            k++;
        }
    }

    public void mergeSort(ArrayList<Integer> list) {
        mergeSort(list, 0, list.size() - 1);
    }

    /**
     * 1): The merge() method takes in three parameters: an ArrayList of integers (list),
     * an integer low and an integer high which represent the indices of the first and last element of the sublist to be merged,
     * and an integer middle which represents the middle index of the sublist.
     *
     * 2): The method creates two temporary arrays, left and right,
     * to store the elements of the left and right sublists, respectively.
     * The size of the left array is middle - low + 1 and size of the right array is high - middle.
     *
     * 3): It then copies the elements of the left sublist from the original list into the left array,
     * and the elements of the right sublist into the right array.
     *
     * 4): The method then initializes three pointers i, j, and k to 0.
     * i and j are used to traverse the left and right arrays, respectively,
     * and k is used to traverse the original list.
     *
     * 5): The method enters a while loop that continues as long as both i and j
     * are less than the size of their respective arrays.
     * Inside the while loop, the method compares the element at the ith
     * index of the left array with the element at the jth index of the right array.
     *
     * 6): If the element in the left array is less than or equal to the element in the right array,
     * the element at the ith index of the left array is placed at the kth index of the original list,
     * and i is incremented.
     *
     * 7): If the element in the left array is greater than the element in the right array, the element at the jth index of the right array is placed at the kth index of the original list, and j is incremented.
     *
     * 8): The while loop continues until either i or j reaches the end of their respective arrays.
     *
     * 9): After the while loop, the method enters two more while loops, one for each of the remaining elements in the left and right arrays, if any. These elements are added to the original list starting at the index k.
     *
     * 10): When both the while loops finish, the list passed as an argument will have the merged sublist in sorted order.
     *
     */

}
