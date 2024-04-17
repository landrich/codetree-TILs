import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        int maxIdx = n;
        int maxNum = 0;
        int tempIdx = n;
        
        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        while (maxIdx != 0) {
            maxIdx = tempIdx;
            maxNum = 0;
            for (int i = 0; i <= maxIdx - 1; i++) {
                if (numArr[i] > maxNum) {
                    maxNum = numArr[i];
                    tempIdx = i;
                }
            }

            System.out.print((tempIdx + 1) + " ");

            if (tempIdx == 0) break;
        }
    }
}