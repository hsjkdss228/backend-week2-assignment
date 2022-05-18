import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String questionMessage1 = "Input 2 numbers: ";
        int num1 = 0;
        int num2 = 0;

        System.out.print(questionMessage1);
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        String questionMessage2 = num1 + " + " + num2 + " = ?";
        String questionMessage3 = num1 + " * " + num2 + " = ?";
        int myAnswerSum = 0;
        int myAnswerMul = 0;

        System.out.println(questionMessage2);
        myAnswerSum = scanner.nextInt();
        System.out.println(questionMessage3);
        myAnswerMul = scanner.nextInt();


        int answerSum = num1 + num2;
        int answerMul = num1 * num2;
        boolean isRightSum = (answerSum == myAnswerSum);
        boolean isRightMul = (answerMul == myAnswerMul);
        String answerMessage1 = "Genius!";
        String answerMessage2 = "Muggle!";
        String answerMessage3 = "Stupid!";

        if (isRightSum && isRightMul) {
            System.out.println(answerMessage1);
        }
        if (!isRightSum && isRightMul || isRightSum && !isRightMul) {
            System.out.println(answerMessage2);
        }
        if (!isRightSum && !isRightMul) {
            System.out.println(answerMessage3);
        }
    }
}
