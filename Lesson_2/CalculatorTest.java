import java.util.Scanner;

public class CalculatorTest {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        invokeCalculator();
    }

    private static void invokeCalculator() {
        Calculator calculator = new Calculator();
        CalculatorTest сalculatorTest = new CalculatorTest();
        calculator.setA(Integer.parseInt(inputInConsole("Введите первое число: ",
                сalculatorTest.scanner)));
        char sign = inputInConsole("Введите знак математической операции: ",
                сalculatorTest.scanner).charAt(0);
        calculator.setB(Integer.parseInt(inputInConsole("Введите второе число: ",
                сalculatorTest.scanner)));
        try {
            calculator.calculate(sign);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        decideContinue(сalculatorTest.scanner);
    }

    private static void decideContinue(Scanner scanner) {
        switch(inputInConsole("Хотите продолжить вычисления? [yes/no]: ", scanner)) {
            case "yes": 
                invokeCalculator();
            case "no": 
                return;
            default: 
                decideContinue(scanner);
        }
    }

    private static String inputInConsole(String message, Scanner scanner) {
        System.out.print(message);
        return scanner.nextLine();
    }
}