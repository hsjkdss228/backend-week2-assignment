import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String qMessage1 = "Input 2 numbers: ";
        int a = 0, b = 0;
        System.out.print(qMessage1);
        a = sc.nextInt();
        b = sc.nextInt();

        int inputSum = 0, inputMul = 0;
        String qMessage2 = a + " + " + b + " = ?";
        String qMessage3 = a + " * " + b + " = ?";
        System.out.println(qMessage2);
        inputSum = sc.nextInt();
        System.out.println(qMessage3);
        inputMul = sc.nextInt();

        int answerSum = a + b, answerMul = a * b;
        boolean isRightSum = (inputSum == answerSum), isRightMul = (inputMul == answerMul);

        if (isRightSum && isRightMul) System.out.println("Genius!");
        if (!isRightSum && isRightMul || isRightSum && !isRightMul) System.out.println("Muggle!");
        if (!isRightSum && !isRightMul) System.out.println("Stupid!");
    }
}
