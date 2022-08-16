package Java0.ОПП;

public class People {
    int age;
    String  name;
    String lastName;

    Cat cat;

    @Override
    public String toString() {
        return "People[Name:  " + name + "lastname:  " + lastName+ " Age   "+ age+"Cat: "+ cat + "]";
    }
}
