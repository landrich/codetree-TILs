import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, l;
        char c;

        while (true) {
            w = sc.nextInt();
            l = sc.nextInt();
            c = sc.next().charAt(0);

            System.out.println(w * l);

            if (c == 'C') break;
        }
    }
}