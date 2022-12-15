package opgave3;

public class Main {
    public static void main(String[] args) {

        Common c1 = new Common();

        Thread Ekspedient = new ThreadClassEkspedient(c1,"Ekspedient");
        Thread trækkerEt = new ThreadClassArrival(c1, "FørsteTræk");
        Thread trækkerTo = new ThreadClassArrival(c1, "NæsteTræk");


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
