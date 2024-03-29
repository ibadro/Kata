
package Core.Primitiv;
 import java.lang.Math.*;

 import static java.lang.Math.abs;

/*Rеализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c ?
Допустимая погрешность – 0.0001 (1E-4)
Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
В качестве примера написано заведомо неправильное выражение. Исправьте его.

Требования:
Метод должен иметь сигнатуру: doubleExpression(double a, double b, double c)*/
  class PZ_2_1_10 {


    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs((a + b) - c) < 0.0001;
    }
}
