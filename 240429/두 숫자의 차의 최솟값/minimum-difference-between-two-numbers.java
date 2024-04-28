import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (numArr[j] - numArr[i] < min) {
                    min = numArr[j] - numArr[i];
                }
            }
        }

        System.out.println(min);
    }
}