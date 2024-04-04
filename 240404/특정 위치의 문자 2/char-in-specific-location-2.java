import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] charArr = new char[10];

        for (int i = 0; i < 10; i++) {
            charArr[i] = sc.next().charAt(0);
        }

        System.out.print(charArr[1] + " " + charArr[4] + " " + charArr[7]);
    }
}