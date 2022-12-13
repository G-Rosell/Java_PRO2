package opg1;

import java.util.Random;

public class Common {

    static int lastCalled;
    static int lastDrawn;

    public boolean[] in = new boolean[2];
    public volatile int turn = 0;

    // -----------------------------------------------------------------------------------------------------------------

    public static void TagerRanTid (int max) {
        int x,y;
        Random r = new Random(1023);
        int max2 = Math.abs(r.nextInt()) % max + 1;
        for (int j = 0; j < max2; j++) {
            for (int i = 0; i < max2; i++) {
                x = i + j;
                y = i - j;
            }
        }
    }

    public static void takeNewNumber(){
        int temp = lastDrawn;
        lastDrawn = temp + 1;
    }

    public int getLastDrawn(){
        return lastDrawn;
    }


    public static void callNewNumber(){
        int temp = lastCalled;
        lastCalled = temp + 1;
    }

    public int getLastCalled(){
        return lastCalled;
    }
}