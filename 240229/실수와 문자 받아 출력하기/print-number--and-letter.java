import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.printf("%c\n%.2f\n%.2f", a, b, c);
    }
}