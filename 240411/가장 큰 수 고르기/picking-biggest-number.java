import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numArr[i] > maxNum) maxNum = numArr[i];
        }

        System.out.println(maxNum);
    }
}