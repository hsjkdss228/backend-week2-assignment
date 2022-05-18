import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String questionMessage1 = "Input 2 numbers: ";
        String questionMessage2 = "";
        String answerMessage1 = "";
        String answerMessage2 = "What?";
        String answerMessgae3 = "You've been escaped!";
        int escapeCount = 0;
        int userInput1 = 0, userInput2 = 0;
        int userAnswer = 0;

        while (escapeCount < 3) {
            System.out.print(questionMessage1);
            userInput1 = scanner.nextInt();
            userInput2 = scanner.nextInt();

            questionMessage2 = userInput1 + " + " + userInput2 + " = ?";

            System.out.println(questionMessage2);
            userAnswer = scanner.nextInt();

            boolean isRightUserAnswer = (userAnswer == userInput1 + userInput2);

            if (isRightUserAnswer) {
                escapeCount += 1;
                answerMessage1 = "You're right! (" + escapeCount + ")";
                System.out.println(answerMessage1);
            }
            if (!isRightUserAnswer) {
                System.out.println(answerMessage2);
            }
        }

        System.out.println(answerMessgae3);
    }
}
