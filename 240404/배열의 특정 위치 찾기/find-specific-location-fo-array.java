import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < 10; i++)
            numArr[i] = sc.nextInt();

        for (int i = 1; i < 10; i += 2)
            sum1 += numArr[i];

        for (int i = 2; i < 10; i += 3)
            sum2 += numArr[i];

        System.out.printf("%d %.1f", sum1, (double) sum2 / 3);
    }
}