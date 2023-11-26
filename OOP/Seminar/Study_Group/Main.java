package OOP.Seminar.Study_Group;

import OOP.Seminar.Study_Group.service.Service;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        service.addStudent("Get", 18);
        service.addStudent("Lol", 20);
        service.addStudent("Aus", 60);

        System.out.println(service);
        service.sortByName();
        System.out.println(service);
        service.sortByAge();
        System.out.println(service);
    }
}
