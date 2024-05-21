import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strArr = new String[n];
        int len = 0, cnt = 0;

        for (int i = 0; i < n; i++) {
            strArr[i] = sc.next();
            len += strArr[i].length();
            if (strArr[i].charAt(0) == 'a') cnt++;
        }

        System.out.println(len + " " + cnt);
    }
}