package OOP.Lesson.LessonFour;

// Класс может сдержать несколько обощённых Параметров.
// Они просто должны записваться через запятую, и разумеется иметь различное название.
public class MultiParametzidWorker<E1, E2, E3> {

    // Используется множественные обощённые параметры ровно так же как и один.
    private E1 id;
    public String firstName;
    public String lastName;
    public E2 age;
    public E3 salary;

    public MultiParametzidWorker(E1 id, String firstName, String lastName, E2 age, E3 salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }

}
