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
            Common.takeNewNumber();
            long stopTime = System.nanoTime();
            long duration = (stopTime - startTime);
            Common.TagerRanTid(100);
            System.out.println("\n Sidst kaldte nummer: " + Common.lastCalled + "\n Tid: " + duration/1000000 + " millisekunder");
        }
    }
}