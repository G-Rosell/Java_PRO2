import java.util.ArrayList;
import java.util.Arrays;

public class linearSearch {

    int[] array = {6,4,8,13,7};
    int target = 13;

    public linearSearch(int[] array, int target) {
        this.array = array;
        this.target = target;
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                if (i == 0) {
                    return 0;
                }
                else {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                     array[i] = temp;
                     return i - 1;
                }
            }
        }
        return -1;
}


    public static int linearSearchAL(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == target) {
                if (i == 0) {
                    return 0;
                }
                else {
                    int temp = list.get(i - 1);
                    list.set(i - 1, list.get(i));
                    list.set(i, temp);
                    return i - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {6,4,8,13,7};

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(6, 4, 8, 13, 7));

        System.out.println(Arrays.toString(array));
        System.out.println(linearSearch(array, 13));
        System.out.println();
        System.out.println(linearSearchAL(list,13));


    }
}
