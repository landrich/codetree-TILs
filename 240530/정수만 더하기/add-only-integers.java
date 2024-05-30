import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c;
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                result += (int)c - 48;
            }    
        }

        System.out.println(result);
    }
}