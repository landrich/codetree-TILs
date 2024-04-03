import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int n, cnt = 9;

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if (n == 0) {
                cnt = i - 1;
                break;
            }
            numArr[i] = n;
        }

        for (int i = cnt; i >= 0; i--) {
            System.out.print(numArr[i] + " ");
        }
    }
}