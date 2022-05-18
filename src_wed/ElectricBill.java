import java.text.DecimalFormat;
import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String questionMessage = "전기 사용량(kWh): ";
        double usage;

        System.out.print(questionMessage);
        usage = scanner.nextDouble();


        double rateUnder300 = 88.3;
        double rateBetween300and450 = 182.9;
        double rateBetween450and1000 = 275.6;
        double rateOver1000 = 704.5;

        double cost = 0;
        double fullCostUnder300 = 300 * rateUnder300;
        double fullCostBetween300and450 = 150 * rateBetween300and450;
        double fullCostBetween450and1000 = 550 * rateBetween450and1000;

        if (usage <= 300) {
            cost = usage * rateUnder300;
        }
        if (usage > 300 && usage <= 450) {
            usage -= 300;
            cost = fullCostUnder300 + (usage * rateBetween300and450);
        }
        if (usage > 450 && usage <= 1000) {
            usage -= 450;
            cost = fullCostUnder300 + fullCostBetween300and450 + (usage * rateBetween450and1000);
        }
        if (usage > 1000) {
            usage -= 1000;
            cost = fullCostUnder300 + fullCostBetween300and450 + fullCostBetween450and1000 + (usage * rateOver1000);
        }

        DecimalFormat form = new DecimalFormat("#");
        String answerMessage = "사용 금액: " + form.format(cost);

        System.out.println(answerMessage);
    }
}
