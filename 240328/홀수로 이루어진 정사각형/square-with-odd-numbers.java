import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 11; i <= 10 + (n * 2 - 1); i += 2) {
            for (int j = i; j <= i + (n * 2 - 2) ; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}