public class Wolf {
    private String gender;
    private String nickName;
    private String color;
    private float weight;
    private int age;

    public String getGender() {
        return gender;
    }

    public String getNickName() {
        return nickName;
    }

    public String getColor() {
        return color;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        }
    }

    public void walk() {
        System.out.println("walking");
    }

    public void sit() {
        System.out.println("siting");
    }

    public void run() {
        System.out.println("runing");
    }

    public void howl() {
        System.out.println("howling");
    }

    public void hunt() {
        System.out.println("hunting");
    }
}