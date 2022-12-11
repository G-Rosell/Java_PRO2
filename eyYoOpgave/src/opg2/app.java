package opg2;

import java.util.concurrent.Semaphore;

public class app {

    public static void main(String[] args) throws InterruptedException {
        Common c1 = new Common();
        Semaphore s = new Semaphore(1);

        Thread bagerDame = new ThreadClassBaker(c1,"Bagerdame", s);
        Thread t1 = new ThreadClassArrival(c1, "Kunde1",s);
        Thread t2 = new ThreadClassArrival(c1, "Kunde11",s);

        // -----------------------------------------------------------------------------------------------------------------

        t1.start();
        t2.start();
        bagerDame.start();

        long startTime = System.nanoTime();
        try {
            t1.join(); t2.join(); bagerDame.join();
        } catch (InterruptedException e){
            throw new InterruptedException();
        }
        long slutTime = System.nanoTime();
        long duration = (slutTime - startTime);
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("Senest trukkede: " + c1.getLastDrawn());
        System.out.println("Sidste kaldte: " + c1.getLastCalled());
        System.out.println("Total tid: " + duration/1000000 + " millisekunder");
    }
}