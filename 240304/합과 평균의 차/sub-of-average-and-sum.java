import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = a + b + c;
        int avr = sum / 3;

        System.out.println(sum);
        System.out.println(avr);
        System.out.println(sum - avr);
    }
}