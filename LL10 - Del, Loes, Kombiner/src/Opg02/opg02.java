package Opg02;

import java.util.ArrayList;
import java.util.List;

public class opg02 {

    public static int count;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(List.of(0,4,2,3,6,8,5,7,9,1,0,0,0,0,0,0,0,0,0));
        System.out.println();
        System.out.println(countZeroes(list));

    }


    public static int countZeroes(List<Integer> list) {
        return countZeroes((ArrayList<Integer>) list, 0, list.size() - 1);
    }

    /**
     * Write a recursive method that counts the elements with value 0 in a List<Integer>. Use the
     * template from Divide-Solve-Combine.
     */

    private static int countZeroes(ArrayList<Integer> list, int l, int h) {
        if (l == h) {
            if(list.get(l) == 0) {
                return 1;
            } else {
                return 0;
            }
        } else {
            int m = (l + h) / 2;
            int count1 = countZeroes(list, l, m);
            int count2 = countZeroes(list, m + 1, h);
            return count1 + count2;
        }
    }





}