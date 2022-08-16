package Java0.Method;

public class Main {

    public static void main(String[] args) {
        int val =  calcSum(5,5);
        System.out.println(val);
    }

    //  static void calcSum(int a, int b) {
     //   int sum = a + b;
    static int calcSum(int a, int b) { //вместо метода void делаем Int но обязателбно должны добавить return
        int sum = a + b;
        System.out.println(sum);
        return sum;
    }

}