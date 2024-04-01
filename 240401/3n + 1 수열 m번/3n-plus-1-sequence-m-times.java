import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m, cnt = 0;

        for (int i = 0; i < n; i++) {
            m = sc.nextInt();
            while (m != 1) {
                if (m % 2 == 0) {
                    m /= 2;
                    cnt++;
                } else {
                    m = m * 3 + 1;
                    cnt++;
                }
            }
            System.out.println(cnt);
            cnt = 0;
        }
    }
}