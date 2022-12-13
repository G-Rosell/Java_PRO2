package opg3;

public class ThreadClassBaker extends Thread{

    Common common;
    public String navn;

    // -----------------------------------------------------------------------------------------------------------------

    public ThreadClassBaker(Common common, String navn) {
        this.common = common;
        this.navn = navn;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public void run() {
        long startTime = System.nanoTime();
        for (int j = 0; j < 20; j++) {
            Common.callNewNumber();
            long stopTime = System.nanoTime();
            long duration = (stopTime - startTime);
            Common.TagerRanTid(15);
            System.out.println("\nKalder nr: " + Common.lastCalled + "\n Tid: " + duration/1000000 + " millisekunder");
        }
    }
}