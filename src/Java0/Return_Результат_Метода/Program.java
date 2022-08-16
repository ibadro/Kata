package Java0.Return_Результат_Метода;

public class Program {
    public static void main (String args[]){

        daytime(7);     // Good morning
        daytime(13);    // Good after noon
        daytime(32);    //
        daytime(56);    //
        daytime(2);     // Good night
    }
    static void daytime(int hour){

        if (hour >24 || hour < 0)
            return;
        if(hour > 21 || hour < 6)
            System.out.println("Good night");
        else if(hour >= 15)
            System.out.println("Good evening");
        else if(hour >= 11)
            System.out.println("Good after noon");
        else
            System.out.println("Good morning");
    }
}
/*Выход из метода
Оператор return применяется для возвращаения значения из метода, но и для выхода из метода. В подобном качестве оператор return применяется в методах, которые ничего не возвращают, то есть имеют тип void:
Если переданное в метод datetime значение больше 24 или меньше 0, то просто выходим из метода. Возвращаемое значение после return указывать в этом случае не нужно.*/