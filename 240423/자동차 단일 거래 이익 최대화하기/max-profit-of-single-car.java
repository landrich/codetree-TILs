import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minIndex = -1;

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
            if (numArr[i] <= min) { 
                min = numArr[i];
                minIndex = i;
            }
        }

        for (int i = minIndex; i < n; i++) {
            if (numArr[i] > max) max = numArr[i];
        }

        System.out.println(minIndex == n - 1 ? 0 : max - min);

    }
}