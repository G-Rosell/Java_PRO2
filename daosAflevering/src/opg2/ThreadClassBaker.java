package opg2;
import java.util.concurrent.Semaphore;

public class ThreadClassBaker extends Thread{

    Common common;
    public String navn;
    public Semaphore s;

    // -----------------------------------------------------------------------------------------------------------------

    public ThreadClassBaker(Common common, String navn, Semaphore s) {
        this.common = common;
        this.navn = navn;
        this.s = s;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public void run() {
        long startTime = System.nanoTime();
        for (int j = 0; j < 20; j++) {
            try {
                s.acquire();
                Common.callNewNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            s.release();
            long stopTime = System.nanoTime();
            long duration = (stopTime - startTime);
            System.out.println("\nKalder nr: " + Common.lastCalled + "\n Tid: " + duration/1000000 + " millisekunder");
            Common.TagerRanTid(100);
        }
    }
}