import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int k = sc.nextInt();
            if (k % 2 == 1 && k % 3 == 0) {
                System.out.println(k);
            }
        }
    }
}