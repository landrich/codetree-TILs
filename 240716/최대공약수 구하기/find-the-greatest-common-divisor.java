import java.util.Scanner;

public class Main {
    public static void gcd(int n, int m) {
        int result = 0;
        int min = n > m ? m : n;

        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0)
                result = i;
        }
        
        System.out.println(result);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        gcd(n, m);
    }
}