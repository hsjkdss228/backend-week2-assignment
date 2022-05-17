import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exercise = "";
        double weight, exerciseTime, propTime, kcalConsumption;

        System.out.print("운동 종류: ");
        exercise = scanner.nextLine();
        System.out.print("체중(kg): ");
        weight = scanner.nextDouble();
        System.out.print("운동 시간(분): ");
        exerciseTime = scanner.nextDouble();
        propTime = exerciseTime / 15;

        double coeff = 0;
        if (exercise.equals("자전거")) coeff = 2.3;
        if (exercise.equals("걷기")) coeff = 0.9;
        if (exercise.equals("달리기")) coeff = 2;

        kcalConsumption = coeff * weight * propTime;

        System.out.print("칼로리 소모: ");
        if (exercise.equals("걷기")) System.out.format("%.1f", kcalConsumption);
        if (exercise.equals("자전거") || exercise.equals("달리기")) System.out.print(kcalConsumption);
        System.out.println("kcal");
    }
}
