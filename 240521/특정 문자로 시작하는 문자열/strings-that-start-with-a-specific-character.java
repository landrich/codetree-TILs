import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        int cnt = 0, len = 0;

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
        }

        char ch = sc.next().charAt(0);

        for (int i = 0; i < n; i++) {
            if (strArr[i].charAt(0) == ch) {
                cnt++;
                len += strArr[i].length();
            }
        }

        System.out.printf("%d %.2f", cnt, (double) len / cnt);
    }
}