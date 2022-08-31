package Core.Конструкции_условные_операторы_и_циклы;


/*Реализуйте метод, сливающий два отсортированных по неубыванию массива чисел в один отсортированный в том же порядке массив. Массивы могут быть любой длины, в том числе нулевой.

Предполагается, что вы реализуете алгоритм слияния, имеющий линейную сложность: он будет идти по двум исходным массивам и сразу формировать отсортированный результирующий массив. Так, чтобы сортировка полученного массива при помощи Arrays.sort() уже не требовалась.

К сожалению, автоматически это не проверить, так что это остается на вашей совести :)

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Пример ввода: {0, 2, 2} и {1, 3}
Пример вывода: {0, 1, 2, 2, 3}*/
public class PZ_2_4_17 {
    public static void main(String[] args) {



            int[] a1 = new int[]{0, 2, 2};            //подставляем значения массивов в метод для проверки
            int[] a2 = new int[]{1, 3};

            mergeArrays(a1, a2);                      //вызов метода

    }

    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] res = new int[a1.length + a2.length];
        int n = a1.length;
        int m = a2.length;
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (a1[i] <= a2[j]) {   res[k] = a1[i];  i++;
            } else {
                res[k] = a2[j];  j++;
            }
            k++;
        }
        while (i < n) {  res[k++] = a1[i++];

        }
        while (j < m) {
            res[k++] = a2[j++];

        }
        return res;
    }
}

/*https://otvet.mail.ru/question/226808537*/