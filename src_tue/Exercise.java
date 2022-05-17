import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String qMessage1 = "운동 종류: ";
        String qMessage2 = "체중(kg): ";
        String qMessage3 = "운동 시간(분): ";
        String typeExercise = "";
        double weight = 0;
        int timeExercise = 0;

        System.out.print(qMessage1);
        typeExercise = sc.nextLine();
        System.out.print(qMessage2);
        weight = sc.nextDouble();
        System.out.print(qMessage3);
        timeExercise = sc.nextInt();

        double selectedCoef = 0, coefCycling = 2.3, coefWalking = 0.9, coefRunning = 2;
        double propTime = (double)timeExercise / 15;
        double kcalConsumption = 0;

        if (typeExercise.equals("자전거")) selectedCoef = coefCycling;
        if (typeExercise.equals("걷기")) selectedCoef = coefWalking;
        if (typeExercise.equals("달리기")) selectedCoef = coefRunning;
        kcalConsumption = selectedCoef * propTime * weight;
        if (typeExercise.equals("걷기")) kcalConsumption = Double.parseDouble(String.format("%.1f", kcalConsumption));
        // 고작 자릿수 하나 조정하는게 이렇게 복잡하다니...

        String aMessage = "칼로리 소모: " + kcalConsumption + "kcal";
        System.out.println(aMessage);
    }
}
