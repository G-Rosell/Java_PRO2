package opg1;

public class ThreadClassArrival extends Thread{


    Common common;
    public String navn;
    public int me;
    public int other;

    // -----------------------------------------------------------------------------------------------------------------

    public ThreadClassArrival(Common common, String navn, int me, int other) {
        this.common = common;
        this.navn = navn;
        this.me = me;
        this.other = other;
    }

    // -----------------------------------------------------------------------------------------------------------------

    public void run() {
        long startTime = System.nanoTime();
        for (int j = 0; j < 10; j++) {
            common.in[me] = true;
            common.turn = other;
            while(common.in[other] && common.turn == other);
            Common.takeNewNumber();
            Common.TagerRanTid(50);
            long stopTime = System.nanoTime();
            long duration = (stopTime - startTime);
            System.out.println("\n Senest trukkede nummer: " + Common.lastDrawn + "\n Tid: " + duration/1000000 + " millisekunder");
            common.in[me] = false;
        }
    }
}