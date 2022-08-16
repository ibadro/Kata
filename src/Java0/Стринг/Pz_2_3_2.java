package Java0.Стринг;

import java.util.Scanner;
public class Pz_2_3_2 {
    public static void main( String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = in.nextLine();
        System.out.printf ("Здравствуйте, %s",name+ '!' );
        in.close();
    }
    }