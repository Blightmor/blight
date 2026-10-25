public class practice2 {
    static void main(String[] args) {

        System.out.println("ЗАВДАННЯ №1");

        double usdAmount = 158.0;
        final double EXCHANGE_RATE = 44.90;
        final double COMMISSION_PERCENT = 1.5;
        double ll = usdAmount * EXCHANGE_RATE;
        double Comission = ll  * COMMISSION_PERCENT / 100;
        double ff = ll - Comission;
        long tt = Math.round(7094.2);

        System.out.println("================ КВИТАНЦІЯ ОБМІНУ ================");
        System.out.println("Сума до обміну:\t\t\t\t\t  " + usdAmount + " USD");
        System.out.println("Курс валют:\t\t\t\t\t\t  " + EXCHANGE_RATE + " UAH/USD");
        System.out.println("Нараховано до комісії:\t\t\t  " + ll + " UAH");
        System.out.println("Комісія банку (1.5%):\t\t\t  " + Comission + " UAH");
        System.out.println("--------------------------------------------------");
        System.out.println("Чиста сума до видачі:\t\t\t  " + ll + " UAH");
        System.out.println("До видачі готівкою:\t\t\t\t  " + tt + " UAH");
        System.out.println("==================================================");


        System.out.println("");
        System.out.println("");


        System.out.println("ЗАВДАННЯ №2");

        int number = 688;
        int hundreds = number / 100;
        int tens = number % 10;
        int units = number % 10;
        int reversedNumber = units * 100 + tens * 10 + hundreds;
        boolean isSumEven;

        System.out.println("Початкове число:\t\t" + number);
        System.out.print("Розряди:\t\t\t\t");
        System.out.print("Сотні = " +  hundreds);
        System.out.print(", Десятки = " + tens);
        System.out.println(", Одиниці = " + units);
        System.out.print("Сума цифр:\t\t\t\t");
        System.out.println(hundreds + tens + units);
        System.out.print("Добуток цифр:\t\t\t");
        System.out.println(hundreds * tens * units);
        System.out.print("Перевернуте число:\t\t");
        System.out.println(reversedNumber);
        System.out.print("Чи є сума цифр парною?\t");
        System.out.println(isSumEven=true);
    }
}
