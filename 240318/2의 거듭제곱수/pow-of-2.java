import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int power = 0, sum = 1;

        while (true) {
            if (n == sum) {
                System.out.println(power);
                break;
            }
            sum *= 2;
            power++;
        }
    }
}