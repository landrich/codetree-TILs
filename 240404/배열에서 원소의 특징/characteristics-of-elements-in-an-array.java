import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];

        for (int i = 0; i < 10; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numArr[i] % 3 == 0) {
                System.out.println(numArr[i - 1]);
                break;
            }
        }
    }
}