import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int sum = 0, cnt = 0;

        for (int i = 0; i < 10; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numArr[i] == 0) {
                break;
            }
            if (numArr[i] % 2 == 0) {
                sum += numArr[i];
                cnt++;
            }
        }

        System.out.print(cnt + " " + sum);
    }
}