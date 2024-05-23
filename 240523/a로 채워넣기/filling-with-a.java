import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] strToArr = str.toCharArray();

        strToArr[1] = 'a';
        strToArr[str.length() - 2] = 'a';

        System.out.println(String.valueOf(strToArr));
    }
}