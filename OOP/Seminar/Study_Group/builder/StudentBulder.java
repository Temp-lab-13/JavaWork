package OOP.Seminar.Study_Group.builder;

import OOP.Seminar.Study_Group.student.Student;

public class StudentBulder {
    private int maxId;

    public Student build(String name, int age) {
        Student student = new Student(maxId++, name, age);
        return student;
    }

}
