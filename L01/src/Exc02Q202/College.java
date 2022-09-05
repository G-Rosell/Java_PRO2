package Exc02Q202;

import java.util.LinkedHashSet;
import java.util.Set;

public class College {

    private String name;
    private final Set<Student> students = new LinkedHashSet<>();

    // ----------------------------------------------------------------------------------------------------------------

    public College (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
     students.remove(student);
    }

    public double calcAverage() {
        double i = 0;
        double max = 0;
        for (Student s : students) {
            for (Integer g : s.getGrades()) {
                max = max + g;
                i++;
            }
        }
        return max/i;
    }

    public Student findStudent(int StudentNo) {
        Student s = null;
        for (Student st : students) {
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
