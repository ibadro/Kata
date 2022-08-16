package Java0.Scanner_чтение_с_консоли;

import java.util.Scanner;

/*Создайте метод public static int getMinFromTwo(int x, int y), который принимает два целочисленных параметра и возвращает наименьший из них.

Создайте метод public static int getMinFromFour(int x, int y, int m, int n), который принимает четыре целочисленных параметра и возвращает наименьший из них.

При том  второй метод должен использовать первый.

Требования:
1. Оба метода должны принимать целочисленные параметры
2. Оба метода должны возвращать целочисленные параметры
3. Второй метод должен использовать первый
4. Методы не должны ничего выводить в консоль*/
public class PZ_2_8_1 {
    public static int getMinFromTwo(int x, int y) {
        if (x < y)
            return x;
        return y;
    }
    public static int getMinFromFour(int x, int y, int m, int n) {
        if (getMinFromTwo(x, y) < getMinFromTwo(m, n))
            return getMinFromTwo(x, y);
        return getMinFromTwo(m, n);
    }

}
