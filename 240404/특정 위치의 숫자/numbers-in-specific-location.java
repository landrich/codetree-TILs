import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];

        for (int i = 0; i < 10; i++) {
            numArr[i] = sc.nextInt();
        }

        System.out.println(numArr[2] + numArr[4] + numArr[9]);
    }
}