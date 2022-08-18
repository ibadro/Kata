package Core.Конструкции_условные_операторы_и_циклы;

import java.math.BigInteger;

/*Урок с кодом
Реализуйте предыдущую задачу с использованием рекурсии.
Пример ввода 1: 1
Пример возвращаемого значения 1: 1
Пример ввода 2: 3
Пример возвращаемого значения 2: 6
Требования:
1. Метод должен быть public.
1. Метод должен быть static.
3. Передаваемый параметр должен иметь тип int.
4. Реализация метода должна быть через рекурсию.*/
public class PZ_2_4_14 {
    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.ONE;
        if (value == 1 || value == 0) {
            return result;
        }
        if (value < 0) {
            return null;
        } else {
            BigInteger n1 = BigInteger.valueOf(value);
            result = n1.multiply(factorial(value - 1));
            return result;
        }
    }
}

