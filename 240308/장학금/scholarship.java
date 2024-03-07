import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int middle = sc.nextInt();
        int finals = sc.nextInt();
        
        if (middle >= 90 && finals >= 95) {
            System.out.println(100000);
        } else if (middle >= 90 && finals >= 90) {
            System.out.println(50000);
        } else {
            System.out.println(0);
        }
    }
}