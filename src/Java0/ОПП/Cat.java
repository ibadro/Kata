package Java0.ОПП;

public class Cat {
    int vozrast;
    String poroda;
    String name;
void say(){
    System.out.println("may");
}
    @Override
    public String toString() {
        return "Cat[Имя " + name + "   poroda  " + poroda + "vozrast:   "+ vozrast+"]";
    }
}
