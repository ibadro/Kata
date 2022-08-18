package Core.Primitiv;
/*Реализуйте метод isPowerOfTwo, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

Решать можно разными способами:

воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
применив пару трюков из двоичной арифметики;
написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
Пример ввода 1: 0
Пример возвращаемого значения 1: false

Пример ввода 2: 1
Пример возвращаемого значения 2: true

Пример ввода 3: -2
Пример возвращаемого значения 3: true

Требования:
1. Метод должен быть public.
2. Метод должен быть static.
3. Передаваемый параметр должен иметь тип int.*/
public class PZ_2_2_8 {
    public static void main(String[] args) {
      System.out.println(isPowerOfTwo(0));
      System.out.println(isPowerOfTwo(1));
      System.out.println(isPowerOfTwo(-2));

    }

    public static boolean isPowerOfTwo(int value) {

        return Integer.bitCount(Math.abs(value)) == 1;
    }
}
