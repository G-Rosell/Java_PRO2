package Exc02Q203;

import java.util.LinkedHashMap;
import java.util.Map;

public class College {

    private String name;
    private final Map<Integer, Student> students = new LinkedHashMap<>();

    // ----------------------------------------------------------------------------------------------------------------

    public College(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.put(student.getStudentNo(), student);
    }

    public void removeStudent(Student student) {
     students.remove(student);
    }

    public double calcAverage() {
        double i = 0;
        double max = 0;
        for (Student s : students.values()) {
            for (Integer g : s.getGrades()) {
                max = max + g;
                i++;
            }
        }
        return max/i;
    }

    public Student findStudent(int StudentNo) {
        Student s = null;
        for (Student st : students.values()) {
            if (st.getStudentNo() == StudentNo) {
                s = st;
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "College: " + "Name: " + name + "Students" + students;
    }
}
