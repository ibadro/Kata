package Java0.Условные_операторы_и_циклы;

public class if_else {
    static boolean bool = true;
    static int a = 3;

    public static void main(String[] args) {
        if (a == 3) {
            System.out.println("Истина");

        } else if (a < 3) {
            System.out.println("a<3");

        } else if (a > 3) {
            System.out.println("a>3");
        }
    }

}