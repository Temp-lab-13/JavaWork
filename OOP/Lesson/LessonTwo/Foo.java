package OOP.Lesson.LessonTwo;

// Примеры работы со статикой и приватами.
public class Foo {

    // Обычное публичное НЕстатичное поле класса.
    public Integer value;

    // Публичное Статичное поле класса.
    public static Integer count;

    // Приватное Статичное поле класса.
    private static Integer countPrivat;

    // "Правильный" способ инициализировать статичное поле класса,
    // так что бы у него изначально было не дефолтное значение.
    static {
        count = 0;
    }

    // Для получения доступа к приватному статическому полю, так же можно и нужно
    // создавать свои статичные get и set.
    public static Integer getCountPrivat() {
        return countPrivat; // Важно! Для статиков не трубетуся указатель `this`
        // return this.countPrivat; // Сразу выдаст ошибку.
    }

    // Конструктор будет срабатывать при каждом создании нового экземпляра класса.
    public Foo() {
        // count++;
    }

    public void printCount() {
        System.out.println(count);
    }

    @Override
    public String toString() {
        return value.toString(0);
    }

}
