public class Calculator {
    private int a;
    private int b;
    private char sign;
    private int result;

    public void setNum(int a) {
        this.a = a;
    }

    public void setNum2(int b) {
        this.b = b;
    }

    public void calculate(char sign) {
        int result = switch(sign) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> a / b;
            case '%' -> a % b;
            case '^' -> (int) Math.pow(a, b);
            default -> throw new IllegalArgumentException("Введенная мат. операция не поддерживается");
        };
        System.out.println("Ответ: " + result);
    }
}