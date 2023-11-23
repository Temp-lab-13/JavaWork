package OOP.Lesson.LessonFour;

// Создаём класс, у которго указываем "Обобщённый" тип данных <E>.
// Буква может быть по сути любая, и даже слово или конретный объект, 
// главное ,что бы оно не совпадало с существующими типами данных.
public class PerametrzedWorker<E> {
    // Указываем поллю, что он должен будет принять в качестве типа тот, что будет
    // передан
    // в класс, при его создании.
    // Если мы при создании класса укажем, что String, то id будет строкой,
    // Если int, то числом.
    // и т.д.
    private E id;

    public String firstName;
    public String lastName;
    public int age;
    public int salary;

    // В конструкторе как впринципе и везде, так же важно указать что id имеет
    // обощённый тип "Е".
    public PerametrzedWorker(E id, String firstName, String lastName, int age, int salary) {
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
