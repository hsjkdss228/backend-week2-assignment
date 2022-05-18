import java.text.DecimalFormat;
import java.util.Scanner;

public class SavingsInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String questionMessage1 = "월 적립액을 입력해주세요(원):";
        String questionMessage2 = "적금 기간을 입력해주세요(년):";
        String questionMessage3 = "연 이자율을 입력해주세요(%):";
        double depositMonthly;                  //월 적립액
        double periodSavingsYearly;             //총 연간 적금 기간
        double interestRateYearly;              //'연' 이자율;

        System.out.println(questionMessage1);
        depositMonthly = scanner.nextDouble();
        System.out.println(questionMessage2);
        periodSavingsYearly = scanner.nextDouble();
        System.out.println(questionMessage3);
        interestRateYearly = scanner.nextDouble();


        double periodSavingsMonthly = periodSavingsYearly * 12;                 //총 연간 적금 기간 >> 월간 적금 기간으로 환산
        double interestRateMonthly = (interestRateYearly * 0.01) / 12;          //총 연 이자율 >> 월 이자율로 환산
        double depositSum = 0;                      //적립액 합계
        double interest = 0;                        //이자
        double interestSum = 0;                     //이자 합계
        double finalSum = 0;                        //원리합계
        double interestSumAfterTax = 0;             //세후 합계 이자
        double taxRateInterest = 0.154;             //이자 세율
        double finalSumAfterTax = 0;                //세후 원리합계


        while (periodSavingsMonthly > 0) {
            depositSum += depositMonthly;                       //적립액 합계에 월 적립액을 더함
            finalSum += depositMonthly;                         //원리합계 계산을 위해 원리합계에도 월 적립액을 더함
                                                                //이자는 매달 원리합계를 기준으로 계산되므로,
            interest = finalSum * interestRateMonthly;          //원리합계의 월 이자율에 해당하는 이자를 산출
            finalSum += interest;                               //산출된 이자를 원리합계에 더하여 적립액에 이자를 반영
            periodSavingsMonthly -= 1;                          //해당 과정을 전체 월 기간만큼 반복하여
        }                                                       //세전 총 원리합계 산출
        interestSum = finalSum - depositSum;                                            //세전 총 원리합계에서 원금을 제외하여 이자 총액 산출
        interestSumAfterTax = interestSum - (interestSum * taxRateInterest);            //세후 이자 산출
        finalSumAfterTax = depositSum + interestSumAfterTax;                            //세후 원리합계 산출

        DecimalFormat form = new DecimalFormat("###,###,###,###,###");
        String answerMessage1 = "원금합계: " + form.format(depositSum) + "원";
        String answerMessage2 = "세후이자: " + form.format(interestSumAfterTax) + "원";
        String answerMessage3 = "세후 총 수령액: " + form.format(finalSumAfterTax) + "원";

        System.out.println(answerMessage1);
        System.out.println(answerMessage2);
        System.out.println(answerMessage3);
    }
}
