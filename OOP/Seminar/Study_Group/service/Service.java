package OOP.Seminar.Study_Group.service;

import OOP.Seminar.Study_Group.builder.StudentBulder;
import OOP.Seminar.Study_Group.student.Student;
import OOP.Seminar.Study_Group.studentGroup.StudyGroup;

public class Service {
    private StudyGroup group;
    private StudentBulder builder;

    public Service() {
        group = new StudyGroup();
        builder = new StudentBulder();
    }

    public void addStudent(String name, int age) {
        Student student = builder.build(name, age);
        group.addStudent(student);
    }

    public String getStudentListInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Список студентов: \n");
        for (Student student : group) {
            stringBuilder.append(student);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void sortByName() {
        group.sortByName();
    }

    public void sortByAge() {
        group.sortByAge();
    }

    @Override
    public String toString() {
        return getStudentListInfo();
    }

}
