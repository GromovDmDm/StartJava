public class Calculator {
    private int num;
    private int num2;
    private char expression;
    private int result;

    public void setNum(int num) {
        this.num = num;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public boolean setExpression(char expression) {
        switch(expression) {
            case '+':
            case '-':
            case '*':
            case '/':
            case '^':
            case '%':
                this.expression = expression;
                return true;
            default:
                System.out.println("Введенная мат. операция не поддерживается");
                return false;
        }
    }

    public int getResult() {
        switch(this.expression) {
            case '+':
                return num + num2;
            case '-':
                return num - num2;
            case '*':
                return num * num2;
            case '/':
                return num / num2;
            case '^':
                return (int) Math.pow(num, num2);
            case '%':
                return num % num2;
            default:
                return 0;
        }
    }
}