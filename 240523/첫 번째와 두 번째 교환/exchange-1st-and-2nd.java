import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        char[] strToArr = str.toCharArray();

        for (int i = 0; i < strToArr.length; i++) {
            if (strToArr[i] == ch1)
                strToArr[i] = ch2;
            else if (strToArr[i] == ch2)
                strToArr[i] = ch1;
        }

        System.out.println(String.valueOf(strToArr));
    }
}