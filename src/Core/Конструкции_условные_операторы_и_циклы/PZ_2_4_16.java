package Core.Конструкции_условные_операторы_и_циклы;

/*Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.

Пример ввода: [3,5,20,8,7,3,100]

Пример вывода: 3,5,7,3*/
class PZ_2_4_16 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 5, 20, 8, 7, 3, 100};
        printOddNumbers(array);
    }

    public static void printOddNumbers(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean first = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (first) {
                    stringBuilder.append(arr[i]);
                    first = false;
                } else {
                    stringBuilder.append(",").append(arr[i]);
                }
            }
        }
        System.out.println(stringBuilder);
            }

//                    StringBuilder stringBuilder = new StringBuilder();
//                    boolean first = true;
//                    for (int i = 0; i < arr.length; i++) {
//                            if (arr[i] % 2 != 0) {
//                                    if (first) {
//                                            stringBuilder.append(arr[i]);
//                                            first = false;
//                                    } else {
//                                            stringBuilder.append("," + arr[i]);
//                                    }
//                            }
//                    }
//                    System.out.println(stringBuilder);
            }

  //  }




/*

https://www.cyberforum.ru/java-beginners/thread2942176.html
public static void printOddNumbers(int[] arr) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int value : arr) {
        if (value % 2 == 1) {
            stringBuilder.append(value + ",");
        }
    }
    System.out.println(stringBuilder.substring(0,stringBuilder.length()-1));
    https://ru.stackoverflow.com/questions/1084710/%D0%92%D1%8B%D0%B2%D0%BE%D0%B4-%D0%BD%D0%B5%D1%87%D1%91%D1%82%D0%BD%D1%8B%D1%85-%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D0%BE%D0%B2-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%B0-%D1%87%D0%B5%D1%80%D0%B5%D0%B7-%D0%B7%D0%B0%D0%BF%D1%8F%D1%82%D1%83%D1%8E-java
}
или

public static void printOddNumbers(int[] arr) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int value : arr) if (value % 2 == 1) stringBuilder.append(value + ",");
    stringBuilder.deleteCharAt(stringBuilder.length()-1);
    System.out.println(stringBuilder);
}*/