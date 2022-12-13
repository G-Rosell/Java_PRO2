package Afleveringsopgave;

public class app {
    public static void main(String[] args) throws InterruptedException {
        Common c1 = new Common();


        Thread bagerDame = new ThreadClassBaker(c1,"Bagerdame");
        Thread t1 = new ThreadClassArrival(c1, "Kunde1",1,0);
        Thread t2 = new ThreadClassArrival(c1, "Kunde11",0,1);

        bagerDame.start();
        t1.start();
        t2.start();

        try {
            t1.join(); t2.join(); bagerDame.join();
        } catch (InterruptedException e){
            throw new InterruptedException();
        }
        System.out.println(c1.getLastDrawn());
        System.out.println(c1.getLastCalled());
    }
}
