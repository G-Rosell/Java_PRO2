package opg3;

public class ThreadClassArrival extends Thread{

    Common common;
    public String navn;

    // -----------------------------------------------------------------------------------------------------------------

    public ThreadClassArrival(Common common, String navn) {
        this.common = common;
        this.navn = navn;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public void run() {
        long startTime = System.nanoTime();
        for (int j = 0; j < 10; j++) {
            Common.takeNewNumber();
            long stopTime = System.nanoTime();
            long duration = (stopTime - startTime);
            Common.TagerRanTid(10);
            System.out.println("\nTrækker nr: " + Common.lastDrawn + "\n Tid: " + duration/1000000 + " millisekunder");
        }
    }
}