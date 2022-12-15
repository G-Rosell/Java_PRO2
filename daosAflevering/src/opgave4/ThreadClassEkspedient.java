package opgave4;

public class ThreadClassEkspedient extends Thread{

    Common common;

    public String navn;


    public ThreadClassEkspedient(Common common, String navn) {
        this.common = common;
        this.navn = navn;
    }


    public void run() {
        for (int j = 1; j <= 100; j++) {
            String s = null;
            try {
                s = common.kaldNummer();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("\nEkspedient kalder kunde: " + s);
            Common.TagerRanTid(100);
        }

    }

}
