package Core.FS.Потоки_Байт.pz537;
import java.io.*;
import java.util.Arrays;
public class PZ5_4_7 {

    public static Animal[] deserializeAnimalArray(byte[] data) {
        // your implementation here
        InputStream inputStream = new ByteArrayInputStream(data);
        int amount;
        Animal animal;
        Animal [] animals;

        try (ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            amount = objectInputStream.readInt();
            animals = new Animal[amount];

            for (int i = 0; i < amount; i++) {
                animals[i] = (Animal) objectInputStream.readObject();
            }


        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }

        return animals;
    }

}
/*Реализуйте метод, который из переданного массива байт восстановит массив объектов Animal. Массив байт устроен следующим образом.
 Сначала идет число типа int, записанное при помощи ObjectOutputStream.writeInt(size). Далее подряд записано указанное количество объектов типа Animal,
 сериализованных при помощи ObjectOutputStream.writeObject(animal).

Если вдруг массив байт не является корректным представлением массива экземпляров Animal, то метод должен бросить исключение java.lang.IllegalArgumentException.

Причины некорректности могут быть разные. Попробуйте подать на вход методу разные некорректные данные и посмотрите, какие исключения будут возникать.
 Вот их-то и нужно превратить в IllegalArgumentException и выбросить. Если что-то забудете, то проверяющая система подскажет. Главное не глотать никаких исключений, т.е. не оставлять нигде пустой catch.

Требования:
1. Метод должен быть публичным.
2. Сигнатура метода должна быть: Animal[] deserializeAnimalArray(byte[] data)*/