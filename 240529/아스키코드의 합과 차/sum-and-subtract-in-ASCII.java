import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch1 = sc.next().charAt(0);
        char ch2 = sc.next().charAt(0);

        System.out.print((int)ch1 + (int)ch2 + " ");

        if ((int)ch1 > (int)ch2)
            System.out.print((int)ch1 - (int)ch2);
        else
            System.out.print((int)ch2 - (int)ch1); 
    }
}