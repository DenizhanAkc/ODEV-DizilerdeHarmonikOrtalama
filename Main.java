
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizideki eleman sayısını giriniz");
        int n = scanner.nextInt();

        double[] numbers = new double[n];
        System.out.println("Dizinin elemanlarını giriniz");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        double harmonicSum = 0.0;
        for (double num : numbers) {
            harmonicSum += 1.0 / num;
        }

        double harmonicAverage = n / harmonicSum;

        System.out.println("Harmonik Ortalama: " + harmonicAverage);

        scanner.close();
    }
}
