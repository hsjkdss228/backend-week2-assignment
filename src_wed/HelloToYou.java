import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String questionMessage = "What's your name? ";
        String name = "";

        System.out.print(questionMessage);
        name = scanner.nextLine();

        String answerMessage = "Hello, " + name + "!";

        System.out.println(answerMessage);
    }
}
