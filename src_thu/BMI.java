import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);


        //입력
        String questionMessage1 = "신장(cm): ";
        String questionMessage2 = "체중(kg): ";

        System.out.print(questionMessage1);

        double height = scanner.nextDouble();

        System.out.print(questionMessage2);

        double weight = scanner.nextDouble();


        //처리
        double bmiValue = weight / Math.pow((height * 0.01), 2);
        String bmiState = "";

        if (bmiValue <= 18.5) {
            bmiState = "저체중";
        }

        if (bmiValue > 18.5 && bmiValue <= 23) {
            bmiState = "정상";
        }

        if (bmiValue > 23 && bmiValue <= 25) {
            bmiState = "과체중";
        }

        if (bmiValue > 25) {
            bmiState = "비만";
        }

        String answerMessage1 = "비만도 결과: " + bmiState;
        String answerMessage2 = "BMI: " + bmiValue;


        //출력
        System.out.println(answerMessage1);
        System.out.println(answerMessage2);
    }
}
