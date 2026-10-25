import java.util.Scanner;
public class practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        System.out.println("=== АНАЛІЗАТОР ДІАПАЗОНУ ЧИСЕЛ ===");

        do {
            System.out.print("Введіть число N: ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Помилка: N має бути більшим за 0!");
            }
        } while (n <= 0);

        int totalSum = 0;
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {
            totalSum = totalSum + i;

            if (i % 2 == 0) {
                evenSum = evenSum + i;
                evenCount++;
            } else {
                oddSum = oddSum + i;
                oddCount++;
            }
        }
        double average = (double) totalSum / n;

        System.out.println("");
        System.out.println("--- РЕЗУЛЬТАТИ ДЛЯ ДІАПАЗОНУ [1 .. " + n + "] ---");
        System.out.println("Загальна сума чисел:       " + totalSum);
        System.out.println("Сума парних чисел:         " + evenSum + " (кількість: " + evenCount + ")");
        System.out.println("Сума непарних чисел:       " + oddSum + " (кількість: " + oddCount + ")");


        System.out.println("Середнє арифметичне:       " + average);
        System.out.println("=========================================");

        scanner.close();
    }
}
