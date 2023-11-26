package OOP.Seminar.Study_Group.studentGroup;

import java.util.Iterator;
import java.util.List;

import OOP.Seminar.Study_Group.student.Student;

public class StudentIterator implements Iterator<Student> {
    private int index;
    private List<Student> studentList;

    public StudentIterator(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return index < studentList.size();
    }

    @Override
    public Student next() {
        return studentList.get(index++);
    }
}
