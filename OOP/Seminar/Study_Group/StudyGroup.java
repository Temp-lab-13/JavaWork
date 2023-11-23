package OOP.Seminar.Study_Group;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    private List<Student> studentList;

    public StudyGroup() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator();
    }

    public class StudentIterator implements Iterator<Student> {
        private int index;

        @Override
        public boolean hasNext() {
            return index < studentList.size();
        }

        @Override
        public Student next() {
            return studentList.get(index++);
        }

    }

}
