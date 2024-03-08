import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gender = sc.nextInt();
        int age = sc.nextInt();

        if (gender == 0) {
            System.out.println(age >= 19 ? "MAN" : "BOY");
        } else {
            System.out.println(age >= 19 ? "WOMAN" : "GIRL");
        }
    }
}