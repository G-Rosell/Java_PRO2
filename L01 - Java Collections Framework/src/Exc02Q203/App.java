package src.Exc02Q203;


import Exc02Q202.College;
import Exc02Q202.Student;

public class App {

    public static void main(String[] args) {

        Student s1 = new Exc02Q202.Student("Makker Torben", 1234);
        Student s2 = new Student("Søster Grethe",4321);

        s1.addGrade(10);
        s1.addGrade(7);
        s1.addGrade(4);

        s2.addGrade(7);
        s2.addGrade(2);
        s2.addGrade(4);

        College c1 = new College("EAA");

       // c1.addStudent(s1);
        // c1.addStudent(s2);

        // Tester metoden calcAverage:
        System.out.println(c1.calcAverage());

        System.out.println();

        //Tester metoden findStudent:
       // System.out.println(c1.findStudent(1234));




    }
}
