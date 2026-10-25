import java.util.Scanner;
public class practice3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceA95 = 56.50;
        double priceDiesel = 52.80;
        double priceGas = 29.40;

        System.out.println("=== КАЛЬКУЛЯТОР ПОЇЗДКИ ТА ПАЛЬНОГО ===");
        System.out.print("Введіть відстань поїздки (км): ");
        double distance = scanner.nextDouble();
        System.out.print("Введіть середню витрату на 100 км (л): ");
        double fuelConsumption = scanner.nextDouble();
        System.out.print("Оберіть тип пального (1 - А-95, 2 - Дизель, 3 - Газ): ");
        int fuelType = scanner.nextInt();
        if (distance <= 0) {
            System.out.println("Помилка! Відстань повинна бути більша за 0.");
            scanner.close();
            return;
        }
        if (fuelConsumption <= 0) {
            System.out.println("Помилка! Витрата пального повинна бути більша за 0.");
            scanner.close();
            return;
        }
        double fuelPricePerLiter = switch (fuelType) {
            case 1 -> priceGas;
            case 2 -> priceDiesel;
            case 3 -> priceA95;
            default -> {
                System.out.println("Помилка! Неправильний вибір типу пального.");
                yield -1;
            }
        };
        String fuelName = switch (fuelType) {
            case 1 -> "А-95";
            case 2 -> "Дизель";
            case 3 -> "Газ";
            default -> "Невідомо";
        };
        if (fuelPricePerLiter == -1) {
            scanner.close();
            return;
        }

        double totalFuelNeeded = (distance * fuelConsumption) / 100;
        double baseCost = totalFuelNeeded * fuelPricePerLiter;
        double discountPercent = 0.05;
        double discountAmount = baseCost * discountPercent;
        double finalCost = baseCost - discountAmount;

        System.out.println("\n---------------- ЗВІТ ПОЇЗДКИ ----------------");
        System.out.println("Обране пальне:               " + fuelName + " (" + fuelPricePerLiter + " грн/л)");
        System.out.println("Необхідно пального:          " + totalFuelNeeded + " л");
        System.out.println("Базова вартість:             " + baseCost + " грн");
        System.out.println("Знижка АЗС (5%):             " + discountAmount + " грн");
        System.out.println("----------------------------------------------");
        System.out.println("Підсумкова сума до сплати:   " + finalCost + " грн");
        System.out.println("==============================================");
        scanner.close();
    }
}