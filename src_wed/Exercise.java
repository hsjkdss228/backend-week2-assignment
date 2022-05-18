import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String questionMessage1 = "운동 종류: ";
        String questionMessage2 = "체중(kg): ";
        String questionMessage3 = "운동 시간(분): ";
        String typeExercise = "";
        double weight = 0;
        double timeExercise = 0;

        System.out.print(questionMessage1);
        typeExercise = scanner.nextLine();
        System.out.print(questionMessage2);
        weight = scanner.nextDouble();
        System.out.print(questionMessage3);
        timeExercise = scanner.nextDouble();


        double kcalConsumption = 0;

        DecimalFormat form = new DecimalFormat("#.#");
        timeExercise /= 15;
        double coefficientBike = 2.3;
        double coefficientWalking = 0.9;
        double coefficientRunning = 2;

        if (typeExercise.equals("자전거")) {
            kcalConsumption = coefficientBike * timeExercise * weight;
        }
        if (typeExercise.equals("걷기")) {
            kcalConsumption = coefficientWalking * timeExercise * weight;
        }
        if (typeExercise.equals("달리기")) {
            kcalConsumption = coefficientRunning * timeExercise * weight;
        }

        String answerMessage = "칼로리 소모: ";
        if (typeExercise.equals("걷기")) {
            answerMessage += form.format(kcalConsumption) + "kcal";
        }
        if (typeExercise.equals("자전거") || typeExercise.equals("달리기")) {
            answerMessage += kcalConsumption + "kcal";
        }

        System.out.println(answerMessage);
    }
}
