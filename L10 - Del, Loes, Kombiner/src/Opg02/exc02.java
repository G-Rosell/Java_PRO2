package Opg02;

import java.util.ArrayList;
import java.util.List;

public class exc02 {

    public static int count;

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>(List.of(0,4,2,3,6,8,5,7,9,1,0,0,0,0));
        System.out.println();
        System.out.println(zeroCount(list));

    }


    public static int zeroCount(List<Integer> list) {
        return zeroCount(list, 0, list.size() - 1);
    }

    /**
     * Write a recursive method that counts the elements with value 0 in a List<Integer>. Use the
     * template from Divide-Solve-Combine.
     */

    private static int zeroCount(List<Integer> list, int l, int h){
        if(l == h){
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int low = zeroCount(list, l, m);
            int high = zeroCount(list,m + 1, h);
            if (low == 0) {
                count++;
            }
            if (high == 0) {
                count++;
            }
        }
        return count;
    }

}
