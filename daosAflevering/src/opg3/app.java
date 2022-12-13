package opg3;

public class app {

    public static void main(String[] args) throws InterruptedException {
        Common c1 = new Common();

        Thread bagerMakker = new ThreadClassBaker(c1,"BagerMakker");
        Thread t1 = new ThreadClassArrival(c1, "Makker 1");
        Thread t2 = new ThreadClassArrival(c1, "Næste makker");

        // -----------------------------------------------------------------------------------------------------------------

        t1.start();
        t2.start();
        bagerMakker.start();

        long startTime = System.nanoTime();
        try {
            t1.join(); t2.join(); bagerMakker.join();
        } catch (InterruptedException e){
            throw new InterruptedException();
        }
        long slutTime = System.nanoTime();
        long duration = (slutTime - startTime);
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println();
        System.out.println("Total tid: " + duration/1000000 + " millisekunder");
    }
}