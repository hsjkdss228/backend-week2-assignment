import java.util.Scanner;

public class HelloToYou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String qMessage1 = "What's your name? ";
        System.out.print(qMessage1);
        String name = sc.nextLine();

        String aMessage1 = "Hello, " + name + "!";
        System.out.println(aMessage1);
    }
}
