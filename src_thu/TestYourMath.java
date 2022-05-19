import java.util.Scanner;

public class TestYourMath {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);


        //입력
        String questionMessage1 = "Input 2 numbers: ";

        System.out.print(questionMessage1);

        int userInputNumber1 = scanner.nextInt();
        int userInputNumber2 = scanner.nextInt();

        String questionMessage2 = userInputNumber1 + " + " + userInputNumber2 + " = ?";

        System.out.println(questionMessage2);

        int userInputSummation = scanner.nextInt();

        String questionMessage3 = userInputNumber1 + " * " + userInputNumber2 + " = ?";

        System.out.println(questionMessage3);

        int userInputMultiplication = scanner.nextInt();


        //처리
        boolean isRightSummation = userInputSummation == (userInputNumber1 + userInputNumber2);
        boolean isRightMultiplication = userInputMultiplication == (userInputNumber1 * userInputNumber2);

        String[] answerMessage = {"Genius!", "Muggle!", "Stupid!"};


        //출력
        if (isRightSummation && isRightMultiplication) {
            System.out.println(answerMessage[0]);
        }

        if (!isRightSummation && isRightMultiplication || isRightSummation && !isRightMultiplication) {
            System.out.println(answerMessage[1]);
        }

        if (!isRightSummation && !isRightMultiplication) {
            System.out.println(answerMessage[2]);
        }
    }
}
