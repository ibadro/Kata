package Java0.Стринг;

public class Стринг {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = new String(); // пустая строка
        String str3 = new String(new char[] {'h', 'e', 'l', 'l', 'o'});
        String str4 = new String(new char[]{'w', 'e', 'l', 'c', 'o', 'm', 'e'}, 3, 4);//3 -начальный индекс, 4 -кол-во символов
        String s = "";   // пустая строка
        if(s.isEmpty()) System.out.println("String is empty"); /*cтрока может быть пустой. Для этого ей можно присвоить пустые кавычки или удалить из стоки все символы:*/
        String  str5 = str2.concat(str1); // HelloJava  способ объединения строк представляет метод concat():
        System.out.println(str1); // Java
        System.out.println(str2); //
        System.out.println(str3); // hello
        System.out.println(str4); // come
        System.out.println(str1.length());
        System.out.println(str1.equals(str2)); // Для сравнения строк используются методы equals() (с учетом регистра) и equalsIgnoreCase() (без учета регистра).
    }
}
