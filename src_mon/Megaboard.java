import java.util.Scanner;

public class Megaboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rentTime;
        String isParkedInZone = "";
        System.out.print("이용 시간(분): ");
        rentTime = scanner.nextInt();
        System.out.print("파킹존 주차여부: ");
        scanner.nextLine();      //next숫자() 이후 버퍼에 \n이 남아있으므로 반환 인자 없이 nextLine()을 한번 더 수행해 버퍼 비워주기
        isParkedInZone = scanner.nextLine();

        int basicFee = 1000, additionalFee = 150, totalFee;
        totalFee = basicFee + (additionalFee * rentTime);
        if (isParkedInZone.equals("O")) totalFee = totalFee - (totalFee / 10);
        if (isParkedInZone.equals("X")) totalFee = totalFee + 3000;

        System.out.println("요금: " + totalFee + " 원");
    }
}
