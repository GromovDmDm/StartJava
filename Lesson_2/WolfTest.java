class Wolf {
    String gender;
    String nickName;
    String color;
    float weight;
    int age;

    void walk() {
        System.out.println("walking");
    }

    void sit() {
        System.out.println("siting");
    }

    void run() {
        System.out.println("runing");
    }

    void howl() {
        System.out.println("howling");
    }

    void hunt() {
        System.out.println("hunting");
    }
}

public class WolfTest {
    public static void main(String[] args) {
        Wolf myObject = new Wolf();
        myObject.gender = "мальчик";
        System.out.println("пол " + myObject.gender);
        myObject.nickName = "Лео";
        System.out.println("кличка " + myObject.nickName);
        myObject.color = "Белый";
        System.out.println("окрас " + myObject.color);
        myObject.weight = 13.1f;
        System.out.println("вес " + myObject.weight);
        myObject.age = 5;
        System.out.println("возраст " + myObject.age);
        myObject.walk();
        myObject.sit();
        myObject.run();
        myObject.howl();
        myObject.hunt();
    }
}