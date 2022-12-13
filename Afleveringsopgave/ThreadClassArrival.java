package Afleveringsopgave;

public class ThreadClassArrival extends Thread{


    Common common;
    public String navn;
    public int me;
    public int other;
    public ThreadClassArrival(Common common, String navn, int me, int other) {
        this.common = common;
        this.navn = navn;
        this.me = me;
        this.other = other;
    }

    public void run() {
        for (int j = 0; j < 10; j++) {
            common.in[me] = true;
            common.turn = other;
            while(common.in[other] && common.turn == other);
            Common.takeNewNumber();
            //System.out.println(common.getLastDrawn());
            Common.TagerRanTid(10);
            common.in[me] = false;
        }

    }


}
