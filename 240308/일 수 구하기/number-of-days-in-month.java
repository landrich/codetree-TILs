import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();

        if (m == 4 || m == 6 || m == 9 || m == 11) {
            System.out.println(30);
        } else if (m == 2) {
            System.out.println(28);
        } else {
            System.out.println(31);
        }
    }
}