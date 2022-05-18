import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String questionMessage1 = "신장(cm): ";
        String questionMessage2 = "체중(kg): ";
        double height = 0, weight = 0;

        System.out.print(questionMessage1);
        height = scanner.nextDouble();
        System.out.print(questionMessage2);
        weight = scanner.nextDouble();

        double bmi = 0;
        String bmiState = "";

        height /= 100;
        bmi = weight / Math.pow(height, 2);
        if (bmi <= 18.5) {
            bmiState = "저체중";
        }
        if (bmi > 18.5 && bmi <= 23) {
            bmiState = "정상";
        }
        if (bmi > 23 && bmi <= 25) {
            bmiState = "과체중";
        }
        if (bmi > 25) {
            bmiState = "비만";
        }

        String answerMessage1 = "비만도 결과: " + bmiState;
        String answerMessage2 = "BMI: " + bmi;

        System.out.println(answerMessage1);
        System.out.println(answerMessage2);
    }
}
