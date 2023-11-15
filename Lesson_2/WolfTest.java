public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("мальчик");
        System.out.println("пол " + wolf.getGender());
        wolf.setNickName("Лео");
        System.out.println("кличка " + wolf.getNickName());
        wolf.setColor("Белый");
        System.out.println("окрас " + wolf.getColor());
        wolf.setWeight(13.1f);
        System.out.println("вес " + wolf.getWeight());
        wolf.setAge(5);
        System.out.println("возраст " + wolf.getAge());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}