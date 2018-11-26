package university;

import java.util.ArrayList;

public class Group {

    private String name;
    private Student headman;
    private ArrayList<Student> students;


    public Group(String name, Student headman) {
        this.name = name;
        this.headman = new Student(headman.getName(),headman.getAge());
        students = new ArrayList<Student>();
        students.add(headman);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getHeadman() {
        return headman;
    }

    public void setHeadman(Student headman) {
        this.headman = headman;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudentInGroup(Student st) {
        students.add(st);
    }
}