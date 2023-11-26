package OOP.Seminar.Study_Group.studentGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import OOP.Seminar.Study_Group.student.Student;
import OOP.Seminar.Study_Group.student.coparable.StudentComporatorByAge;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void sortByName() {
        Collections.sort(studentList);
    }

    public void sortByAge() {
        Collections.sort(studentList, new StudentComporatorByAge());
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(studentList);
    }

}
