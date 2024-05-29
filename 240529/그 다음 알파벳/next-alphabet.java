import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int n;

        if (c == 'z')
            n = (int)c - 25;
        else
            n = (int)c + 1;

        System.out.println((char)n);
    }
}