import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[100];
        int index = 0;

        for (int i = 0; i < 100; i++) {
            numArr[i] = sc.nextInt();
            if (numArr[i] == 0) {
                index = i;
                break;
            }
        }

        System.out.println(numArr[index - 1] + numArr[index - 2] + numArr[index - 3]);
    }
}