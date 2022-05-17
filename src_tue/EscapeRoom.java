import java.util.Scanner;

public class EscapeRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escapeCount = 0;
        String qMessage1 = "Input 2 numbers: ";
        while (escapeCount < 3) {
            int a = 0, b = 0;
            System.out.print(qMessage1);
            a = sc.nextInt();
            b = sc.nextInt();

            int myAnswer = 0;
            String qMessage2 = a + " + " + b + " = ?";
            System.out.println(qMessage2);
            myAnswer = sc.nextInt();

            int answer = a + b;
            boolean isRight = (myAnswer == answer);
            if (isRight) {
                escapeCount += 1;
                String aMessage1 = "You're right! (" + escapeCount + ")";
                System.out.println(aMessage1);
            }
            if (!isRight) {
                String aMessage2 = "What?";
                System.out.println(aMessage2);
            }
        }

        String aMessage3 = "Escaped!";
        System.out.println(aMessage3);
    }
}
