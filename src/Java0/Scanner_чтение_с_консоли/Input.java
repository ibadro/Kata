package Java0.Scanner_чтение_с_консоли;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //стандартный поток данных
        // System.out.println("введите что то ");
       // String str =s.nextLine(); //считает с клавиатуры одну строчку
        System.out.println("введите число ");
         int x  =s.nextInt(); //считает с клавиатуры значение int

        System.out.println("вы ввели: "+ x);




    }
}
