package Opg01;

import java.util.ArrayList;
import java.util.List;

public class opg01 {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(List.of(0,4,2,3,6,8,5,7,9,1));
        System.out.println(allElements(list));
    }

    public static int allElements(List<Integer> list) {
        return allElements(list, 0, list.size() - 1);
    }

    /**
     * Write a recursive method that totals all the elements in a List<Integer>. Use the template from
     * Divide-Solve-Combine (Del, Løs og kombiner).
     *
     * Returnerer sum i s[l..h]
     * Krav: l <= h
     */
    private static int allElements(List<Integer> list, int l, int h){
        int sum;
        if (l==h){
            return list.get(l);
        } else {
            int m = (l + h) / 2;
            int total1 = allElements(list, l ,m);
            int total2 = allElements(list,m + 1, h);
            sum = total1 + total2;
            return sum;
        }
    }

}

