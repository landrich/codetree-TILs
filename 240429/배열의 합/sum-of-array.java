import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] numArr = new int[4][4];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                numArr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += numArr[i][j];
            }
            System.out.println(sum);
        }
    }
}