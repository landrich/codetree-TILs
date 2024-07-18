import java.util.Scanner;

public class Main {
    public static int min(int a, int b, int c) {
        int min1 = Math.min(a, b);
        int min2 = Math.min(min1, c);
        return min2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(min(a, b, c));
    }
}