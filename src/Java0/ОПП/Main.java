package Java0.ОПП;

public class Main {
     static Cat cat = new Cat();
     static People people =new People();


    public static void main(String[] args) {
        cat.name = "Dimon";
        cat.poroda = "pers";
        cat.vozrast = 2;

        people.name = "bob";
        people.age = 30;
        people.lastName = "ivanov";
        people.cat = cat;


        System.out.println(people);
     cat.say();

    }
}
