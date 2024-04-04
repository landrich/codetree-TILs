import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[10];
        int sumOdd = 0, sumEven = 0;

        for (int i = 0; i < 10; i++) {
            numArr[i] = sc.nextInt();
            if (i % 2 == 0) sumEven += numArr[i];
            else sumOdd += numArr[i];
        }

        System.out.println(sumOdd > sumEven ? sumOdd - sumEven : sumEven - sumOdd);
    }
}