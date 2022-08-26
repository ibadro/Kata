package Core.Исключения;

public class PZ_4_1_8 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();
    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();
    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();
    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] tracer;
        tracer = new Throwable().getStackTrace();
        if (tracer.length > 2) {
            return tracer[2].getClassName() + "#" + tracer[2].getMethodName();
        } else {
            return null;
        }

    }



}
/*StackTraceElement[] methods = Thread.currentThread().getStackTrace();
Мы знаем, что Throwable class является суперклассом всех ошибок и исключений в Java.
Мы можем получить массив элементов трассировки stack, представляющих трассировку stack, относящуюся к броску, вызвав getStackTrace() на Throwable пример.
Рекомендуется использовать приведенный выше фрагмент кода как встроенный. Если мы используем его внутри метода, это вернет номер строки метода.

Первый элемент массива представляет вершину stack, которая является последним вызовом метода в последовательности.
Можно записать ее и в две строки:

Thread current = Thread.currentThread();
StackTraceElement[] methods = current.getStackTrace();
Статический метод currentThread() класса Thread возвращает ссылку на объект типа Thread, который содержит информацию о текущей нити (о текущем потоке выполнения). Подробнее о нитях вы узнаете в квесте Java Core.

У этого объекта Thread есть метод getStackTrace(), который возвращает массив элементов StackTraceElement, каждый из которых содержит информацию об одном методе. Все элементы вместе и образуют stack trace.


Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.

Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный утилитный метод.
 Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName() является точкой входа в программу, т.е. его никто не вызывал.

Это актуально, например, в библиотеках логирования, где для каждого сообщения в логе надо выводить класс и метод, откуда сообщение было залогировано.
При запуске эта программа должна вывести:

null
org.your.project.Test#main
P.S. При тестировании этой программы в среде разработки вы можете получить другой результат: вместо null в первой строчке будет напечатан какой-то посторонний класс и метод. Это связано с тем, что среда разработки обычно запускает не ваш класс, а свой собственный, который затем уже вызывает ваш. Чтобы этого избежать, запускайте программу командой "java" в командной строке.

P.P.S. Эта задача в уроке про исключения не случайно :)
https://javarush.ru/quests/lectures/questsyntaxpro.level14.lecture05 */
/*Почему же список вызовов методов назвали StackTrace? Да потому, что если представить список методов в виде стопки листов с именами методов, при вызове очередного метода на эту стопку кладется лист с именем метода, на него — следующий, и т.д.

Когда метод завершается, лист с верха стопки удаляется. Нельзя удалить лист из середины стопки, не удалив все листы, лежащие в нем — нельзя прекратить работу метода в цепочке вызовов, не завершив все методы, вызванные им.*/