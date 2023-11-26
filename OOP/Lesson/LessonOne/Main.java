package OOP.Lesson.LessonOne;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        // Создаём экземпляр класса - point.
        // При помощи дефолного или описанного пустого конструктора.
        Point2D point = new Point2D();
        // При момощи конструктора на два аргумента (x and y).
        Point2D point2 = new Point2D(0, 2);
        // При помощи конструктора на один аргумент. (тольлко х).
        Point2D point3 = new Point2D(0);

        // Если попытаться распечатать экземпляр класса то мы не получим
        // никакой внятной информации, и уж в темболее ничего о содержимом экземпляра.
        System.out.println(point2);
        // Но если мы создадим отдельный метод который будет возращать содерицимое
        // полей экземпляра класса, то сможем узнать что лежит в х и y.
        // так же можно переопределить метод toString, прописав ему нужное поведение.
        // но лучше этого избегать.
        System.out.println(point2.getInfo());

        // Создаём новый экземпляр класса.
        Point2Dv2 point2d = new Point2Dv2(10, 20);
        System.out.println(point2d.getX()); // получим значение х = 10, через метод get
        point2d.setY(15); // меняем значение y на 15, через метод set.

    }
}