import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 2 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a + " + " + b + " = ?");
        int inputSum = scanner.nextInt();
        System.out.println(a + " * " + b + " = ?");
        int inputMul = scanner.nextInt();

        int answerSum = a + b, answerMul = a * b;
        boolean isRightSum = (inputSum == answerSum);
        boolean isRightMul = (inputMul == answerMul);

        if (isRightSum && isRightMul) System.out.println("Genius!");
        if ((!isRightSum && isRightMul) || (isRightSum && !isRightMul)) System.out.println("Muggle!");
        if (!isRightSum && !isRightMul) System.out.println("Stupid!");
    }
}
