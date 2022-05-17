import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elecUsage;

        System.out.print("전기 사용량(kWh): ");
        elecUsage = scanner.nextInt();

        double under300 = 0, under450 = 0, under1000 = 0, over1000 = 0;
        if (elecUsage <= 300) {
            under300 = elecUsage;
        }
        if (elecUsage > 300 && elecUsage <= 450) {
            under300 = 300;
            under450 = elecUsage - 300;
        }
        if (elecUsage > 450 && elecUsage <= 1000) {
            under300 = 300;
            under450 = 150;
            under1000 = elecUsage - 450;
        }
        if (elecUsage > 1000) {
            under300 = 300;
            under450 = 150;
            under1000 = 550;
            over1000 = elecUsage - 1000;
        }

        double totalCost = (under300 * 88.3) + (under450 * 182.9) + (under1000 * 275.6) + (over1000 * 704.5);

        System.out.print("사용 금액: ");
        System.out.format("%.0f%n", totalCost);
    }
}
