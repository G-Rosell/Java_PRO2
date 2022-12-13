package Afleveringsopgave;

public class ThreadClassBaker extends Thread{

    Common common;

    public String navn;

    public ThreadClassBaker(Common common, String navn) {
        this.common = common;
        this.navn = navn;
    }

    public void run() {
        for (int j = 0; j < 20; j++) {
            while (Common.lastCalled == Common.lastDrawn); // Buzy waiting
            Common.callNewNumber();
            //System.out.println("Called number " + common.getLastCalled());
            Common.TagerRanTid(15);
        }

    }

}
