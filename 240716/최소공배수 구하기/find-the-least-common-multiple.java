import java.util.Scanner;

public class Main {
    public static void lcm(int n, int m) {
        for (int i = Math.min(n, m); i <= n * m; i++) {
            if (i % n == 0 && i % m == 0) {
                System.out.println(i);
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        lcm(n , m);
    }
}