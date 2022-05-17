import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = "적금 이자 계산기";
        String qMessage1 = "월 적립액을 입력해주세요(원): ";
        String qMessage2 = "적금 기간을 입력해주세요(년): ";
        String qMessage3 = "연 이자율을 입력해주세요(%): ";
        double inputMonthly = 0, savingPeriod = 0, interestRate = 0;
        System.out.println(title);
        System.out.println(qMessage1);
        inputMonthly = sc.nextDouble();
        System.out.println(qMessage2);
        savingPeriod = sc.nextDouble();
        System.out.println(qMessage3);
        interestRate = sc.nextDouble();

        DecimalFormat form = new DecimalFormat("###,###,###,###,###");
        double inputSum = 0, interest = 0, interestSum = 0,
                interestAfterTax = 0, interestSumAfterTax = 0, finalSum = 0, finalSumAfterTax = 0;
        savingPeriod *= 12;
        interestRate /= (100 * 12);
        //System.out.println();
        while (savingPeriod > 0) {
            //System.out.println("남은 개월: " + form.format(savingPeriod));
            inputSum += inputMonthly;
            //System.out.println("원금합계: " + form.format(inputSum));
            finalSum += inputMonthly;
            //System.out.println("이전 원리합계 + 원금: " + form.format(finalSum));

            interest = finalSum * interestRate;
            //System.out.println("(이전 원리합계 + 원금)에 대한 이자: " + form.format(interest));

            finalSum += interest;
            //System.out.println("원리합계: " + form.format(finalSum));
            interestSum += interest;
            //System.out.println("이자 합계: " + form.format(interestSum));
            savingPeriod--;
            //System.out.println();
        }
        interestSumAfterTax = interestSum * 0.846;
        finalSumAfterTax = finalSum - interestSum + interestSumAfterTax;

        String aMessage1 = "원금합계: " + form.format(inputSum) + "원";
        String aMessage2 = "세후이자: " + form.format(interestSumAfterTax) + "원";
        String aMessage3 = "세후 총 수령액: " + form.format(finalSumAfterTax) + "원";
        System.out.println(aMessage1);
        System.out.println(aMessage2);
        System.out.println(aMessage3);
    }
}
