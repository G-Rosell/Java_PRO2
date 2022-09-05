package Exc02Q202;


public class App {

    public static void main(String[] args) {

//        Opg2.Student s1 = new Opg2.Student("Makker Torben", 1234);
//        Opg2.Student s2 = new Student("Søster Grethe", 4321);


        Student s1 = new Student("Makker Torben", 1234);
        Student s2 = new Student("Søster Grethe",4321);

        s1.addGrade(10);
        s1.addGrade(7);
        s1.addGrade(4);

        s2.addGrade(7);
        s2.addGrade(2);
        s2.addGrade(4);

        College c1 = new College("EAA");

        c1.addStudent(s1);
        c1.addStudent(s2);

        // Tester metoden calcAverage:
        System.out.println(c1.calcAverage());

        System.out.println();

        //Tester metoden findStudent:
        System.out.println(c1.findStudent(1234));




    }
}
