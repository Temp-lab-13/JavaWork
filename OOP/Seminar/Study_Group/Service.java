package OOP.Seminar.Study_Group;

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

}
