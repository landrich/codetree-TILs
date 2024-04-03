import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int n = 0;

        for (int i = 0; i < 10; i++) {
            n = sc.nextInt();
            if (n == 0) {
                n = i;
                break;
            }
            numArr[i] = n;
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numArr[i] + " ");
        }
    }
}