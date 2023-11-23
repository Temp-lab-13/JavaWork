package OOP.Seminar.Study_Group;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Get", 18);
        service.addStudent("Lol", 20);
        service.addStudent("Sus", 60);

        System.out.println(service.getStudentListInfo());
    }
}
