import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, cnt = n, k;

        for (int i = 0; i < n; i++) {
            k = sc.nextInt();
            sum += k;
        }

        System.out.printf("%d %.1f", sum, (double) sum / cnt);
    }
}