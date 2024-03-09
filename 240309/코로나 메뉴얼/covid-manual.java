import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char aCold = sc.next().charAt(0);
        int aTemp = sc.nextInt();
        char bCold = sc.next().charAt(0);
        int bTemp = sc.nextInt();
        char cCold = sc.next().charAt(0);
        int cTemp = sc.nextInt();
        int cnt = 0;

        if (aCold == 'Y' && aTemp >= 37)
            cnt++;
        if (aCold == 'Y' && aTemp >= 37)
            cnt++;
        if (aCold == 'Y' && aTemp >= 37)
            cnt++;

        System.out.println(cnt >= 2 ? "E" : "N");
    }
}