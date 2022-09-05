package Exc02Q201;

import java.util.ArrayList;
import java.util.List;

public class College {

    private String name;
    private final List<Student> students = new ArrayList<>();

    // ----------------------------------------------------------------------------------------------------------------

    public College (String name){
        this.name = name;
    }

    public List<Student> getStudents() {
        return new ArrayList<>(students);
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

    // ----------------------------------------------------------------------------------------------------------------

    public double calcAverage() {
        double count = 0;
        double max = 0;
        for (Student s : students) {
            for (Integer g : s.getGrades()) {
                max = max + g;
                count++;
            }
        }
        return max/count;
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

    // ----------------------------------------------------------------------------------------------------------------

    @Override
    public String toString() {
        return "College: " + "Name: " + name + "Students" + students;
    }
}
