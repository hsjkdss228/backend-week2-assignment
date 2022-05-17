import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height_cm, height_m, weight;

        System.out.print("신장: ");
        height_cm = scanner.nextDouble();
        height_m = height_cm / 100;
        System.out.print("체중: ");
        weight = scanner.nextDouble();

        double BMIValue = weight / (height_m * height_m);
        String BMIState = "";
        if (BMIValue <= 18.5) BMIState = "저체중";
        if (BMIValue > 18.5 && BMIValue <= 23) BMIState = "정상";
        if (BMIValue > 23 && BMIValue <= 25) BMIState = "과체중";
        if (BMIValue > 25) BMIState = "비만";

        System.out.println("비만도 결과: " + BMIState);
        System.out.println("BMI: " + BMIValue);
    }
}
