import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);
        DecimalFormat form = new DecimalFormat("#.#");


        //입력
        final String QUESTION_MESSAGE1 = "운동 종류: ";
        final String QUESTION_MESSAGE2 = "체중(kg): ";
        final String QUESTION_MESSAGE3 = "운동 시간(분): ";

        System.out.print(QUESTION_MESSAGE1);

        String workoutName = scanner.nextLine();

        System.out.print(QUESTION_MESSAGE2);

        double weight = scanner.nextDouble();

        System.out.print(QUESTION_MESSAGE3);

        double workoutTime = scanner.nextDouble();


        //처리
        final String[][] VALID_WORKOUTS = {{"자전거", "2.3"}, {"걷기", "0.9"}, {"달리기", "2"}};
        final int INDEX_VALID_WORKOUT_NAME = 0;
        final int INDEX_VALID_WORKOUT_COEFFICIENT = 1;
        boolean isValidWorkouts = false;
        double kcalConsumption = 0;
        double workoutTimeProportional = workoutTime / 15;

        for (int i = 0; i < VALID_WORKOUTS.length; i++) {
            if (workoutName.equals(VALID_WORKOUTS[i][INDEX_VALID_WORKOUT_NAME])) {
                isValidWorkouts = true;
                kcalConsumption = Double.parseDouble(VALID_WORKOUTS[i][INDEX_VALID_WORKOUT_COEFFICIENT]) * workoutTimeProportional * weight;

                break;
            }
        }

        final String ERROR_MESSAGE = "운동 계수 값을 확인할 수 없는 운동입니다.";
        String answerMessage = "칼로리 소모: ";

        if (workoutName.equals("걷기")) {
            answerMessage += form.format(kcalConsumption);
        }

        if (!workoutName.equals("걷기")) {
            answerMessage += kcalConsumption;
        }

        answerMessage += "kcal";


        //출력
        if (!isValidWorkouts) {
            System.out.println(ERROR_MESSAGE);
        }

        if (isValidWorkouts) {
            System.out.println(answerMessage);
        }
    }
}
