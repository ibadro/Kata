package Java0.Scanner_чтение_с_консоли;

import java.util.Scanner;
/*Для создания самого объекта Scanner в его конструктор передается объект System.in. После этого мы можем получать вводимые значения.
Например, в данном случае вначале выводим приглашение к вводу и затем получаем вводимое число в переменную num.
Чтобы получить введенное число, используется метод in.nextInt();, который возвращает введенное с клавиатуры целочисленное значение.
Пример работы программы:*/
public class ScannerIn {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        in.close();
    }

}
/*Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:
next(): считывает введенную строку до первого пробела
nextLine(): считывает всю введенную строку
nextInt(): считывает введенное число int
nextDouble(): считывает введенное число double
nextBoolean(): считывает значение boolean
nextByte(): считывает введенное число byte
nextFloat(): считывает введенное число float
nextShort(): считывает введенное число short*/
