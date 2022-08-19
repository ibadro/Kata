package Core.Macсивы_и_строки;

/*Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая). При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания, а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и прочих экзотических символов в строке не будет.
Для удаления из строки всех символов, не являющихся буквами и цифрами, можно воспользоваться регулярным выражением "[^a-zA-Z0-9]".Найдите в классе String метод, выполняющий замену по регулярному выражению и воспользуйтесь им.

Воспользуйтесь предоставленным шаблоном. Декларацию класса, метод main и обработку ввода-вывода добавит проверяющая система.

Пример ввода 1: Was it a cat I saw?
Пример вывода 1: true
Пример ввода 2: A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar or the number 10801.
Пример вывода 2: false
Требования:
1. Должен быть доступный статический метод boolean isPalindrome(String text)
2. Работа метода должна удовлетворять условию*/
class Macсивы_и_строки {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw"));
    }
    public static boolean isPalindrome(String text) {
        return text.replaceAll("[^A-Za-zА-Яа-я0-9]", "")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("[^A-Za-zА-Яа-я0-9]", ""))
                        .reverse().toString());
    }

    }
//текст реплейсим регуляркой и сравниваем (игнорируя регистр) с объектом стринг билдера (в него кладем нашу строку) т.к. у него есть метод "реверс" и этот объект снова преобразуем в строку

//\d, потому что мы хотим удалить все цифры во входной строке.
//\W Любой символ, не являющийся словом
//
//