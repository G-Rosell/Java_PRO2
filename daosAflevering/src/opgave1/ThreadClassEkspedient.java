package opgave1;

public class ThreadClassEkspedient extends Thread{

    Common common;

    public String navn;

    public ThreadClassEkspedient(Common common, String navn) {
        this.common = common;
        this.navn = navn;
    }

    public void run() {
        for (int j = 0; j < 20; j++) {
            while (Common.sidstKaldt == Common.sidstTrukket); // Buzy waiting
            Common.kaldNytNummer();
            Common.TagerRanTid(100);
            System.out.println("\nEkspedient kalder nummer " + Common.sidstKaldt);
        }

    }

}
