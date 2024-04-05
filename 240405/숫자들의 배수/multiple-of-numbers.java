import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[10];
        int cnt = 0;

        for (int i = 0; i <= 9; i++) {
            numArr[i] = n * (i + 1);
            if (numArr[i] % 5 == 0) {
                cnt++;
                System.out.print(numArr[i] + " ");
                if (cnt == 2) {
                    break;
                }
            } else {
                System.out.print(numArr[i] + " ");
            }
        }
    }
}