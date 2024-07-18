import java.util.Scanner;

public class Main {
    public static String findNumber(int n) {
        int sum = n / 10 + n % 10; 
        if (n % 2 == 0 && sum % 5 == 0) {
            return "Yes";
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findNumber(num));
    }
}