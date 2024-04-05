import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[100];
        int sum = 0;
        numArr[0] = 1;
        numArr[1] = n;

        for (int i = 0; i <= 99; i++) {
            numArr[i + 2] += numArr[i] + numArr[i + 1];
            System.out.print(numArr[i] + " ");
            if (numArr[i] >= 100) {
                break;
            }
        }
    }
}