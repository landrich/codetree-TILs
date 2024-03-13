import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a;

        System.out.print(a > b ? (a / b) + "." + ((a % b) * 10) / b : "0." + (a * 10) / b);
        a = (a * 10) % b;

        for (int i = 1; i < 20; i++) {
            System.out.print((a * 10) / b);
            a = (a * 10) % b;
        }
    }
}