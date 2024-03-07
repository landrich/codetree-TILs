import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aAge = sc.nextInt();
        char aGen = sc.next().charAt(0);
        int bAge = sc.nextInt();
        char bGen = sc.next().charAt(0);

        if ((aAge >= 19 && aGen == 'M') || (bAge >= 19 && bGen == 'M')) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}