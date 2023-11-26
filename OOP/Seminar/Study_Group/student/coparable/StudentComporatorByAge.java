package OOP.Seminar.Study_Group.student.coparable;

import java.util.Comparator;

import OOP.Seminar.Study_Group.student.Student;

public class StudentComporatorByAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
