import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int check = -1;

        while(true) {
            check = str1.indexOf(str2);
            if (check > -1) {
                str1 = str1.substring(0, check) + str1.substring(check + str2.length());
            } else {
                break;
            }
        }

        System.out.println(str1);
    }
}