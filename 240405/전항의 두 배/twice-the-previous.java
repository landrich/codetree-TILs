import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        numArr[0] = sc.nextInt();
        numArr[1] = sc.nextInt();
        for (int i = 2; i < 10; i++) {
            numArr[i] = numArr[i - 2] * 2 + numArr[i - 1];
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(numArr[i] + " ");
        }
    }
}