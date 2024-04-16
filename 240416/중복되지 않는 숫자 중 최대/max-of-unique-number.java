import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        int max = -1;
        int findCnt = 0;

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            findCnt = 0;
            for (int j = i + 1; j < n; j++) {
                if (numArr[i] == numArr[j]) {
                    numArr[j] = 0;
                    findCnt++;
                }
            }
            if (findCnt > 0) numArr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (numArr[i] != 0 && numArr[i] > max) {
                max = numArr[i];
            }
        }

        System.out.print(max);
    }
}