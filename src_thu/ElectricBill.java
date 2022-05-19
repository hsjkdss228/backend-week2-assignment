import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("#");


        //입력
        final String QUESTION_MESSAGE = "전기 사용량(kWh): ";

        System.out.print(QUESTION_MESSAGE);

        double electricityUsage = scanner.nextDouble();


        //처리
        final double USAGE_SECTION_1 = 300;
        final double USAGE_SECTION_2 = 150;
        final double USAGE_SECTION_3 = 550;
        final double RATE_PER_WATT_IN_SECTION_1 = 88.3;
        final double RATE_PER_WATT_IN_SECTION_2 = 182.9;
        final double RATE_PER_WATT_IN_SECTION_3 = 275.6;
        final double RATE_PER_WATT_OVER_SECTION_3 = 704.5;
        final double MAXIMUM_RATE_IN_SECTION_1 = USAGE_SECTION_1 * RATE_PER_WATT_IN_SECTION_1;
        final double MAXIMUM_RATE_IN_SECTION_2 = USAGE_SECTION_2 * RATE_PER_WATT_IN_SECTION_2;
        final double MAXIMUM_RATE_IN_SECTION_3 = USAGE_SECTION_3 * RATE_PER_WATT_IN_SECTION_3;
        double charge = 0;

        if (electricityUsage <= USAGE_SECTION_1) {
            charge += electricityUsage * RATE_PER_WATT_IN_SECTION_1;
        }

        if (electricityUsage > USAGE_SECTION_1 && electricityUsage <= USAGE_SECTION_1 + USAGE_SECTION_2) {
            electricityUsage -= USAGE_SECTION_1;
            charge += MAXIMUM_RATE_IN_SECTION_1 + (electricityUsage * RATE_PER_WATT_IN_SECTION_2);
        }

        if (electricityUsage > USAGE_SECTION_1 + USAGE_SECTION_2 &&
                electricityUsage <= USAGE_SECTION_1 + USAGE_SECTION_2 + USAGE_SECTION_3) {
            electricityUsage -= USAGE_SECTION_1 + USAGE_SECTION_2;
            charge += MAXIMUM_RATE_IN_SECTION_1 + MAXIMUM_RATE_IN_SECTION_2 + (electricityUsage * RATE_PER_WATT_IN_SECTION_3);
        }

        if (electricityUsage > USAGE_SECTION_1 + USAGE_SECTION_2 + USAGE_SECTION_3) {
            electricityUsage -= USAGE_SECTION_1 + USAGE_SECTION_2 + USAGE_SECTION_3;
            charge += MAXIMUM_RATE_IN_SECTION_1 + MAXIMUM_RATE_IN_SECTION_2 + MAXIMUM_RATE_IN_SECTION_3
                    + (electricityUsage * RATE_PER_WATT_OVER_SECTION_3);
        }

        String answerMessage = "사용 금액: " + form.format(charge);


        //출력
        System.out.println(answerMessage);
    }
}
