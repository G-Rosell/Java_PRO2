package opgave2;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {

        Common c1 = new Common();

        Semaphore s = new Semaphore(1);

        Thread Ekspedient = new ThreadClassEkspedient(c1,"Ekspedient",s);
        Thread trækkerEt = new ThreadClassArrival(c1, "FørsteTræk",s);
        Thread trækkerTo = new ThreadClassArrival(c1, "NæsteTræk",s);


        trækkerEt.start();
        trækkerTo.start();
        Ekspedient.start();

        long startTid = System.nanoTime();
        try {
            trækkerEt.join(); trækkerTo.join(); Ekspedient.join();
        } catch (InterruptedException e){
            e.getStackTrace();
        }
        long slutTid = System.nanoTime();
        long varighed = (slutTid - startTid);
        System.out.println();
        System.out.println("Total tid: " + varighed/1000000 + " ms");
        }
}
