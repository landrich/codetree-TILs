import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int n, cnt = 0, sum = 0;

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if (n == 0) {
                cnt = i;
                break;
            }
            numArr[i] = n;
            cnt++;
        }

        for (int i = 0; i <= cnt; i++) {
            sum += numArr[i];
        }

        System.out.printf("%d %.1f", sum, (double) sum / cnt);
    }
}