package Lesson.LessonSix;

public class worked {
    // Поля класса. По сути переменные,
    // в которые будут присваиватся данные,
    // характерные для конкретного экземпляра класса.
    int id;
    int salary;
    String fietName;
    String lastName;

    // Переопределение базового метода toString
    // что позволяет задать нужное поведение
    // метода.
    @Override
    public String toString() {
        String res = String.format("id:%d Name:%s LastName:%s Salary:%d", id, fietName, lastName, salary);
        return res;
    }

    // Переопределяем метод сравнения.
    // Заставляем его сравнивать в экземплярах класса поле id и поле имени. Если они
    // оба будут одинаковы, то метод equals при сравнении двух экземпляров, будут
    // выдавать true.
    @Override
    public boolean equals(Object object) {
        worked w = (worked) object;
        return id == w.id && fietName == w.fietName;
    }

    // Переопределяем хэш.
    // По сути подменям автоматическую функцию создания уникального хэша для каждого
    // экземпляра, своей, базирующейся на id. Т.е. хэшем будет id.
    @Override
    public int hashCode() {
        return id;
    }
}
