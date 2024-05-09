import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] numArr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                numArr[i][j] = 1;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (i - 1 >= 0 && j - 1 >= 0)
                    numArr[i][j] = numArr[i - 1][j - 1] + numArr[i - 1][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }        
    }
}