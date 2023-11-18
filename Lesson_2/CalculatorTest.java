import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        invokeCalculator();
    }

    private static void invokeCalculator() {
        Calculator calculator = new Calculator();
        calculator.setNum(Integer.parseInt(getUserMessage("Введите первое число: ")));
        char sign = getUserMessage("Введите знак математической операции: ").charAt(0);
        calculator.setNum2(Integer.parseInt(getUserMessage("Введите второе число: ")));
        try {
            calculator.calculate(sign);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        finishCalculation();
    }

    private static String getUserMessage(String message) {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        String userMessage = scanner.nextLine();
        return userMessage;
    }

    private static void finishCalculation() {
        switch(getUserMessage("Хотите продолжить вычисления? [yes/no]: ")) {
            case "yes": 
                invokeCalculator();
            case "no": 
                return;
            default: 
                finishCalculation();
        }
    }
}