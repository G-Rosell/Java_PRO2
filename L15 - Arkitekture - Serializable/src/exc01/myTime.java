package exc01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class myTime implements Serializable {

    /**
     * Lav en klasse MyTime, der indeholder en private int time som initialiseres til 0. Lav også
     * følgende metoder:
     *  increase(), forhøjer time med 1
     *  reset(), nulstiller time til 0
     *  getTime(), returnerer time
     */


    // ------------------------------------------ // ------------------------------------------ //

    private int time = 0;
    private List<String> times = new ArrayList<>();

    // ------------------------------------------ // ------------------------------------------ //

    public myTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void increase() {
        time = time + 1;
    }

    public void reset() {
        time = 0;
    }

    public List<myTime> getTimes() {
        return new ArrayList<>(time);
    }

    public void addTime() {
        times.add(String.valueOf(time));
    }

    // ------------------------------------------ // ------------------------------------------ //

    public static void main(String[] args) {
        // myTime mt = new myTime(0);
       myTime mt = loadMyTime();

        System.out.println("myTime starter på: " + mt.getTime());
        mt.increase();
        mt.increase();
        mt.increase();
        mt.increase();

        System.out.println("Timeren er nu: " + mt.getTime());

        savedMyTime(mt);
        mt.addTime();
        System.out.println(mt.getTime());
    }

        public static void savedMyTime(myTime time){
        String filename = "L15 - Arkitekture - Serializable/src/exc01/myTime.ser";
            try (FileOutputStream fileOut = new FileOutputStream(filename);
                 ObjectOutputStream objOut = new ObjectOutputStream(fileOut)) {
                objOut.writeObject(time);
// error handling
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static myTime loadMyTime() {
            myTime time;
            String filename = "L15 - Arkitekture - Serializable/src/exc01/myTime.ser";
            try (FileInputStream fileIn = new FileInputStream(filename);
                 ObjectInputStream objIn = new ObjectInputStream(fileIn)
            ) {
                Object obj = objIn.readObject();
                time = (myTime) obj;
                System.out.println("Antal timer er hentet: " + time.getTime());
                return time;
            } catch (ClassCastException ex) {
                System.out.println("Class of serialized object changed");
                System.out.println(ex);
                return null;
            } catch (IOException ex) {
                System.out.println("Error reading file");
                System.out.println(ex);
                return null;
            } catch (ClassNotFoundException ex) {
                System.out.println("Class of serialized object not found");
                System.out.println(ex);
                return null;
            }
        }

}
