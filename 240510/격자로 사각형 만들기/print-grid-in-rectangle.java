import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] numArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numArr[i][j] = 1;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                numArr[i][j] = numArr[i - 1][j - 1] + numArr[i - 1][j] + numArr[i][j - 1];
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