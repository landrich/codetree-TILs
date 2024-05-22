import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String letter = sc.next();

        System.out.println(str.indexOf(letter) == -1 ? "No" : str.indexOf(letter));
    }
}