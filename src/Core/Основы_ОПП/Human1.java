package Core.Основы_ОПП;

public class Human1 {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human((byte) 40, "Iv",
                "Petrov", "lapti");
        Human human3 = new Human((byte) 34, "Petr", "Ivanov");
    }

    public static class Human {
        public Human() {

        }

        public Human(byte age1, String name1, String secondName1, String favoriteSport1) {
            this.age = age1;
            this.name = name1;
            this.secondName = secondName1;
            this.favoriteSport = favoriteSport1;
        }

        public Human(byte age2, String name2, String secondName2) {
            age = age2;
            name = name2;
            secondName = secondName2;

        }

        byte age;
        String name;
        String secondName;
        String favoriteSport;
    }

}