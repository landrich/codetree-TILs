import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int num1, num2;
        String temp1 = "", temp2 = "";
        char c;

        for (int i = 0; i < str1.length(); i++) {
            c = str1.charAt(i);
            if (c > '0' && c < '9') {
                temp1 += c;
            } else {
                break;
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            c = str2.charAt(i);
            if (c > '0' && c < '9') {
                temp2 += c;
            } else {
                break;
            }
        }

        System.out.println(Integer.parseInt(temp1) + Integer.parseInt(temp2));
    }   
}