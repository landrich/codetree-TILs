import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] numArr = new int[n][m];
        int f = 0, b = 0, temp, num = 1;

        while (true) {
            if (f < n && b < m) {
                numArr[f++][b--] = num++;
            } else {
                f++;
                b--;
            }
            
            if (b == -1) {
                temp = f;
                f = b;
                b = temp;
                f++;
            }

            if (num == n * m + 1) break;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(numArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}