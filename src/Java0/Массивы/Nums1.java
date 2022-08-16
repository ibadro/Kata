package Java0.Массивы;

public class Nums1 {
    static int[] nums =new int[10];
// static string[] nums =new string[10];
    public static void main(String[] args) {
        nums[0]= 2;
        nums[1]= 27;
        nums[2]= 2786;
        nums[3]= 2786;
        nums[4]= 4542;
        nums[5]= 72;
        nums[6]= 2456;
        nums[7]= 2456;
        nums[8]= 245645;
        //for(int n: nums){ // для вывода массива используем форич. Первый элемент тип данных + его имя  и через ":" дальше перебираемый массив
        //  System.out.println(n);
        for (int i=0; i<nums.length; i++) //или альтернаитвный вариант
            System.out.println(i +" :  " + nums[i]);

}
    }
