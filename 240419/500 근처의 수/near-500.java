import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numArr[i] < 500) {
                if (numArr[i] > max)
                    max = numArr[i];
            } else {
                if (numArr[i] < min)
                    min = numArr[i];
            }
        }

        System.out.println(max + " " + min);
    }
}