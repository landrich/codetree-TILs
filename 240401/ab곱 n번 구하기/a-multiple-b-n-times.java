import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, prod = 1;

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            for (int j = a; j <= b; j++) {
                prod *= j;
            }
            System.out.println(prod);
            prod = 1;
        }
    }
}