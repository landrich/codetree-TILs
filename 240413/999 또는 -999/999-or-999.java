import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[100];
        int num, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i = 0; i < 100; i++) {
            num = sc.nextInt();
            if (num == 999 || num == -999) {
                break;
            }
            numArr[i] = num;
        }

        for (int i = 0; i < 100; i++) {
            if (numArr[i] > max) {
                max = numArr[i];
            }
        }

        for (int i = 0; i < 100; i++) {
            if (numArr[i] < min) {
                min = numArr[i];
            }
        }

        System.out.println(max + " " + min);
    }
}