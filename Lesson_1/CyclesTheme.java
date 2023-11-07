public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int startSegment = -10;
        int endSegment = 21;
        int sumEven = 0;
        int SumNotEven = 0;
        System.out.printf("В отрезке [%d, %d] ", startSegment, endSegment);
        do {
            if(startSegment % 2 == 0) {
                sumEven += startSegment;
            } else {
                SumNotEven += startSegment;
            }
            startSegment++;
        } while (startSegment <= endSegment);
        System.out.printf("сумма четных чисел = %d, а нечетных = %d", sumEven, SumNotEven);

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
        int digit = 0;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            System.out.print(digit);
            num /= 10;
        }
        System.out.println("\nСумма цифр числа равна " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int counter = 0;
        for(int i = 1; i < 24; i += 2) {
            if(counter % 5 == 0 && counter != 0) {
                counter = 0;
                System.out.println();
            }
            counter++;
            System.out.printf("%6d", i);
        }
        int countZeros = 0;
        while (countZeros < 5 - counter) {
            System.out.printf("%6d", 0);
            countZeros++;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        num = 3242592;
        System.out.printf("В %d ", num);
        int count = 0;
        while (num > 0) {
            if (num % 10 == 2) count++;
            num /= 10;
        }
        String parity = count % 2 == 0 ? "чётное" : "нечётное";
        System.out.printf("(%s) количество двоек - %d\n", parity, count);

        System.out.println("\n6. Отображение геометрических фигур");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        int y = 5;
        while (y > 0) {
            int x = y;
            while (x > 0) {
                System.out.print("#");
                --x;
            }
            System.out.println();
            --y;
        }
        System.out.println();
        y = 5;
        do {
            int x = y == 4 || y == 2 ? 2 : y == 3 ? 3 : 0;
            do {
                System.out.print("$");
                --x;
            } while (x > 0);
            System.out.println();
            --y;
        } while(y > 0);

        System.out.println("\n7. Отображение ASCII-символов");
        for(int i = 15; i < 48; i += 2) {
            if (i == 15) {
                System.out.printf("%s%13s%16s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
            }
            System.out.printf("%4d%12s%14s%s%n", i, (char) i, "",Character.getName(i));
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int saveNum = num = 1234321;
        int tmp = 0;
        while (num > 0) {
            tmp += num % 10;
            num /= 10;
            tmp = num > 0 ? tmp * 10 : tmp;
        }
        String palindrome = saveNum == tmp ? "является" : "не является";
        System.out.printf("число %d %s палиндромом\n", saveNum, palindrome);

        System.out.println("\n9. Проверка, является ли число счастливым");
        num = 13123;
        int abc = 0;
        int def = 0;
        tmp = 0;
        System.out.print("Число " + num + " ");
        for(int i = 0; i < 6; i++) {
            tmp = num % 10;
            if(i < 3) {
                def += tmp;
            } else {
                abc += tmp;
            }
            num /= 10;
        }
        System.out.print((abc == def ? "является " : "не является ") + "счастливым\n");
        System.out.printf("Сумма цифр ABC = %d, а сумма DEF = %d\n", abc, def);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.printf("%11s%16s%n", "ТАБЛИЦА", "ПИФАГОРА");
        System.out.print("   |");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n---|----------------------------------");
        for(int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for(int j = 2; j < 10; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.printf("\n");
        }
    }
}