import java.util.Scanner;

public class Megaboard {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);


        //입력
        final String QUESTION_MESSAGE1 = "이용시간(분): ";
        final String QUESTION_MESSAGE2 = "파킹존 주차여부: ";

        System.out.print(QUESTION_MESSAGE1);

        int rentalTime = scanner.nextInt();

        System.out.print(QUESTION_MESSAGE2);

        String parkedInLegalZone = scanner.next();


        //처리
        final int BASIC_CHARGE = 1000;
        final int ADDITIONAL_CHARGE_PER_MINUTE = 150;
        final double DISCOUNT_RATE = 0.1;
        final int PENALTY_CHARGE = 3000;
        int totalCharge = BASIC_CHARGE + (rentalTime * ADDITIONAL_CHARGE_PER_MINUTE);

        if (parkedInLegalZone.equals("O")) {
            totalCharge -= totalCharge * DISCOUNT_RATE;
        }

        if (parkedInLegalZone.equals("X")) {
            totalCharge += PENALTY_CHARGE;
        }

        String answerMessage = "요금: " + totalCharge + " 원";


        //출력
        System.out.println(answerMessage);
    }
}
