package Opg03;

import java.util.Arrays;

public class Makker {


    public static void main(String[] args) {
        int[] fixedArray = {5, 10, 5, 6, 4, 9, 8};

        System.out.println();
        System.out.println("Opgave: 3");
        System.out.println(Arrays.toString(prefixAverage(fixedArray)));
    }

    public static double[] prefixAverage(int[] input) {

        double sum = 0;
        double[] newarray = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            newarray[i] = sum / (i + 1);
        }
        return newarray ;
    }


}



