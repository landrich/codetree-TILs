import java.util.Scanner;

public class Main {
    public static boolean prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) 
                return false;
        }
        return true;
    }

    public static int sum(int n, int m) {
        int sum = 0;
        
        for (int i = n; i <= m; i++) {
            if (prime(i))
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(sum(a, b));
    }
}