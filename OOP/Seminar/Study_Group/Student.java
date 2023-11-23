package OOP.Seminar.Study_Group;

public class Student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public String getString() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student {" +
                "id = " + id +
                ", name = " + name + '\'' +
                ", age = " + age +
                '}';
    }
}
