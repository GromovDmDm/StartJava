public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        var pointA = -10;
        var pointB = 21;
        var even = 0;
        var notEven = 0;
        System.out.print("В отрезке [" + pointA + ", " + pointB + "]");
        do {
            if(pointA % 2 == 0) {
                even++;
            } else {
                notEven--;
            }
            pointA++;
        } while (pointA <= pointB);
        System.out.print(" сумма четных чисел = " + even + ", а нечетных = " + notEven);

        System.out.println("\n\n2. Вывод чисел в порядке убывания");
        var num1 = 10;
        var num2 = 5;
        var num3 = -1;
        var max = num1;
        var min = num1;
        if(num2 > num1 && num2 > num3) {
            max = num2;
        } else if (num3 > num1 && num3 > num2) {
            max = num3;
        }
        if(num2 < num1 && num2 < num3) {
            min = num2;
        } else if (num3 < num1 && num3 < num2) {
            min = num3;
        }
        for(var i = 1; max - i > min + 1; i++) {
            System.out.print(max - i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его циф");
        var num = 1234;
        var sum = 0;
        var tmp = 0;
        while (num > 0) {
            tmp = num % 10;
            sum += tmp;
            System.out.print(tmp);
            num /= 10;
        }
        System.out.println("\nСумма цифр числа равна " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int j = 0;
        for(int i = 1; i < 24; i += 2, j++) {
            if(j % 5 == 0) {
                System.out.println();
            }
            System.out.printf("%6d", i);
        }
        j %= 10;
        int countZero = j <= 5 ? 5 - j : 10 - j;
        while (countZero > 0 && j != 0) {
            System.out.printf("%6d", 0);
            --countZero;
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        num = 3242592;
        System.out.printf("В %d ", num);
        int count = 0;
        while (num > 0) {
            count = num % 10 == 2 ? ++count : count;
            num /= 10;
        }
        String parity = 3 % 2 == 0 ? "чётное" : "нечётное";
        System.out.printf("(%s) количество двоек - %d\n", parity, count);

        System.out.println("\n6. Отображение геометрических фигур");
        for(int y = 0; y < 5; y++) {
            for(int x = 0; x < 10; x++) {
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
        tmp = 0;
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
            for(j = 2; j < 10; j++) {
                System.out.printf("%4d", i*j);
            }
            System.out.printf("\n");
        }
    }
}