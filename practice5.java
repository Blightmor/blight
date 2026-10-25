import java.util.Scanner;
public class practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};
        double[] sales = new double[7];

        System.out.println("=== ФІНАНСОВИЙ ЗВІТ КАВ'ЯРНІ ЗА ТИЖДЕНЬ ===");

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Введіть виторг за " + days[i] + " (грн): ");
            sales[i] = scanner.nextDouble();
        }

        double totalSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSales = totalSales + sales[i];
        }

        double averageSales = totalSales / sales.length;

        double maxSales = sales[0];
        String bestDay = days[0];
        double minSales = sales[0];
        String worstDay = days[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > maxSales) {
                maxSales = sales[i];
                bestDay = days[i];
            }
            if (sales[i] < minSales) {
                minSales = sales[i];
                worstDay = days[i];
            }
        }

        System.out.println("");
        System.out.println("---------------- ПІДСУМКИ ----------------");
        System.out.println("Загальний тижневий виторг: " + totalSales + " грн");
        System.out.println("Середній виторг на день:    " + averageSales + " грн");
        System.out.println("Найкращий день:            " + bestDay + " (" + maxSales + " грн)");
        System.out.println("Найгірший день:            " + worstDay + " (" + minSales + " грн)");
        System.out.println("");
        System.out.println("Дні з виторгом вище середнього:");

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                System.out.println("- " + days[i] + ": " + sales[i] + " грн");
            }
        }
        System.out.println("=========================================");
        scanner.close();
    }
}
