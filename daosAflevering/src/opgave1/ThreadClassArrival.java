package opgave1;
 public class ThreadClassArrival extends Thread{


     Common common;
     public String navn;
     public int mig;
     public int anden;
     public ThreadClassArrival(Common common, String navn, int mig, int anden) {
         this.common = common;
         this.navn = navn;
         this.mig = mig;
         this.anden = anden;
     }

     public void run() {
         for (int j = 0; j < 10; j++) {
             common.in[mig] = true;
             common.turn = anden;
             while(common.in[anden] && common.turn == anden);
             Common.tagNytNummer();
             Common.TagerRanTid(50);
             System.out.println("\nNy kunde trækker nummer: " + Common.sidstTrukket);
             common.in[mig] = false;
         }
     }
 }
