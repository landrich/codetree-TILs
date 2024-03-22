import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((n - i) * 2) - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < (n - i - 2) * 2; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i + 2) * 2 - 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}