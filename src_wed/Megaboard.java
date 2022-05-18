import java.util.Scanner;

public class Megaboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String questionMessage1 = "이용시간(분): ";
        String questionMessage2 = "파킹존 주차여부: ";
        int timeRent = 0;
        String parkedInZone = "";

        System.out.print(questionMessage1);
        timeRent = scanner.nextInt();
        scanner.nextLine();
        System.out.print(questionMessage2);
        parkedInZone = scanner.nextLine();


        int rateTotal = 0;
        int rateBasic = 1000;
        int rateAdditional = 150;
        double rateDiscount = 0.1;
        int penalty = 3000;

        rateTotal = rateBasic + (rateAdditional * timeRent);
        if (parkedInZone.equals("O")) {
            rateTotal -= rateTotal * rateDiscount;
        }
        if (parkedInZone.equals("X")) {
            rateTotal += penalty;
        }

        String answerMessage = "요금: " + rateTotal + "원";

        System.out.println(answerMessage);
    }
}
