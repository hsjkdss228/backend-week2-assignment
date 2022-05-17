import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String qMessage = "전기 사용량(kWh): ";
        double electricUsage = 0;

        System.out.print(qMessage);
        electricUsage = sc.nextDouble();

        double priceUnder300 = 0, priceFrom300to450 = 0, priceFrom450to1000 = 0, priceOver1000 = 0;
        if (electricUsage > 1000) {
            priceOver1000 = (electricUsage - 1000) * 704.5;
            electricUsage = 1000;
        }
        if (electricUsage > 450) {
            priceFrom450to1000 = (electricUsage - 450) * 275.6;
            electricUsage = 450;
        }
        if (electricUsage > 300) {
            priceFrom300to450 = (electricUsage - 300) * 182.9;
            electricUsage = 300;
        }
        priceUnder300 = electricUsage * 88.3;

        int totalCost = (int)(priceUnder300 + priceFrom300to450 + priceFrom450to1000 + priceOver1000);
        String aMessage = "사용 금액: " + totalCost;

        System.out.println(aMessage);
    }
}
