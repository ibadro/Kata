package Java0.Return_Результат_Метода;
/*В методе в качестве типа возвращаемого значения вместо void используется любой другой тип. В данном случае метод sum возвращает значение типа int, поэтому этот тип указывается перед названием метода. Причем если в качестве возвращаемого типа для метода определен любой другой, отличный от void, то метод обязательно должен использовать оператор return для возвращения значения.

При этом возвращаемое значение всегда должно иметь тот же тип, что значится в определении функции. И если функция возвращает значение типа int, то после оператора return стоит целочисленное значение, которое является объектом типа int. Как в данном случае это сумма значений параметров метода.

Метод может использовать несколько вызовов оператора return для возваращения разных значений в зависимости от некоторых условий:*/
public class daytime {
    public static void main (String args[]){

        System.out.println(daytime(7));     // Good morning
        System.out.println(daytime(13));    // Good after noon
        System.out.println(daytime(18));    // Good evening
        System.out.println(daytime(2));     // Good night
    }
    static String daytime(int hour){
     if (hour >24 || hour < 0)
            return "Invalid data";
        else if(hour > 21 || hour < 6)
            return "Good night";
        else if(hour >= 15)
            return "Good evening";
        else if(hour >= 11)
            return "Good after noon";
        else
                return "Good morning";
}
}