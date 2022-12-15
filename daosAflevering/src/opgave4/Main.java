package opgave4;

public class Main {
    public static void main(String[] args) {

        Common c1 = new Common();

        Thread Ekspedient1 = new ThreadClassEkspedient(c1,"Ekspedient 1");
        Thread Ekspedient2 = new ThreadClassEkspedient(c1,"Ekspedient 2");
        Thread trækker1 = new ThreadClassArrival(c1, "Torben");
        Thread trækker2 = new ThreadClassArrival(c1, "Michael");


        trækker1.start();
        trækker2.start();
        Ekspedient1.start();
        Ekspedient2.start();

        long startTid = System.nanoTime();
        try {
            trækker1.join(); trækker2.join(); Ekspedient1.join(); Ekspedient2.join();
        } catch (InterruptedException e){
            e.getStackTrace();
        }
        long slutTid = System.nanoTime();
        long varighed = (slutTid - startTid);
        System.out.println();
        System.out.println("Total tid: " + varighed/1000000 + " ms");
    }
}
