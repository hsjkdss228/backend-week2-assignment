import java.util.Scanner;

public class SavingCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthlySavings, savingsPeriod;
        double interestRate;

        System.out.println("적금 이자 계산기");;
        System.out.println("월 적립액을 입력해주세요(원):");
        monthlySavings = scanner.nextInt();
        System.out.println("적금 기간을 입력해주세요(년):");
        savingsPeriod = scanner.nextInt();
        System.out.println("연 이자율을 입력해주세요(%):");
        interestRate = scanner.nextDouble();
        interestRate = interestRate / 100;

        int yearlySavings = monthlySavings * 12;
        //System.out.println("yearlySavings: " + yearlySavings);
        int totalSavings = yearlySavings * savingsPeriod;
        //System.out.println("totalSavings: " + totalSavings);
        double finalValue = totalSavings * Math.pow((1 + interestRate), (double)savingsPeriod);
        //System.out.println("이율: " + Math.pow((1 + interestRate), (double)savingsPeriod));
        //System.out.print("finalValue: ");
        //System.out.format("%.0f%n", finalValue);
        double interestOriginal = finalValue - totalSavings;
        //System.out.println("interestOriginal: " + interestOriginal);
        double interestAfterTax = interestOriginal - (interestOriginal * 0.154);
        //System.out.println("interestAfterTax: " + interestAfterTax);
        double finalValueAfterTax = totalSavings + interestAfterTax;
        //System.out.print("finalValueAfterTax: ");
        //System.out.format("%.0f%n", finalValueAfterTax);

        System.out.println("원금합계: " + totalSavings);
        System.out.print("세후이자: ");
        System.out.format("%.0f%n", interestAfterTax);
        System.out.println("세후 총 수령액: ");
        System.out.format("%.0f%n", finalValueAfterTax);
    }
}
