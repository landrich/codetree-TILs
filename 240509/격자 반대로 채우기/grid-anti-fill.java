import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] numArr = new int[n][n];
        int num = 1;

        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 1) {
                for (int j = n - 1; j >= 0; j--) {
                    numArr[j][i] = num++;
                }
            } else {
                for (int j = 0; j < n; j++) {
                    numArr[j][i] = num++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}