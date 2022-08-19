package Core.Конструкции_условные_операторы_и_циклы;

import java.math.BigInteger;

/*Реализуйте метод factorial, вычисляющий факториал заданного натурального числа.
Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N.
Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.
Пример ввода 1: 1
Пример возвращаемого значения 1: 1
Пример ввода 2: 3
Пример возвращаемого значения 2: 6
Требования:
1. Метод должен быть public.
1. Метод должен быть static.
3. Передаваемый параметр должен иметь тип int.
4. Метод должен быть реализован через цикл.*/
public class PZ_2_4_13 {
    public static void main(String[] args) {
       // System.out.println(getfactorial(3));
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= value; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

    // Это константные объекты BigInteger со значениями, соответственно, 0, 1 и 10.
   /* public static int factorial(int value) {
        int result = 1;
        for (int i = 1; i <= value; i++) {
            result = result * i;
        }
        return result;
    }
}*/
// BigInteger.valueOf(long value) возвращает BigInteger/  Этот метод является статическим, поэтому нет необходимости создавать объект класса BigInteger для использования этого метода. Мы можем вызвать эту функцию с помощью кода BigInteger.valueOf (длинное значение).