import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean flag = true;
        String result1 = str1 + str2;
        String result2 = str2 + str1;

        for (int i = 0; i < result1.length(); i++) {
            if (result1.charAt(i) == result2.charAt(i)) {
                continue;
            } else {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "true" : "false"); 
    }
}