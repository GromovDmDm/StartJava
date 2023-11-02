public class MyFirstGame {
    public static void main(String[] args) {
        int randomNum = (int) ( 1 + Math.random() * 100 );
        int userNum = 50;
        while(userNum != randomNum) {
            if (userNum > randomNum) {
                System.out.println("Число " + userNum + " больше того, что загадал компьютер");
                userNum--;
            } else if (userNum < randomNum) {
                System.out.println("Число " + userNum + " меньше того, что загадал компьютер");
                userNum++;
            }
        }
        System.out.println("Вы победили!");
    }
}