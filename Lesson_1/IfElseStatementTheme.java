public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean male = false;
        if (!male) {
            System.out.println("Получается не мужик)");
        } else {
            System.out.println("Получается мужик)!)!)");
        }

        int age = 19;
        if (age > 18) {
            System.out.println("Совершеннолетний человек");
        } else {
            System.out.println("Не совершеннолетний человек");
        }

        float height = 1.9f;
        if (height > 1.8) {
            System.out.println("В танкисты не брать");
        } else {
            System.out.println("Готов играть в танки)");
        }

        char firstLetterName = "Ivan".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println("Возможно это Максим?");
        } else if (firstLetterName == 'I') {
            System.out.println("Возможно это Иван?");
        } else {
            System.out.println("Тогда я не знаю!");
        }

        System.out.println("\n2. Поиск большего числа");
        int a = 10;
        int b = 1;
        if (a > b) {
            System.out.printf("Число %d больше числа %d\n", a, b);
        } else if (a == b) {
            System.out.printf("Число %d равно числу %d\n", a, b);
        } else {
            System.out.printf("Число %d меньше числа %d\n", a, b);
        }

        System.out.println("\n3. Проверка числа");
        int num = 122;
        String result = "Число " + num + " является ";
        if (num == 0) {
            System.out.println("Число является нулём");
        } else {
            if (num > 0) {
                result += "положительным";
            } else {
                result += "отрицательным";
            }
            if(num % 2 == 0) {
                result += " и четным";
            } else {
                result += " и не четным";
            }
            System.out.println(result);
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num1 = 123;
        int num2 = 123;
        int numHundreds = num1 % 10;
        int numTens = num1 / 10 % 10;
        int numOnes = num1 / 100;
        int secondNumHundreds = num2 % 10;
        int secondNumTens = num2 / 10 % 10;
        int secondNumUnits = num2 / 100;
        boolean checkRank = false;
        System.out.printf("%d, %d\n", num1, num2);
        if (numOnes == secondNumUnits) {
            System.out.print(numOnes + " ");
            checkRank = true;
        }
        if (numTens == secondNumTens) {
            System.out.print(numTens + " ");
            checkRank = true;
        } 
        if (numHundreds == secondNumHundreds) {
            System.out.print(numHundreds + " ");
            checkRank = true;
        }
        if (checkRank) {
            System.out.println();
            if (numOnes == secondNumUnits) {
                System.out.print(3 + " ");
            }
            if (numTens == secondNumTens) {
                System.out.print(2 + " ");
            }
            if (numHundreds == secondNumHundreds) {
                System.out.print(1 + " ");
            }
        }

        System.out.println("\n\n5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.printf("Символ '%c' является маленькой буквой\n", symbol);
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.printf("Символ '%c' является большой буквой\n", symbol);
        } else if (symbol >= '1' && symbol <= '9') {
            System.out.printf("Символ '%c' является цифрой\n", symbol);
        } else {
            System.out.printf("Символ '%c' не являются ни буквами, ни цифрами", symbol);
        }

        System.out.println("\n\n6. Подсчет суммы вклада и начисленных банком %");
        double depositAmount = 301_100;
        double percent = 7;
        if (depositAmount > 0 && depositAmount < 100_000) {
            percent = 5;
        } else if (depositAmount > 300_000) {
            percent = 10;
        }
        double amountPercent = depositAmount * percent / 100;
        //System.out.printf("%6d", i)
        System.out.printf("Сумма вклада: %.2f ", depositAmount);
        System.out.printf("Сумма начисленного: %.2f ", amountPercent);
        System.out.printf("Итоговая сумма: %.2f ", depositAmount + amountPercent);

        System.out.println("\n\n7. Определение оценки по предметам");
        int historyPercent = 59;
        int csPercent = 92;
        int historyGrade = determineGrade(historyPercent);
        int csGrade = determineGrade(csPercent);
        System.out.println("Итоговая оценка по Истории: " + historyPercent
                + "% Оценка по Истории: " + historyGrade);
        System.out.println("Итоговая оценка по Программированию: " + csPercent
                + "% Оценка по Программированию: " + csGrade);
        System.out.println("Средний балл оценок по предметам: "
                + (double) (historyGrade + csGrade) / 2);
        System.out.println("Cредний % по предметам: "
                + (double) (historyPercent + csPercent) / 2);

        System.out.println("\n8. Расчет годовой прибыли");
        int saleProduct = 13000;
        int premisesRental = 5000;
        int costPrice = 9000;
        int profit = ((saleProduct + premisesRental) - costPrice) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit);
        } else {
            System.out.println("Прибыль за год: " + profit);
        }
    }

    private static int determineGrade(int percent) {
        int grade = 2;
        if(percent > 91) {
            grade = 5;
        } else if (percent > 73) {
            grade = 4;
        } else if (percent > 60) {
            grade = 3;
        }
        return grade;
    }
}