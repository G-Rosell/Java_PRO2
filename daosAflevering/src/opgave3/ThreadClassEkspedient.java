package opgave3;


public class ThreadClassEkspedient extends Thread{

    Common common;

    public String navn;


    public ThreadClassEkspedient(Common common, String navn) {
        this.common = common;
        this.navn = navn;
    }


    public void run() {
        for (int j = 0; j < 200; j++) {
            common.kaldNytNummer();
            System.out.println("\nEkspedient kalder nr : " + Common.sidstKaldt);
            Common.TagerRanTid(100);
        }

    }

}
