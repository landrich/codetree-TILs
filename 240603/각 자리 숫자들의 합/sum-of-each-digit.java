import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = Integer.toString(n);
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            result += (int)str.charAt(i) - 48;
        }

        System.out.println(result);
    }
}