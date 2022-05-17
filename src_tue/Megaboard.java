import java.util.Scanner;

public class Megaboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String qMessage1 = "이용시간(분): ";
        String qMessage2 = "파킹존 주차여부: ";
        int timeRent = 0;
        String isParkedInZone = "";

        System.out.print(qMessage1);
        timeRent = sc.nextInt();
        System.out.print(qMessage2);
        sc.reset();
        isParkedInZone = sc.next();

        int basicCost = 1000, costPerMinute = 150, totalCost = 0;
        totalCost = basicCost + (costPerMinute * timeRent);
        if (isParkedInZone.equals("O")) totalCost -= totalCost * 0.1;
        if (isParkedInZone.equals("X")) totalCost += 3000;

        String aMessage = "요금: " + totalCost + " 원";
        System.out.println(aMessage);
    }
}
