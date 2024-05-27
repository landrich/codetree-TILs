import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num;
        
        while(str.length() > 1) {
            num = sc.nextInt();
            if (num == 0) {
                str = str.substring(1);
            } else if (num >= str.length()) {
                str = str.substring(0, str.length() - 1);
            } else {
                str = str.substring(0, num) + str.substring(num + 1);
            }
            System.out.println(str);
        }
    }
}