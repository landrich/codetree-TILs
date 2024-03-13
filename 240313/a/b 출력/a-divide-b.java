import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = a;

        System.out.print(a > b ? (b / a) + "." : "0.");

        for (int i = 1; i <= 20; i++) {
            System.out.print((n * 10) / b);
            n = (n * 10) % b;
        }
    }
}