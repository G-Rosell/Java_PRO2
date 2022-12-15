package opgave2;

import java.util.concurrent.Semaphore;

public class ThreadClassArrival extends Thread{


    Common common;
    public String navn;

    public Semaphore s;
    public ThreadClassArrival(Common common, String navn, Semaphore s) {
        this.common = common;
        this.navn = navn;
        this.s = s;
    }

    public void run() {
        for (int j = 0; j < 10; j++) {
            try {
                s.acquire();
                Common.tagNytNummer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            s.release();
            System.out.println("\nNy kunde trækker nummer: " + Common.sidstTrukket);
            Common.TagerRanTid(10);
        }
    }
}
