import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a - b;

        if (a < b) {
            result = b - a;    
        }

        System.out.println(result);
    }
}