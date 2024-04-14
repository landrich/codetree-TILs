import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max1Index = 0;

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();
            if (numArr[i] > max1) max1 = numArr[i];
        }

        for (int i = 0; i < n; i++) {
            if (numArr[i] == max1) {
                max1Index = i;
                break;
            }
        }

        for (int i = 0; i < n; i++) {
            if (i == max1Index) continue;
            if (numArr[i] > max2) max2 = numArr[i];
        }

        System.out.println(max1 + " " + max2);
    }
}