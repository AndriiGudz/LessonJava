package homework_03;

public class HomeWork03 {
    public static void main(String[] args) {

        // Задача 0

        String myName = "Андрей";
        int myAge = 43;
        double milkPrice = 1.19;

        System.out.println("Мое имя: " + myName + ".\nМне " + myAge + " года." + "\n1 литр молока стоит " + milkPrice);


        // Задача 1

        int var0 = 0;
        int var1 = 1;
        int var2 = 2;
        int var3 = 3;
        int var4 = 4;
        int var5 = 5;
        int var6 = 6;
        int var7 = 7;
        int var8 = 8;
        int var9 = 9;

        int resultSr;
        int resultOst;

        resultSr = (var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9) / 10;
        resultOst = (var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9) % 10;

        System.out.println("\nЗадача 1\n");
        System.out.println("Среднее значение = " + resultSr);
        System.out.println("Остаток = " + resultOst);

        // Задача 2

        double tovarA = 1000;
        double tovarB = 500;

        double priceSum;
        double priceSale;
        double skidka;

        priceSum = tovarA + tovarB;
        skidka = priceSum * 0.1;
        priceSale = priceSum - skidka;

        System.out.println("\nЗадача 2\n");
        System.out.printf("Стоимсоть товаров со скидкой - %.0f евро", priceSale);
        System.out.printf("\nСумма скидка от покупки - %.0f евро", skidka);

        // Задача 3

        int monday = -2;
        int tuesday = -1;
        int wednesday = 0;
        int thursday = 1;
        int friday = 2;
        int saturday = 3;
        int sunday = 4;

        double srTemp;
        srTemp = (monday + tuesday + wednesday + thursday + friday + saturday + sunday) / (double) 7;

        System.out.println("\nЗадача 3\n");
        System.out.println("Средняя температура за неделю в городе Баунах - " + srTemp);


        // Задача 4

        int exm1 = 5;
        int exm2 = 17;

        int resul2 = exm1 % 2; // Пример деления на 2
        int resul3 = exm2 % 2; // Пример деления на 2
        int resul4 = exm1 % 3; // Пример деления на 3
        int resul5 = exm2 % 3; // Пример деления на 3

        System.out.println("\nЗадача 4\n");
        System.out.println("Остаток от деления на 2: = " + resul2);
        System.out.println("Остаток от деления на 2: = " + resul3);

        System.out.println("\nОстаток от деления на 3: = " + resul4);
        System.out.println("Остаток от деления на 3: = " + resul5);


    }
}
