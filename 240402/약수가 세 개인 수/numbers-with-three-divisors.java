import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int num = 0, cnt = 0;

        for (int i = start; i <= end; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) num++;
            }
            if (num == 3) cnt++;
            num = 0;
        }
        System.out.println(cnt);
    }
}