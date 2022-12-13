package Exc02Q203;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private int StudentNo;
    private final List<Integer> grades = new ArrayList<>();
    private final List<Student> students = new ArrayList<>();


    // -------------------------------------------------------

    public Student(String name, int studentNo) {
        this.name = name;
        this.StudentNo = studentNo;
    }

    public int getStudentNo() {
        return StudentNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade (int grade) {
        grades.add(grade);
    }

    public List<Integer> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Student name: " + name + ", " +
                "Student number: " + StudentNo;
    }
}
