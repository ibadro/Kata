package Core.Конструкции_условные_операторы_и_циклы;

/*Вам дан список ролей и сценарий пьесы в виде массива строчек. Каждая строчка сценария пьесы дана в следующем виде:
Роль: текст
Текст может содержать любые символы.
Напишите метод, который будет группировать строчки по ролям, пронумеровывать их и возвращать результат в виде готового текста (см. пример). Каждая группа распечатывается в следующем виде:
Роль:
i) текст
j) текст2
...
==перевод строки==
i и j -- номера строк в сценарии. Индексация строчек начинается с единицы, выводить группы следует в соответствии с порядком ролей. Переводы строк между группами обязательны, переводы строк в конце текста не учитываются.
Заметим, что вам предстоит обработка огромной пьесы в 50 000 строк для 10 ролей – соответственно, неправильная сборка результирующей строчки может выйти за ограничение по времени.
Обратите внимание еще на несколько нюансов:
имя персонажа может встречаться в строке более одного раза, в том числе с двоеточием;
название одной роли может быть префиксом названия другой роли (например, "Лука" и "Лука Лукич");
роль, у которой нет реплик, тоже должна присутствовать в выходном файле;
в качестве перевода строки надо использовать символ '\n' (перевод строки в стиле UNIX);
будьте внимательны, не добавляйте лишних пробелов в конце строк.
Пример ввода 1:
roles:
Городничий
Аммос Федорович
Артемий Филиппович
Лука Лукич
textLines:
Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
Аммос Федорович: Как ревизор?
Артемий Филиппович: Как ревизор?
Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
Аммос Федорович: Вот те на!
Артемий Филиппович: Вот не было заботы, так подай!
Лука Лукич: Господи боже! еще и с секретным предписаньем!
Пример вывода 1:
Городничий:
1) Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.
4) Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.
Аммос Федорович:
2) Как ревизор?
5) Вот те на!
Артемий Филиппович:
3) Как ревизор?
6) Вот не было заботы, так подай!
Лука Лукич:
7) Господи боже! еще и с секретным предписаньем!*/
public class PZ_2_4_18_1 {

    static String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};
    static String[] textLines = {
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
    };

    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder[] textByRoles = new StringBuilder[roles.length];
        for (int i = 0; i < roles.length; i++) {
            textByRoles[i] = new StringBuilder(roles[i] + ":");
        }

        for (int i = 0; i < textLines.length; i++) {
            String[] splitLine = textLines[i].split(": ", 2);
            String role = splitLine[0];
            String text = splitLine[1];

            int j = 0;
            while (!roles[j].equals(role)) {
                j++;
            }
            textByRoles[j].append("\n" + (i + 1) + ") " + text);
        }

        String result = "";
        for (StringBuilder line : textByRoles) {
            result += line + "\n\n";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(printTextPerRole(roles, textLines));
    }
}


//*1) Взять из списка ролей 1ю роль, сформировать строку вида Роль + : + \n
//result.append(roles[i]+ ":" + "\n");
//2) Найти строку начинающуюся (startWith) с Роль:,
//вырезать "Роль:", что осталось пронумеровать и прилепить к результирующей строке
//[i]+")" + textString + \n
//3) Искать следующее вхождение роли и повторить п.2
//4) Если такой роли больше нет, перейти к следующей и повторить п.2 и п.3
//5) Если больше ролей нет вообще - вернуть то, что получилось*/

   /* Если ты думаешь: как решить эту задачу?
        1. Работать надо через СтрингБилдер, поэтому первым делом создай его.
        2. Начать надо с "вписания" роли в твой созданный СтрингБилдер.
        2.1. Помещай(через append) туда элементы массива role(с прибавлением ":" и '/n') через цикл.
        3. После "вписания" роли в СтрингБилдер создавай вложенный цикл, где будут проверяться совпдения элементов второго массива textLine с "вписанными" элементами первого массива(через startsWith).
        4. В случае совпадения( через if) помещай элемент второго массива в СтрингБилдер с заменой(через replaceFirst)  роли(так как во втором массиве уже есть название роли).
        Сложновато получилось, но задача мозговыносная.*/