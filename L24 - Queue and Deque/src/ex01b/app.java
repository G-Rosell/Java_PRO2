package ex01b;

public class app {

    public static void main(String[] args) {
        DoubleLinkedQueue pik = new DoubleLinkedQueue<>();


        System.out.println("Testing method; add()");
        pik.add(1);
        pik.add(2);
        pik.add(3);
        pik.add(4);
        pik.add(5);
        System.out.println();
        System.out.println("Testing method; size()");
        System.out.println(pik.size());
    }
}
