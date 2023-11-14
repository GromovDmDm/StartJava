public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int counter = startSegment;
        int endSegment = 21;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if(counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= endSegment);
        System.out.printf("В отрезке [%d, %d] сумма четных чисел = %d, а нечетных = %d",
                startSegment, endSegment, sumEven, sumOdd);

        System.out.println("\n\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int max = num1;
        int min = num1;
        if(max < num2) {
            max = num2;
        }
        if(max < num3) {
            max = num3;
        }
        if(min > num2) {
            min = num2;
        }
        if(min > num3) {
            min = num3;
        }
        for(int i = max - 1; i > min + 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println("\nСумма цифр числа равна " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        counter = 0;
        for(int i = 1; i < 30; i += 2) {
            counter++;
            System.out.printf("%6d", i);
            if(counter % 5 == 0) {
                counter = 0;
                System.out.println();
            }
        }
        int countZeros = 0;
        while (countZeros < 5 - counter && counter > 0) {
            System.out.printf("%6d", 0);
            countZeros++;
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        int copyNum = num = 3242592;
        int count = 0;
        while (num > 0) {
            if (num % 10 == 2) count++;
            num /= 10;
        }
        System.out.printf("В %d (%s) количество двоек - %d",
                copyNum, count % 2 == 0 ? "чётное" : "нечётное", count);

        System.out.println("\n\n6. Отображение геометрических фигур");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        int colums = 5;
        while (colums > 0) {
            int rows = colums;
            while (rows > 0) {
                System.out.print("#");
                rows--;
            }
            System.out.println();
            colums--;
        }
        System.out.println();

        colums = 5;
        do {
            int rows = colums == 4 || colums == 2 ? 2 : colums == 3 ? 3 : 0;
            do {
                System.out.print("$");
                rows--;
            } while (rows > 0);
            System.out.println();
            colums--;
        } while(colums > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%s%13s%16s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for(int i = 15; i < 48; i += 2) {
            System.out.printf("%4d%12c%14s%s%n", i, i, "", Character.getName(i));
        }
        for(int i = 98; i < 123; i += 2) {
            System.out.printf("%4d%12c%14s%s%n", i, i, "", Character.getName(i));
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        copyNum = num = 1234321;
        int invertedNum = 0;
        while (num > 0) {
            invertedNum = invertedNum * 10 + num % 10;
            num /= 10;
        }
        System.out.printf("число %d %s палиндромом\n",
                copyNum, copyNum == invertedNum ? "является" : "не является");

        System.out.println("\n9. Проверка, является ли число счастливым");
        num = 131231;
        int sumLeftHalf = 0;
        int sumRightHalf = 0;
        System.out.print("Число " + num + " ");
        for(int i = 0; i < 6; i++) {
            int remainder = num % 10;
            if(i < 3) {
                sumRightHalf += remainder;
            } else {
                sumLeftHalf += remainder;
            }
            num /= 10;
        }
        System.out.print((sumLeftHalf == sumRightHalf ? "является " : "не является ") + "счастливым");
        System.out.printf("%nСумма цифр ABC = %d, а сумма DEF = %d", sumLeftHalf, sumRightHalf);

        System.out.println("\n\n10. Отображение таблицы умножения Пифагора");
        System.out.printf("%11s%16s%n", "ТАБЛИЦА", "ПИФАГОРА");
        System.out.print("   |");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n---|----------------------------------");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for(int j = 2; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}