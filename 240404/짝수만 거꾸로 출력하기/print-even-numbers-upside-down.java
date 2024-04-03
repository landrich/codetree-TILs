import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            if (m % 2 == 0) {
                numArr[cnt++] = m;
            }
        }

        for (int i = cnt - 1; i >= 0; i--) {
            System.out.print(numArr[i] + " ");
        }
    }
}