package Core.Конструкции_условные_операторы_и_циклы;

import java.util.Arrays;

/*Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.

Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.

К сожалению, автоматически это не проверить, так что это остается на вашей совести :)

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Пример ввода: {0, 2, 2} и {1, 3}
Пример вывода: {0, 1, 2, 2, 3}*/
public class PZ_2_4_17 {
    public static void main(String[] args) {
        int [] a1 =  {0, 2, 2};
        int [] a2 = {1, 3};

    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int [a1.length + a2.length];
        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        Arrays.sort(result);
        return result;
    }
}
/*https://otvet.mail.ru/question/226808537*/