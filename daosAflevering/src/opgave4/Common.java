package opgave4;

import java.util.Random;

public class Common {

    int n = 200;
    String[] buffer = new String[n];
    int nextin = 0;
    int nextout = 0;
    int count = 0;



     public synchronized void tagNummer(String x) throws InterruptedException {
        while(count == buffer.length) wait();
        buffer[nextin] = x;
        nextin = (nextin + 1) % buffer.length;
        count++;
        notifyAll();
    }

    public synchronized String kaldNummer() throws InterruptedException {
         String x;
         while(count == 0) wait();
         x = buffer[nextout];
         nextout = (nextout + 1) % buffer.length;
         count--;
         notifyAll();
         return x;
    }



    //Random
    public static void TagerRanTid (int max)
    {
        int x,y;
        Random r = new Random(1023);
        int max2 = Math.abs(r.nextInt()) % max +1;
        for (int j=0; j<max2; j++) {
            for (int i=0; i<max2; i++) {
                x = i + j;
                y = i - j;
            }
        }
    }

}
