package opgave4;


public class ThreadClassArrival extends Thread{


    Common common;
    public String navn;

    public ThreadClassArrival(Common common, String navn) {
        this.common = common;
        this.navn = navn;
    }

    public void run() {
        for (int j = 1; j <= 100; j++) {
            try {
                common.tagNummer(navn + " " +  j);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\nNy kunde " + navn + " " + j);
            Common.TagerRanTid(100);
        }

    }


}
