package Java0.Стринг;
/*Метод indexOf() находит индекс первого вхождения подстроки в строку, а метод lastIndexOf() - индекс последнего вхождения. Если подстрока не будет найдена, то оба метода возвращают -1:

 */
public class Meth_indexOf {
    public static void main(String[] args) {
        String str = "Hello world";
        int index1 = str.indexOf('l'); // 2
        int index2 = str.indexOf("wo"); //6
        int index3 = str.lastIndexOf('l'); //9
        System.out.println(index3);
    }
}
/*Поиск в строке
Метод indexOf() находит индекс первого вхождения подстроки в строку, а метод lastIndexOf() - индекс последнего вхождения. Если подстрока не будет найдена, то оба метода возвращают -1:

String str = "Hello world";
int index1 = str.indexOf('l'); // 2
int index2 = str.indexOf("wo"); //6
int index3 = str.lastIndexOf('l'); //9
Метод startsWith() позволяют определить начинается ли строка с определенной подстроки, а метод endsWith() позволяет определить заканчивается строка на определенную подстроку:

String str = "myfile.exe";
boolean start = str.startsWith("my"); //true
boolean end = str.endsWith("exe"); //true
Замена в строке
Метод replace() позволяет заменить в строке одну последовательность символов на другую:

String str = "Hello world";
String replStr1 = str.replace('l', 'd'); // Heddo wordd
String replStr2 = str.replace("Hello", "Bye"); // Bye world
Обрезка строки
Метод trim() позволяет удалить начальные и конечные пробелы:

String str = "  hello world  ";
str = str.trim(); // hello world
Метод substring() возвращает подстроку, начиная с определенного индекса до конца или до определенного индекса:

String str = "Hello world";
String substr1 = str.substring(6); // world
String substr2 = str.substring(3,5); //lo
Изменение регистра
Метод toLowerCase() переводит все символы строки в нижний регистр, а метод toUpperCase() - в верхний:

String str = "Hello World";
System.out.println(str.toLowerCase()); // hello world
System.out.println(str.toUpperCase()); // HELLO WORLD
Split
Метод split() позволяет разбить строку на подстроки по определенному разделителю. Разделитель - какой-нибудь символ или набор символов передается в качестве параметра в метод. Например, разобьем текст на отдельные слова:

String text = "FIFA will never regret it";
String[] words = text.split(" ");
for(String word : words){
    System.out.println(word);
}
В данном случае строка будет разделяться по пробелу. Консольный вывод:*/