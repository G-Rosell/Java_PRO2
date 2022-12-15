package opgave3;

import java.util.Random;

public class Common {

    static int sidstKaldt;
    static int sidstTrukket;


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

    //Næste metoder
    public synchronized  void tagNytNummer(){
        int temp = sidstTrukket;
        sidstTrukket = temp + 1;
        notify();
    }

    public synchronized  void kaldNytNummer(){
        if(sidstTrukket == sidstKaldt){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            int temp = sidstKaldt;
        sidstKaldt = temp + 1;
    }
}
