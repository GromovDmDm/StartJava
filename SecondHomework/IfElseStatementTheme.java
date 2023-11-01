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
        int num1 = 10;
        int num2 = 1;
        if (num1 > num2) {
            System.out.printf("Число %d больше числа %d\n", num1, num2);
        } else if (num1 == num2) {
            System.out.printf("Число %d равно числу %d\n", num1, num2);
        } else {
            System.out.printf("Число %d меньше числа %d\n", num1, num2);
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
        int x = 111;
        int x1 = x % 10;
        int x2 = x / 10 % 10;
        int x3 = x / 100 % 10;
        int y = 111;
        int y1 = y % 10;
        int y2 = y / 10 % 10;
        int y3 = y / 100 % 10;
        boolean checkRank = false;
        System.out.printf("%d, %d\n", x, y);
        if (x3 == y3) {
            System.out.print(x3 + " ");
            checkRank = true;
        }
        if (x2 == y2) {
            System.out.print(x2 + " ");
            checkRank = true;
        }
        if (x1 == y1) {
            System.out.print(x1 + " ");
            checkRank = true;
        }
        if (checkRank) {
            System.out.println();
            if (x3 == y3) {
                System.out.print(1 + " ");
            }
            if (x2 == y2) {
                System.out.print(2 + " ");
            }
            if (x1 == y1) {
                System.out.print(3 + " ");
            }
        }

        System.out.println("\n\n5. Определение символа по его коду");
        char symbol = '\u0057';
        String numbers = "0123456789";
        String lowerСase = "abcdefghijklmnopqrstuvwxyz";
        String upperСase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (numbers.indexOf(symbol) >= 0) {
            System.out.printf("Символ '%c' является цифрой\n", symbol);
        } else if (lowerСase.indexOf(symbol) >= 0) {
            System.out.printf("Символ '%c' является маленькой буквой\n", symbol);
        } else if (upperСase.indexOf(symbol) >= 0) {
            System.out.printf("Символ '%c' является большой буквой\n", symbol);
        } else {
            System.out.printf("Символ '%c' является не буквой не цифрой\n", symbol);
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double depositAmount = 301_100;
        double amountInterest = 0;
        if (depositAmount > 0 && depositAmount < 100_000) {
            amountInterest = depositAmount * 5 / 100;
        } else if (depositAmount > 300_000) {
            amountInterest = depositAmount * 10 / 100;
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000){
            amountInterest = depositAmount * 7 / 100;
        }
        System.out.println("Сумма вклада: " + String.format("%.2f", depositAmount));
        System.out.println("Сумма начисленного %: " + String.format("%.2f", amountInterest));
        System.out.println("Итоговая сумма: " + String.format("%.2f",
                depositAmount + amountInterest));

        System.out.println("\n7. Определение оценки по предметам");
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