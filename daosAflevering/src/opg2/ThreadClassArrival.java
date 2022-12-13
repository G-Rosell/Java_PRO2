package opg2;
import java.util.concurrent.Semaphore;

public class ThreadClassArrival extends Thread{

    Common common;
    public String navn;
    public Semaphore s;

    // -----------------------------------------------------------------------------------------------------------------

    public ThreadClassArrival(Common common, String navn, Semaphore s) {
        this.common = common;
        this.navn = navn;
        this.s = s;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public void run() {
        long startTime = System.nanoTime();
        for (int j = 0; j < 10; j++) {
            try {
                s.acquire();
                Common.takeNewNumber();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            s.release();
            long stopTime = System.nanoTime();
            long duration = (stopTime - startTime);
            System.out.println("\n Trækker nr: " + Common.lastDrawn + "\n Tid: " + duration/1000000 + " millisekunder");
            Common.TagerRanTid(10);
        }
    }
}