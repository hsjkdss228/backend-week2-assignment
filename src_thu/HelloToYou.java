import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {
        //준비
        Scanner scanner = new Scanner(System.in);

        //입력
        String questionMessage = "What's your name? ";

        System.out.print(questionMessage);

        String name = scanner.nextLine();

        //처리
        String answerMessage = "Hello, " + name + "!";

        //출력
        System.out.println(answerMessage);
    }
}
