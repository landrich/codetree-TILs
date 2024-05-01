import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numArr = new int[2][4];
        int sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                numArr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += numArr[i][j];
            }
            System.out.print((double) (sum / 4) + " ");
        }

        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.print((double) (numArr[0][i] + numArr[1][i]) / 2 + " ");
        }

        System.out.println();
        sum = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                sum += numArr[i][j];
            }
        }

        System.out.println((double) sum / 8);
    }
}