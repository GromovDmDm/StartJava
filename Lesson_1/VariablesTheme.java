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
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9_223_372_036_854_775_807l;
        System.out.printf("Первоначальное значение: %d, min значение типа byte: %d, "
                + "max значение типа byte: %d\n", maxByte, ++maxByte, --maxByte);
        System.out.printf("Первоначальное значение: %d, min значение типа short: %d, "
                + "max значение типа short: %d\n", maxShort, ++maxShort, --maxShort);
        System.out.printf("Первоначальное значение: %d, min значение типа int: %d, "
                + "max значение типа int: %d\n", maxInt, ++maxInt, --maxInt);
        System.out.printf("Первоначальное значение: %d, min значение типа long: %d, "
                + "max значение типа long: %d\n", maxLong, ++maxLong, --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int a = 2;
        int b = 5;
        System.out.printf("Способ третьей переменной. \nПервоначальные значение num1: "
                + "%d, значение num2: %d\n", a, b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.printf("Новые значения num1: %d, значение num2 %d\n", a, b);
        System.out.printf("Способ арифметических операций. \nПервоначальные значение num1: %d, "
                + "значение num2: %d\n", a, b);
        a -= b;
        b += a;
        a = b - a;
        System.out.printf("Новые значения num1: %d, значение num2 %d\n", a, b);
        System.out.printf("Способ побитовых операций. \nПервоначальные значение num1: %d, "
                + "значение num2: %d\n", a, b);
        a ^= b;
        b = a ^ b;
        a ^= b;
        System.out.printf("Новые значения num1: %d, значение num2: %d\n", a, b);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.printf("Символ: %c Код ASCII: %d\n", dollar, (int) dollar);
        System.out.printf("Символ: %c Код ASCII: %d\n", asterisk, (int) asterisk);
        System.out.printf("Символ: %c Код ASCII: %d\n", atSign, (int) atSign);
        System.out.printf("Символ: %c Код ASCII: %d\n", verticalBar, (int) verticalBar);
        System.out.printf("Символ: %c Код ASCII: %d\n", tilde, (int) tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char backSlash = '\\';
        char slash = '/';
        char leftPrenthesis = '(';
        char rightParenthesis = ')';
        char underScore = '_';
        System.out.printf("    %c%c\n", slash, backSlash);
        System.out.printf("   %c  %c\n", slash, backSlash);
        System.out.printf("  %c%c%c %c%c\n", slash, underScore, 
                leftPrenthesis, rightParenthesis, backSlash);
        System.out.printf(" %c      %c\n", slash, backSlash);
        System.out.printf("%c%c%c%c%c%c%c%c%c%c\n", slash, underScore, underScore, underScore, 
                underScore, slash, backSlash, underScore, underScore, backSlash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int ones = num % 10;
        int tens = num / 10 % 10;
        int hundreds = num / 100;
        System.out.println("Число N содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);
        System.out.println("Сумма его цифр = " + (ones + tens + hundreds));
        System.out.println("Произведение = " + (ones * tens * hundreds));

        System.out.println("\n9. Вывод времени");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = totalSeconds / 60 % 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}