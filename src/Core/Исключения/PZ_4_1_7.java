package Core.Исключения;

import java.io.IOException;
import java.util.Scanner;

public class PZ_4_1_7 {

    public class MyNewException extends Exception {
    }

    public void testExp() throws MyNewException {
        throw new MyNewException();
    }
}
/*Создайте новое проверяемое исключение MyNewException, и создайте метод testExp(), который выбрасывает MyNewException при вызове.

Требования:
1. Метод testExp() должен быть публичным и иметь тип возвращаемого значения void.
2. Класс исключения должен иметь модификатор доступа по умолчанию.
3. Метод testExp() расположите вне класса исключения.*/