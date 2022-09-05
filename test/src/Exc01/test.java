package Exc01;

import java.util.ArrayList;

public class test {

    public String name;

    private final ArrayList<Student> students = new ArrayList<>();

    // ------------------------------------------------


    public String getName() {
        return name;
    }


    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(){

    }

}
