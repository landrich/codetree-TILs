import java.util.Scanner;

public class Main {
    public static boolean calc(int m) {
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                return false;
            }
        }

        if ((m / 10 + m % 10) % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = a; i <= b; i++) {
            if (calc(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}