public class Main {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Задача 1");
        int depositAmount = 15_000;
        int totalDeposit = 0;
        int i = 0;
        while (totalDeposit < 2_459_000) {
            i++;
            totalDeposit = totalDeposit + depositAmount + totalDeposit / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDeposit + " рублей.");
        }
        System.out.println(" ");
        System.out.println("Задача 2");
        int k = 1;
        while ( k <= 10) {
            System.out.printf(k + " ");
            k++;
        }
        System.out.println(" ");
        for (int k2 = 10; k2 > 0; k2--) {
            System.out.printf(k2 + " ");
        }
        System.out.println(" ");
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int i2 = 2023; i2 <= 2033; i2++) {
            System.out.println("Год " + i2 + ", численность населения составляет " + population + ".");
            population = population + birthRate - mortality;
        }
        System.out.println(" ");
        System.out.println("Задача 4");
        int amountSavings4 = 0;
        int depositAmount4 = 15_000;
        int i3 = 0;
        while (amountSavings4 <= 12_000_000) {
            i3++;
            amountSavings4 = amountSavings4 + depositAmount4 + (amountSavings4/100)*7;
            System.out.println("Месяц " + i3 + ", сумма накоплений равна " + amountSavings4 + " рублей.");
        }
        System.out.println(" ");
        System.out.println("Задача 5");
        int amountSavings5 = 0;
        int depositAmount5 = 15_000;
        int i4 = 0;
        while (amountSavings5 <= 12_000_000) {
            i4++;
            amountSavings5 = amountSavings5 + depositAmount5 + (amountSavings5/100)*7;
            if (i4 % 6 == 0) {
                System.out.println("Месяц " + i4 + ", сумма накоплений равна " + amountSavings5 + " рублей.");
            }
        }
        System.out.println(" ");
        System.out.println("Задача 6");
        int amountSavings6 = 0;
        int depositAmount6 = 15_000;
        for (int i6 = 0; i6 <= 108; i6++) {
            amountSavings6 = amountSavings6 + depositAmount6 + (amountSavings6/100)*7;
            if (i6 % 6 == 0) {
                System.out.println("Месяц " + i6 + ", сумма накоплений равна " + amountSavings6 + " рублей.");
            }
        }
        System.out.println(" ");
        System.out.println("Задача 7");
        int friday = 2; // первая пятница месяца
        for (int date = 1; date <= 31; date++) {
            if ((date - friday) % 7 == 0) {
                System.out.println("Сегодня пятница " + date + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println(" ");
        System.out.println("Задача 8");
        int thisYear = 2023;
        for (int i8 = 0; i8 <= thisYear + 100; i8++) {
            if (i8 >= thisYear - 200 && i8 % 79 == 0) {
                System.out.println(i8);
            }
        }


        }
}