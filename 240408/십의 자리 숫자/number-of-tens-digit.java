import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numArr = new int[100];
        int[] list = new int[10];
        int n; 

        for (int i = 0; i < 100; i++) {
            n = sc.nextInt();
            if (n == 0) break;
            numArr[i] = n;
            list[numArr[i] / 10]++;
        }

        for (int i = 1; i < 10; i++) {
            System.out.println(i + " - " + list[i]);
        }
    }
}