import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String qMessage1 = "신장(cm): ";
        String qMessage2 = "체중(kg): ";
        double height = 0, weight = 0;

        System.out.print(qMessage1);
        height = sc.nextDouble();
        System.out.print(qMessage2);
        weight = sc.nextDouble();

        double BMIValue = 0;
        String BMIState = "";

        height /= 100;
        BMIValue = weight / Math.pow(height, 2);
        if (BMIValue <= 18.5) BMIState = "저체중";
        if (BMIValue > 18.5 && BMIValue <= 23) BMIState = "정상";
        if (BMIValue > 23 && BMIValue <= 25) BMIState = "과체중";
        if (BMIValue > 25) BMIState = "비만";

        String aMessage1 = "비만도 결과: " + BMIState;
        String aMessage2 = "BMI: " + BMIValue;
        System.out.println(aMessage1);
        System.out.println(aMessage2);
    }
}
