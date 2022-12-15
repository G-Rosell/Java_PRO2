package opgave2;

import java.util.concurrent.Semaphore;

public class ThreadClassEkspedient extends Thread{

    Common common;

    public String navn;

    public Semaphore s;

    public ThreadClassEkspedient(Common common, String navn, Semaphore s) {
        this.common = common;
        this.navn = navn;
        this.s = s;
    }

    public void run() {
        long startTid = System.nanoTime();
        for (int j = 0; j < 20; j++) {
            try {
                s.acquire();
                Common.kaldNytNummer();

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            s.release();
            System.out.println("\nEkspedient kalder nummer " + Common.sidstKaldt);
            Common.TagerRanTid(100);
        }

    }

}
