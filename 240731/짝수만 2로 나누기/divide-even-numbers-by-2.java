import java.util.Scanner;

public class Main {
    public static void devide(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 2 == 0) {
                numArr[i] /= 2;
            }
            System.out.print(numArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numArr = new int[n];

        for (int i = 0; i < n; i++) {
            numArr[i] = sc.nextInt();    
        }

        devide(numArr);
    }
}