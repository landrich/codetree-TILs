import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int num1 = Integer.parseInt(str1 + str2);
        int num2 = Integer.parseInt(str2 + str1);

        System.out.println(num1 + num2);
    }
}