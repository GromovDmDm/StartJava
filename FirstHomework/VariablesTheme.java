public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte coreCpu = 8;
        short ram = 32;
        int vram = 8;
        long hdd = 1000;
        float clockRateCpu = 3.6F;
        double clockRateRam = 3.4;
        char markingCpu = 'K';
        boolean installedOs = true;
        System.out.println("Количество ядер центрального процессора: " + coreCpu);
        System.out.println("Маркировка процессора: " + markingCpu);
        System.out.println("Тактовая частота процессора: " + clockRateCpu + " ГГц");
        System.out.println("Объем видеопамяти: " + vram + " Гб");
        System.out.println("Объем оперативной памяти: " + ram + " Гб");
        System.out.println("Тактовая частота оперативной памяти: " + clockRateRam + " ГГц");
        System.out.println("Объем жёсткого диска: " + hdd + " Гб");
        System.out.println("Установлена ОС: " + installedOs);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int bookPrice = 200;
        int penPrice = 100;
        int discount = 11;
        int sumProduct = bookPrice + penPrice;
        int sumDiscount = (sumProduct * discount) / 100;
        System.out.println("Общая стоимость товара без скидки: " + sumProduct);
        System.out.println("Сумма скидки: " + sumDiscount);
        System.out.println("Общая стоимость товара со скидки: " + (sumProduct - sumDiscount));

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  V     V  a   "
                       + "\n   J   a a  V   V  a a  "
                       + "\nJ  J  aaaaa  V V  aaaaa "
                       + "\n JJ  a     a  v  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxValueByte = 127;
        short maxValueShort = 32767;
        int maxValueInt = 2147483647;
        long maxValueLong = 9_223_372_036_854_775_807l;
        System.out.printf("Первоначальное значение: %d, min значение типа byte: %d, "
                + "max значение типа byte: %d\n", maxValueByte, ++maxValueByte, --maxValueByte);
        System.out.printf("Первоначальное значение: %d, min значение типа short: %d, "
                + "max значение типа short: %d\n", maxValueShort, ++maxValueShort, --maxValueShort);
        System.out.printf("Первоначальное значение: %d, min значение типа int: %d, "
                + "max значение типа int: %d\n", maxValueInt, ++maxValueInt, --maxValueInt);
        System.out.printf("Первоначальное значение: %d, min значение типа long: %d, "
                + "max значение типа long: %d\n", maxValueLong, ++maxValueLong, --maxValueLong);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int num3;
        System.out.printf("Способ третьей переменной. \nПервоначальные значение num1: %d, значение num2: %d\n", num1, num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.printf("Новые значения num1: %d, значение num2 %d\n", num1, num2);
        System.out.printf("Способ арифметических операций. \nПервоначальные значение num1: %d, значение num2: %d\n", num1, num2);
        num1 = num1 - num2;
        num2 = num1 + num2;
        num1 = num2 - num1;
        System.out.printf("Новые значения num1: %d, значение num2 %d\n", num1, num2);
        System.out.printf("Способ побитовых операций. \nПервоначальные значение num1: %d, значение num2: %d\n", num1, num2);
        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;
        System.out.printf("Новые значения num1: %d, значение num2 %d\n", num1, num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        int dollarAscii = (int) dollar;
        int asteriskAscii = (int) asterisk;
        int atSignAscii = (int) atSign;
        int verticalBarAscii = (int) verticalBar;
        int tildeAscii = (int) tilde;
        System.out.printf("Символ: %c Код ASCII: %d\n", dollar, dollarAscii);
        System.out.printf("Символ: %c Код ASCII: %d\n", asterisk, asteriskAscii);
        System.out.printf("Символ: %c Код ASCII: %d\n", atSign, atSignAscii);
        System.out.printf("Символ: %c Код ASCII: %d\n", verticalBar, verticalBarAscii);
        System.out.printf("Символ: %c Код ASCII: %d\n", tilde, tildeAscii);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char backSlash = '\\';
        char slash = '/';
        char leftPrenthesis = '(';
        char rightParenthesis = ')';
        char underScore = '_';
        System.out.printf("    %c%c    \n", slash, backSlash);
        System.out.printf("   %c  %c   \n", slash, backSlash);
        System.out.printf("  %c%c%c %c%c  \n", slash, underScore, leftPrenthesis, rightParenthesis, backSlash);
        System.out.printf(" %c      %c \n", slash, backSlash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", slash, underScore, underScore, underScore, underScore, slash, backSlash, underScore, underScore, backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int unit = num % 10;
        num /= 10;
        int ten = num % 10;
        num /= 10;
        int hundred = num % 10;
        System.out.println("Число N содержит:");
        System.out.println("  сотен - " + hundred);
        System.out.println("  десятков - " + ten);
        System.out.println("  единиц - " + unit);
        System.out.println("Сумма его цифр = " + (unit + ten + hundred));
        System.out.println("Произведение = " + (unit * ten * hundred));

        System.out.println("\n9. Вывод времени");
        int numberSeconds = 86399;
        int hours = numberSeconds / 3600;
        int minutes = numberSeconds / 60 % 60;
        int seconds = numberSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}