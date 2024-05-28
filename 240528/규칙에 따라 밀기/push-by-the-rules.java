import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String query = sc.next();

        for (int i = 0; i < query.length(); i++) {
            if (query.charAt(i) == 'L') {
                str = str.substring(1) + str.substring(0, 1);
            } else {
                str = str.substring(str.length() - 1) + str.substring(0, str.length() - 1);
            }
        }

        System.out.println(str);
    }
}