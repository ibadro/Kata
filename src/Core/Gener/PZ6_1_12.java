package Core.Gener;

import java.util.Objects;

public class PZ6_1_12 {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.println(mustBeTrue);
        System.out.println(mustAlsoBeTrue);
        System.out.println(i);
        System.out.println(s);

    }

    public static class Pair < T, V > {
        private final T x;
        private final V y;

        private Pair(T x, V y) {
            this.x = x;
            this.y = y;
        }

        public static < T,
                V > Pair < T,
                V > of (T x, V y) {
            return new Pair < > (x, y);
        }

        public T getFirst() {
            return this.x;
        }

        public V getSecond() {
            return this.y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Pair < ? , ? > pair = (Pair < ? , ? > ) o;
            return Objects.equals(x, pair.x) &&
                    Objects.equals(y, pair.y);
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }

    }

}
/*
* Реализуйте generic-класс Pair, похожий на Optional, но содержащий пару элементов разных типов и не запрещающий элементам принимать значение null.

Реализуйте методы getFirst(), getSecond(), equals() и hashCode(), а также статический фабричный метод of(). Конструктор должен быть закрытым (private).

С корректно реализованным классом Pair должен компилироваться и успешно работать следующий код:


Pair<Integer, String> pair = Pair.of(1, "hello");
Integer i = pair.getFirst(); // 1
String s = pair.getSecond(); // "hello"
Pair<Integer, String> pair2 = Pair.of(1, "hello");
boolean mustBeTrue = pair.equals(pair2); // true!
boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
Пожалуйста, не меняйте модификатор доступа класса Pair. Для корректной проверки класс должен иметь пакетную видимость.*/