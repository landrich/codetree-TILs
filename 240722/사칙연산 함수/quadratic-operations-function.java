import java.util.Scanner;

public class Main {
    public static String calc(int a, char o, int c) {
        if (o == '+') {
            return String.valueOf(a + c);
        } else if (o == '-') {
            return String.valueOf(a - c);
        } else if (o == '*') {
            return String.valueOf(a * c);
        } else if (o == '/') {
            return String.valueOf(a / c);
        } else {
            return "False";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        System.out.println(a + " " + o + " " + c + " = " + calc(a, o, c));
    }
}