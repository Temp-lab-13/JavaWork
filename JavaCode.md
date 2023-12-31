# Java

Для запуска выполнения файла с консоли, необходимо перейти в папку с запускаемым файлом, указать ключевое слово `java`, и после него указать полное название файла, вместе с его расширением:

```java
java название_файла.java
```
## Комментарии

Комнетарии в java трёх типов.
* Однстрочные
* Многострочные
* Документация.

Они призваны описывать код, оставлять замечания, напоминания. Они не являються частью кода и игнорируются системой при запуске приложения.

_Однострочные:_
```java
// Всё что после, считается в строке комментарием.
```

_Многострочные:_
```java
/*
Первая пара `слэш+звезда` - начало многострочного комментария.
ВТорая пара `звезда+слэш` - конец, закрывающий комментария.
Всё что между ними, соответсвенно - комментарии.
*/
```
_Документация:_
```java
/**
 *  
*/
```

## Снипиты
> __Снипиты__ - это ключевые слова - подсказки среды разработки, позволяюбщие быстро создать контсрукции кода, с помощью этой самой среды, без необходимости полность их прописывать.
 
_Общие синпиты:_ 

`main` - создание точки входа.

`class` - создание класса
### Вывод данных.

_Снипит:_ `sysout` -> `System.out.println()`

Выводит в консоль указанное в аргументах `()` значение, которым может быть: сторка, число, содержимое переменной
или результат вычисления / сравнения.
```java
System.out.println("Текст");
System.out.println(5);
System.out.println(5 + 5);
System.out.println(a);
```
Для получения длины строки или конкретного символа строки, требуется применить соответсвующие методы `length()` и `charAt()`:
```java
String msg = "текст";
System.out.println(msg.length()); // длина 5
System.out.println(msg.charAt(1)); // Вывод: е
```

Для вывода содерижмого __массива__ (целиком), требуется дополнительная конструкция вызывающая один из методов массивов: `Arrays.toString()`, в аргумент которого передаётся сам массив, который нужно вывести:
```java
System.out.println(Arrays.toString(массив));
```

### Форматирование выводимых данных.
Есть два общих способа отформатировать вводимую строку:
* Конкотинация
* format

_Конкотинация:_

Позволяет склеивать строки, числа и содерижмое переменных с помощь символа `+`. 
```java
System.out.println("Текст" + "Текст"); // ТекстТекст
System.out.println(5 + "Текст"); // 5Текст
System.out.println("Текст" + " Текст"); // Текст Текст
System.out.println(5 + 5); // 10 
String a = "И ещё текст";
System.out.println("Текст"+10+а); // Текст10"И ещё текст
```

_format:_

Метод позволяет создать шаблон из символовЮ, текста и спецификаторов, по которому будет производиться вывод. Важен порядок значений/переменных, которые указываются после шаблона в том порядке в котром должны применяться к позициями в шаблоне.
```java
int a = 1, b = 2;
int c = a + b;
System.out.printf("%d + %d = %d \n", a, b, c); // 1 + 2 = 3
// %d - один из спецификаторов ответвенный за тип int.
// И значения или переменные, в нашем случаи это: a, b, c; указываются в строгом порядке, после шаблона. Если b поставить первой, то и в шаблоне она примениться к первой позиции.
// Если же нужно положить тформатированную строку в переменную, требуется явно указать String.format()
String res = String.format("%d + %d = %d \n", a, b, c) 
// и вывод тогда возможен только чыерез println
System.out.println(res);
```
Спецификаторы имеют разные виды, которые отвечают за вывод определённого типа данных. 
* `%d`: целочисленных значений
* `%x`: для вывода шестнадцатеричных чисел
* `%f`: для вывода чисел с плавающей точкой
* `%e`: для вывода чисел в экспоненциальной форме,
например, 3.1415e+01
* `%c`: для вывода одиночного символа
* `%s`: для вывода строковых значений

Если нужно ограничить при вывод число знаков после запятой:
```java
float pi = 3.1215f;
System.out.println("%f\n", pi); //  3.121500
System.out.println("%.2f\n", pi); // 3.14
System.out.println("%.3f\n", pi); // 3.141
System.out.println("%e\n", pi); // 3.141500e+00
System.out.println("%.2e\n", pi); // 3.14e+00
System.out.println("%.3e\n", pi); // 3.141e+00
```

### Ввод данных.
Ввод данных требует приготовлений.
 * глобальный импорт `java.util.Scanner;`
 * Создание экземляра класса `Scanner`
 * Вызов экземпляра для инициализации ввода и указания соответсвубщего модификатора.
 * Завершение.

__Важно!__, для ввода разных типов данных, нужен соответсвующий модификатор, который классифицирует каким типом данных будут введённые с консоли значения: 

* `nextLine()` - срочный тип данных.
* `nextInt()` - целочисленный тип данных.
* `nextDouble()` - вещественный тип данных.

И так далее. Пример:

```java
import java.util.Scanner;
//импорт записывается в не класса, в самом верху.
Scanner iScanner = new Scanner(System.in);
String text = iScanner.nextLine();
// Последняя строка отвечает за непосрественный ввод
// с консоли, в данном случаи - строки. 
// И присвоение введёного значения переменной,
// в данном случаи имеющей название `taxt`.
// Разумеется, ввод не обязательно сохранять в перменную,
// если он будет использоваться сразу же.
iScanner.close();
// Завершение операции.
```

Так же, можно проверить ввсёдённый тип данных на соответсвие ожидаемому:
```java
boolean flag = iScanner.hasNextInt();
```
#### Создание переменных.
Для создания переменной прежде необходимо строго указать тип данных, которые будут ей присваиваться. 
Далее - название переменной. с маленькой буквы.
```java
int number; // пустая переменная, типа int.
int numberTwo = 5; // переменная типа int с присвоением ей значения при создании. 
String s = null; // пустая переменная типа String.
```

#### Типы данных.
_Ссылочные типы данных:_
```java
String hello = "Hello Neo5+! ";
// Хранит строку. По сути массив символов. размер зависи от строки.
```
_Примитивные типы данных:_
```java
boolean b = true; 
boolean b2 = 123 < 234; // true
boolean b3 = true ^ false; // false.
// хранит true или false.
byte by = 3;
// хранит целое число от -128 до 127 и занимает 1 байт.
short sh = 6; 
// хранит целое число от -32768 до 32767 и занимает 2 байта.
int i = 5;
// хранит целое число от -2147483648 до 2147483647 и занимает 4 байта.
long l = 5;
// хранит целое число от –9 223 372 036 854 775 808 до 9 223 372 036 854 775 807 и занимает 8 байт
float f = 8.5F;
// хранит число с плавающей точкой от -3.4*1038 до 3.4*1038 и занимает 4 байта
double d = 8.5;
// хранит число с плавающей точкой от ±4.9*10-324 до ±1.7976931348623157*10308 и занимает 8 байт
char ch = 'g';
хранит одиночный символ в кодировке UTF-16 и занимает 2 байта, поэтому диапазон хранимых значений от 0 до 65535
```
_Неявный тип данных:_

Создание переменной, тип данных которой будет неявно определён, когда эти данных ей будут присвоены.
Удобно, когда, изначально не известно, какой тип данных может оказаться присвоен переменной.
```java
var v = 123;
var v2 = "string";
var v3 = 2.3;
var v4 = '{';
```
_Обёртки:_
Дают доступ к более расширенному функционалу/методам аналогичных типов данных. Инициализация аналогична примитивам:
```java
Integer I = 1;// int
Short Sh = 2; // short
Long L = 3; // long
Byte B = 3; // byte
Float F = 2.3f; //float
Double D = 2.5; // double
Character Ch = 'c'; // char
Boolean Bool = true; // boolean
```
#### Преобразование типов данных
Один тип данных можно неявно преобразовать в другой тип данных. При условии, что преобразуемое значение 'влазит' в новый тип данных. А так же, что они совместимы. Нельзя число 12 преобразовать в true. 

Кроме того, рпи преоббразовании вещественных чисел в целые, вся вещественная часть числа просто потеряется. 

_Неявное преобразование типа:_
```java
int a = 12; // 12
byte b = a; // 12
double d = (int)3.14; // 3.14
int i = d; // 3
```
Так же возможно преобразование типов. Оно требует явного указания типа, в который необходимо пробразовать данные.
_Явное преобразование типа:_
```java
double d = 3.14; // 3.14
int i = Integer.parseInt(d); // 3
```

### Операции
* Присваивание: =
* Арифметические: *, /, + , -, %, ++, --
* Сравнения: <, >, ==, !=, >=, <=
* Логические: ||, &&, ^, !
* Побитовые: <<, >>, &, |, ^
 
### Операторы условия и выбора

__if-else:__
Оператор условия позволяет проверить выражение на да/нет, и выполнить содержимо блока, если условие верно.
Может состояти из одного if, или if и нескольких(неограничено) дополнительных блоков else if, в которых будут проверячться другие условия, работающие по тому же принципу. 
Блок else - финальный(необязательный), и выполняется если не одно из предыдущих условий блока if/if else не было выполнено.
```java
if (a < b) {
    System.out.println("Число а больше");
} else if (a > b) {
    System.out.println("Число b больше");
} else {
    System.out.println("Числа равны.");
}
```
__Тёрнарный оператор `?`__
Позволяет проверить выражение на да/нет, и вернуть одно из двух значений: первое, если условие Да, второе, если условие Нет:
```java
int a = 1;
int b = 2;
int min = a < b ? a : b; // в min вернётся 1.
```

__Оператор выбора switch__
Принимает одно значение, и сверяет его с прописанными в теле ключами. При совпоении ключа с переданным значением, выполняет принадлежащий ему блок, игнорируя остальные.
```java
switch (number) {
case 1:
    код;
    break;
case 2:
    код;
    break;
case 3:
    код;
    break;
default:
    код;
    // этот блок всегда выполняется, если не выполниться
    // ни одни другой сверху. Аналог else.
    break;
}
```

### Циклы

__Whike__
```java
int a = 0;
while (a < 5){
    /*
    Цикл будет повторять выполнение кода
    пока усовие цикла(a < 5) будет `true`.
    При это, условие проверяется перед тем как,
    выполнить код тела цикла.
    */
   а++;
   /*
   Прервать цикл можно лишь нарушив условие,
   искуственно создав счётчик, который будет увеличиваться
   при каждойитерации цикла, или использовав какой-нибудь флаг булевого значения, который измениться с true на falsh, при определённом условие.
   Так же есть такие операторы как break, позволяющие принудительно закончить цикл. И continium, позволяющий прервать текущую итерацию и перейти к следующей.
   */
}
```

__doWhile__
```java
do {
    /*
    Цикл будет повторять выполнение кода
    пока усовие цикла(a < 5) будет `true`.
    При это, условие проверяется после того как,
    выполнить код тела цикла один раз.
    */
   а++;
} while (a < 5)
```

__for__
```java
for (int i = 0; i < 5; i++){
    /*
    Цикл будет повторять выполнение кода
    пока усовие цикла(i < 5) будет `true`.
    Счётчик уже входи в конструкцию (хотя и может быть опущен).
    Так же, кроме одно i, может быть инициализировано несколько переменных. Или не одной.
    */
}
```
__forIn__
```java
for (int item : arr){
    // цикл позволяет принять коллекцию (условный arr), и перебрать его элементы. При этом, элементы будут присваиваться по очереди переменной условно item, что позволяет их просмтореть не обращась к индексам, но не позволяет провести с ними манипуляции изменющие переданную коллекцию.
}
```
## Функции
Отдельный блок, в котором описывается независимый блок кода, выполняющий каку-то конкретную задачу, и который можно вызвать в любой части программы, не повторяя уже написанный код.

Функция состоит из модификатора доступа (`public/privat`), если его нет, то моификатор по умолчанию (близок по свойству с public).
Далее, указывается статичный(`static`) он или нет.
Далее указывается тип возращаемых данных: `int`, `String`, `bollean` и т.д. Или, если функция ничего не возращает, то указывается `void`.
Далее указывается название метода, по которому его будут вызывать (с маленькой буквы).
Далее, если метод принимает какие-то значения, то в `()` указывается тип данных и переменная в которую будет положено переданное значение, и которая будет использоваться исключительно в пределах функции.

* Функция может принимать любые значения, или ничего не принимать. 
* Функция может возращать любые значения, или ничего не возвращать.
* Функция может вызывать саму себя.

_Функция void (что-т длеает но ничего не возращает):_
```java
static void nameFunction () {
    System.out.println("Текст");
    /* Вызываемая функция ничего не принимает и не возращает, и просто при вызове выводит "Текст"
    */
}
static void nameFunction (String number) {
    System.out.println(number);
    /* Вызываемая функция принимает что-то типа String, ничего не возращает, и просто при вызове выводит полученный в number текст.
    */
}
```
```java
static int nameFunction () {
    return 5;
    /* Вызываемая функция ничего не принимает и возращает какие-то данные типа int. При вызове вернёт "5"
    */
}
static int nameFunction (int number) {
    return number;
    /* Вызываемая функция принимает что-то типа int, и возращает number, тип данных которой int.
    */
}
```

## Массивы
Инициализация массива.

Необьходимо указать тип данных(к примеру: `int`), а после название массива. После чего присвоить ему дилну в конструкции `new тип_данных[длина]` или сразу указать значения в контрукции `new тип_данных[] {певое_значение, второе_значение, и_т.д}`
```java
int[] arr1 = new int[10];
// Создаём пустой массив и задём ему длину 10.
int[] arr2 = new int[] {1, 2, 3, 4}; //1 вариант.
int[] arr3 = {1, 2, 3, 4}; // 2 Вариант.
// Создаём массив и вкладываем в него значения. 
// Длина будет соответсвовать колличеству указанных значений.
int[] arry[] = new int[3][5];
// Инициализация двумерного массива.
int[][] arri = new int[3][5];
//Инициализация массива массивов.
```

Обращение к элементу массива.
```java
int[] arr = new int[] {1, 2, 4};
arr[1] // 2 
arr[1] = 13 // 2-ку в массиве заменит число 13
```

## Коллиекции

### ArrayList
Похож на массив в принципах своей работы: элменты так же хронятся по индексам, по которым могут быть быстро получены. Основное различие - в готовых методах позволяющих "менять" размер массива, добавляя иои удаляя элементы.

_Создание листа._ (акутуально для почти любого типа коллектции.)
```java
// Сырой лист без обозначения типа.
// В него можно положить любой ти данных (одинаковый).
// Но, из-за его преобразования в Object, раотает медленей.
ArrayList list = new ArrayList();
// Тиизированный лист. Предпочтительней.
ArrayList<Integer> list = new ArrayList<Integer>();
ArrayList<Integer> list2 = new ArrayList<>();
// Создание листа с определённым размером(его можно менять)
ArrayList<Integer> list3 = new ArrayList<>(10); 
// Создание листа с присвоением значений другого листа.
ArrayList<Integer> list4 = new ArrayList<>(list3);
```
### Варианты разных типов Листов.
```java
// Двусвязный списко.
LinkedList<type> list = new LinkedList<type>();
// Очередь. 
// Первый элемент обрабатывается првым.
Queue<type> listQueue = new LinkedList<type>();
// Приоритетная очередь.
// Первым обрабатывается наименьший элемент.
PriorityQueue<type> listPQ = new PriorityQueue<type>();
// Двухвостая очердь.
// Елемент может быть обрабаота как первый с начала,
// так и первый с конца.
Deque<type> listD = new ArrayDeque<type>();
// Стэк. Или приоритеная очередь с конца.
// Последний элемент обрабатывается первым.
Stack<type> listST = new Stack<type>();
```

_Добавление эелмена в ArrayList._
```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(23);
```
_Вывод элемента ArrayList._
```java
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(23);
list.add(1);
// По индексу элемента.
ystem.out.println(list[0]); // Вывод: [23]
// Вывод каждого элемента через форич.
for (Object o : list) {
    System.out.println(o);
}
```

Другие методы для ArrayList.
```java
add(args)
// добавляет элемент в список ( в т.ч. на нужную позицию)
get(pos)
// возвращает элемент из списка по указанной позиции
indexOf(item) 
// первое вхождение или -1
lastIndexOf(item) 
// последнее вхождение или -1
remove(pos) 
// удаление элемента на указанной позиции и его возвращение
set(int pos, T item) 
// помещает значение item элементу, который находится
на позиции pos
void sort(Comparator) 
// сортирует набор данных по правилу
subList(int start, int end) 
// получение набора данных от позиции start до end
clear() 
// очистка списка
toString() 
// «конвертация» списка в строку
Arrays.asList 
// преобразует массив в список
containsAll(col) 
// проверяет включение всех элементов из col
removeAll(col) 
// удаляет элементы, имеющиеся в col
retainAll(col) 
// оставляет элементы, имеющиеся в col
toArray() 
// конвертация списка в массив Object’ов
toArray(type array) 
// конвертация списка в массив type
List.copyOf(col) 
// возвращает копию списка на основе имеющегося
List.of(item1, item2,...) 
// возвращает неизменяемый список
```

### HashMap

> #### __Map__ - это множество коллекций, работающих с данными пр принципу < ключь / значение >.

Ключевые особенности:
 * ускоренная обработка данных;
 * порядок обавление не запоминается;
 * ключь обязан быть уникальным;
 * в тоже время ключом может быть `null`;
 * значения могут быть не уникальными.

 В `HashMap` элементы распологаются беспоряочно и мгут менять своё положение. 

 _Создание HashMap:_
 ```java
 Map <Integer, String> hM = new HashMap<>();
 Map <Integer, String> hM = new HashMap<Integer, String>();
 // Integer - первое, тип данных ключа.
 // String - второе, тип данных значения (элементы).
 // Тип данных ключей и значениий могут быть любыми (почти).
 Map <Integer, String> hM = new HashMap<>(9);
 // 9 - заранее заданный размер HashMap.
 Map <Integer, String> hM = new HashMap<>(9, 1.0f);
 // 1.0f - предел, после которого лист увеличивается.
 // В данном случаи, лист увеличится, только когда он будет заполнен полность.
 // Но можно указать и меньшше значение: 0.5f
 // И тогда лисчт будет увеличиваться при заполнение элементами уже на половине.
 ```
_Добавление элементов в HashMap:_
 ```java 
 hM.put(2, "two"); // 2 - ключь, "two" - значение.
 hM.putIfAbsent(1, "One"); // с проверкой на наличие данного ключа. 
 // Если такой ключь уже есть, то ничего не добавится.
 hM.put(null, "three"); // Пример с ключом `null`.
 ```
 _Вывод элементов в HashMap:_
 ```java
 System.out.println(hM); // Выведет все пары ключь/значения.
 System.out.println(hM.keySet()); // только все ключи.
 System.out.println(hM.values()); // только все элементы.
 System.out.println(hM.get(1)); // "One"
 System.out.println(hM.containsValue("One")); // true
 System.out.println(hM.containsKey(3)); // falsh 
// Перебор с помощью цикла:
 for (var item: hM.entrySet()) {
    System.out.println("[%d: %s]\n", item.getKey(), intem.getValue());
 }
 ```
 _Удаление элемента:_
 ```java
 hM.remove(2); // уадалит элемент по ключу `2`.
 ```
### TreeMap

Так же работает по принципу < ключь / значение>, с тем лишь отличием, что задаваемые ключи упорядычиваются. Логику сортировки, в случаи работы с непонятными типами (котики), стоит прописываться в ручную. 
_Создание TreeMap:_
 ```java
 TreeMap <Integer, String> tMap = new TreeMap<>();
 TreeMap <Integer, String> tMap = new TreeMap<Integer, String>();
 // Integer - первое, тип данных ключа.
 // String - второе, тип данных значения (элементы).
 // Тип данных ключей и значениий могут быть любыми (почти).
 TreeMap <Integer, String> tMap = new TreeMap<>(9);
 // 9 - заранее заданный размер TreeMap.
 ```

 ### LinkedHashMap
Аналогичен HashMap, за тем исключением, что запоминает расположение внесённых элементов. За что расплачивается более медленной работой сними.

_Создание LinkedHashMap:_
 ```java
 Map <Integer, String> LinhM = new LinkedHashMap<>();
 Map <Integer, String> LinhM = new LinkedHashMap<Integer, String>();
 // Integer - первое, тип данных ключа.
 // String - второе, тип данных значения (элементы).
 // Тип данных ключей и значениий могут быть любыми (почти).
 Map <Integer, String> LinhM = new LinkedHashMap<>(9);
 // 9 - заранее заданный размер HashMap.
 ```
### HashTable
Устарело и не актуально. Отличается от обычного HashMap тем, что нельзя использовать `null` в качестве ключа.

_Создание Hashtable:_
 ```java
 Map <Integer, String> hT = new Hashtable<>();
 Map <Integer, String> hT = new Hashtable<Integer, String>();
 // Integer - первое, тип данных ключа.
 // String - второе, тип данных значения (элементы).
 // Тип данных ключей и значениий могут быть любыми (почти).
 Map <Integer, String> hT = new Hashtable<>(9);
 // 9 - заранее заданный размер HashMap.
 ```

###  Коллекции Set

* Коллекции, содержащие уникальные элементы.
* Быстрая обработка данных.
* "Основаны" на Map`ах без пары.
* Порядок добавления не сохраняется.

#### HashSet
 _Создание HashSet:_
 
 В `< >` указывается тип данных, что будет храниться в коллекции. Также в `( )` можно указать изначальный размер коллекции.
 ```java
 Set <Integer> set = new HashSet<>();
 Set <Integer> set2 = new HashSet<Integer>();
 Set <Integer> set3 = new HashSet<>(9);
 var set4 = new HashSet<Integer>(set); // копируем в set4.
 ```
_Получение элемента (работает со всеми Set-коллекциями):_
```java
set.first(); // Первый элемент.
set.last(); // Последний элемент.
set.headSet(element); // Все элементы, которые меньше element.
set.taikSet(element); // Все элементы которые больше element.
subSet(element1, element2); // Все элементы от element1 до element2.
```
_Методы (работают со всеми Set-коллекциями):_
```java
set.isEmpty() // проверка на пустоту коллекции.
set.add(element) // добавление элемента в коллекцию.
set.remove(element) // удаление элмента из коллекции.
set.contains(element) // проверка на наличие элемента в коллекции.
set.clear() // очиска всей коллекции (удаление всего).
set.size() // возращает размер коллекции.
set.addAll(set2); // объединят множество set и Coll
set.retainAll(set2); // ворзращает пересечение множеств.
set.removeAll(set2); // возращает разность множеств.
```
#### TreeSet

* В основе коллекции HashMap.
* Элементы упорядывачаются по возрастанию.
* null-в быть не может.

_Создание TreeSet:_
 ```java
 Set <Integer> set = new TreeSet<>();
 Set <Integer> set2 = new TreeSet<Integer>();
 Set <Integer> set3 = new TreeSet<>(9);
 var set4 = new TreeSet<Integer>(set); // копируем в set4.
 ```
#### LinkedHashSet
* В основе коллекции HashMap.
* Запоминается порядок добавленных элементов.

_Создание LinkedHashSet:_
```java
 Set <Integer> set = new LinkedHashSet<>();
 Set <Integer> set2 = new LinkedHashSet<Integer>();
 Set <Integer> set3 = new LinkedHashSet<>(9);
 var set4 = new LinkedHashSet<Integer>(set); // копируем в set4.
 ```
## Итератор
`Iterator<E>` - `Е` - тип данных.

Методы: `hasNext()`, `next()`, `remove()`.
```java
Iterator<Integer> col = list.iterator();
while (col.hasNext()) {
System.out.println(col.next());
}
```
`ListIterator<E> URL`

Методы: `hasPrevious()`, `E previous()`, `nextIndex()`, `previousIndex()`, `set(E e)`, `add(E e)`

## API

> #### _Application programming interface_ (API) - это контракт, который предоставляет пограмма. "Ко мне можно обращаться так и так, я обязуюсь делать это."

### Строки
_Класс `StringBuilder` значительно ускоряет обработку больших строк:_
```java
// Пример создания строки из миллиона `+`.
// Скорость выполнения значительно выше чем, 
// если бы мы использовали обычный 'String'.
StringBuilder text = new StringBuilder();
for (int i = 0; i < 1_000_000; i++) {
    text.append("+");
}
```
_Методы `StringBuilder`:_
```java
StringBuilder text = new StringBuilder();
text.append("текст"); //Добавление в строку
```
_Методы `String`:_
```java
String text = "текст текст";
text.concat() 
// Объединение строк
text.valueOf() 
// Преобразует Object в строковое представление (завязан на toString())
text.join() 
// Объединяет набор строк в одну с учетом разделителя
text.charAt() 
// Получение символа по индексу
text.indexOf() 
// Первый индекс вхождения подстроки
text.lastIndexOf() 
// Последний индекс вхождения подстроки
text.startsWith()/endsWith() 
// Определяет, начинается/заканчивается ли строка с подстроки
text.replace() 
// Замена одной подстроки на другую
text.trim()
// Удаляет начальные и конечные пробелы
text.substring() 
// Возвращает подстроку, см.аргументы
text.toLowerCase()/toUpperCase() 
// Возвращает новую строку в нижнем/верхнем регистре
text.сompareTo() 
// Сравнивает две строки
text.equals() 
// Сравнивает строки с учетом регистра
text.equalsIgnoreCase() 
//Сравнивает строки без учета регистра
text.regionMatches() 
//Сравнивает подстроки в строках
```

### Работа с файлами
_Подключение файла, и содание переменной с данными их него, для работы с ним в коде:_
```java
File f1 = new File("file.txt");
File f2 = new File("/Users/sk/vscode/java_projects/file.txt");

```
_Сохранение пути к файлу в отдельную переменную:_
```java
// Относительный путь к папке, где храниться файл.. 
// (относительно нашего исполняемого файла, к пирмеру.)
String pathProject = System.getProperty ("user.dir" );
// Используя сохранённый путь к папке (pathProject), 
// указываем название и расширение нужного файла,
// хранящегося в этой папке.
String pathFile = pathProject .concat("/file.txt" );
// Загружаем в перменную f3 файл, связывая их по
// пути который записан в переменной 'pathFile'
File f3 = new File(pathFile);
// Метод 'getAbsolutePath()' позволяет получить
// абсолютный путь переменной связанной с файлом..
System.out.println(f3.getAbsolutePath());
//Вывод: /Users/sk/vscode/java_projects/file.txt
```
_Запись в файл:_
```java
// Создание переменной для работы с файлом по пути 
// указанном в аругментах.
FileWriter wr = new FileWriter(filePath);
// Указывается что должно быть записано в файл.
wr.write("text");
// Добавляет перенос строки относительно последней записи.
wr.append('\n'); 
// Добовляет символ. Можно ли добавить слово?
wr.append('0');
// непосредственно запись ранее указанного в методах `wr`
wr.flush();
// закрытие подключение к файлу.
wr.close();
```
_Методы работы с файлами или папками:_
```java
isHidden() 
// Возвращает истину, если каталог или файл является скрытым
length() 
// Возвращает размер файла в байтах
lastModified() 
// Возвращает время последнего изменения файла или каталога
list()
// Возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles()
// Возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
mkdir()
// Создает новый каталог
renameTo(File dest)
// Переименовывает файл или каталог
length()
// Возвращает размер файла в байтах
lastModified()
// Возвращает время последнего изменения файла или каталога
list()
// Возвращает массив файлов и подкаталогов, которые находятся в каталоге
listFiles() 
// Возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
mkdir()
// Создает новый каталог
renameTo(File dest)
// Спереименовывает файл или каталог
```
### Обработка ошибок.
Обработчик `try-catch` Позволяет поймать ошибку, обработать её (вывести предупреждение, лог или даже тип), и пробложить выполнение программы, не останавляивая её. (программа проболжит работать даже с ошибкой, а не упадёт.)
```java
try {
//Код, в котором может появиться ошибка
} catch (Exception e) {
//Обработка, если ошибка случилась, то выполнится это блок.
}
finally {
//Код, который выполнится в любом случае после отработки
// блокак try, или даже если если сработает catch.
}
```
_Проброска возникшего исключения/ошибки, на уровень выше способом `throws`:_
```java
public static void main(String[] args) {
        String filePath = "SeminarTwo/text.txt";
        String text = "TEST";
        //Вызов метода. Именно сюда будет проброшено исключение, где его нужно будет обработать, иначе, программа упадёт.
        writeFile(text, filePath);
        
    }
// Работа с файлами требует обязательно обработчика 
// исключений, иначе, программа не запустится.
// Однако, `throws Exception` позволяет выкинуть возникшую ошибку из метода на уровень выше. В данном случаи в корневой метод `main`, где и вызывается данный метод `writeFile`, для того что бы возмоную ошибку можно было боработать там.
static void writeFile(String text, String filePath) throws Exception {
        FileWriter writer = new FileWriter(filePath);
        writer.write(text);
        writer.flush();
        writer.close();
    }
```
#### Логирование

Для использования необходимо создать объект, к которому мы приаязем логируемый класс или метода (это можно указать в аргументах`getLogger()`):
`Logger loge = Logger.getLogger()`

После, необходимо создать объект-вывод, который будет опреелять куда будут выводиться логи, к примеру в консоль:

`ConsoleHandler info = new ConsoleHandler();`

`loge.addHandler(info);` 

(для вывода же __в файл__ - `FileHandler`, в аргументах указывается файла для записи.)
Далее нобходимо объекту выводу казать формат:

`SimpleFormatter sFormat = new SimpleFormatter();`

`info.setFormatter(sFormat);`

(Форматы бывают разных видов, к пирмеру: XMLFormatter, SimpleFormatter)

И лишь после этого всего выбирается тип лога. (Основные типы логов: INFO, DEBUG, ERROR, WARNING и др.) Которые указываются либо аргументом, либо методом в соответсвии со своим названием:

`loge.log(Level.WARNING, "Тестовое логирование" );`

`loge.info("Тестовое логирование" )`

Сдесь же указывается и необходимый текст - пояснение.
```java
// Пример в коде. с форматом вывода `SimpleFormatter`.
import java.util.logging.*;
public class Ex0043 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Ex0043.class.getName());
        logger.setLevel(Level.INFO);
        ConsoleHandler ch = new ConsoleHandler ();
        logger.addHandler (ch);
        SimpleFormatter sFormat = new SimpleFormatter ();
        ch.setFormatter (sFormat);
        logger.log(Level.WARNING, "Тестовое логирование" );
        logger.info("Тестовое логирование" );
    }
}
```

#### Секундомер.
```java
long resalt;
long timeStart = System.currentTimeMillis();
    //код, время выполнение которого нужно протестировать.
long timeFinish = System.currentTimeMillis();
resalt = timeFinish - timeStart;
```


## Алгоритмы сортировки.

### Пузырьковая сортировка.
```java
// Вариант №1:
public static int[] bubblesSort(int[] array){
    int len = array.length - 1;
    if (len > 1) {
        for (int i = 0; i < len; i++) {
            int temp = 0;
            for (int j = 0; j < len; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    return array;
}
// Вариант №2:
public static int[] bubblesSort(int[] array){
    boolean isSorted = false;
    int temp;
    int len = array.length - 1;
    while (!isSorted) {
        isSorted = true;
        for (int i = 0; i < len; i++) {
            if (array[i] > array[i + 1]) {
                isSorted = false;
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
    return array;
}
```

### Сортировка слиянием.

```java
public static int[] mergeSort(int[] a) {
    if (a.length > 1) {
        
        int midl = a.length / 2;
        int[] left = new int[midl];
        int[] right = new int[a.length - midl];

        for (int i = 0; i < midl; i++) {
            left[i] = a[i];
        }

        for (int i = midl; i < a.length; i++) {
            right[i - midl] = a[i];
        }

        mergeSort(left);
        mergeSort(right);

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                a[k] = left[i];
                i++;
            } else {
                a[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            a[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            a[k] = right[j];
            j++;
            k++;
        }
    }

    return a;
}
```