package Java0.Method;

public class УпрощениеКода {


    public static void main(String[] args) {
        int a =2;
        int b =4;
printCalcSummPr(a,b);
//        int sum = a+b;
//        int pr = a*b;
//        prinеSummPr(sum,pr);
//        System.out.println(sum);
    //    System.out.println(pr);


        int x =2;
        int y =4;
printCalcSummPr(x,y);
//          sum = x+y;
//          pr = x*y;
//        prinеSummPr(sum,pr);
////        System.out.println(sum);
//        System.out.println(pr);
    }
    // -  возвращаемое значениу Имя метода (параметры модода)
    public static void printCalcSummPr(int x, int y){
        int summma = x+y;

        int proizv = x*y;
        System.out.println(summma);
        System.out.println(proizv);
    }
}