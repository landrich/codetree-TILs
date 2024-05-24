import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) == str.charAt(1) ? str.charAt(0) : str.charAt(i);
        }

        System.out.println(result);
    }
}