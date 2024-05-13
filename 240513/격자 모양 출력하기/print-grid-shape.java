import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] numArr = new int[n][n];

        for (int i = 0; i < m; i++) {
            int f = sc.nextInt();
            int b = sc.nextInt();
            numArr[f - 1][b - 1] = f * b;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}