package opgave3;

import java.util.concurrent.Semaphore;

public class ThreadClassArrival extends Thread{


    Common common;
    public String navn;

    public Semaphore s;
    public ThreadClassArrival(Common common, String navn) {
        this.common = common;
        this.navn = navn;
    }

    public void run() {
        for (int j = 0; j < 100; j++) {
            common.tagNytNummer();
            System.out.println("\nKunde nummer: " + Common.sidstTrukket);
            Common.TagerRanTid(1000);
        }

    }


}
