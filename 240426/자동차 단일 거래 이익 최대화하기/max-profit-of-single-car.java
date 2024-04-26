import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];

        int max = 0;

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (numArr[i] < numArr[j] && numArr[j] - numArr[i] > max) {
                    max = numArr[j] - numArr[i];
                }
            }
        }

        System.out.println(max);
    }
}