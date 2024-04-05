import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[100];
        int num;

        for (int i = 0; i < 100; i++) {
            num = sc.nextInt();
            if (num == 0) {
                break;
            }
            numArr[i] = num;
        }

        for (int i = 0; i < 100; i++) {
            if (numArr[i] == 0)
                break;
            if (numArr[i] % 2 == 0)
                System.out.print((numArr[i] / 2) + " ");
            else
                System.out.print((numArr[i] + 3) + " ");
        }
    }
}