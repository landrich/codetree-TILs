import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
        }

        int minNum = numArr[0];

        for (int i = 1; i < n; i++) {
            if (minNum > numArr[i]) minNum = numArr[i];
        }

        for (int i = 0; i < n; i++) {
            if (minNum == numArr[i]) cnt++;
        }

        System.out.println(minNum + " " + cnt);
    }
}