import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                System.out.print((char)(c + 32));
            } else if (c >= 'a' && c <= 'z') {
                System.out.print((char)(c - 32));
            }
        }
    }
}