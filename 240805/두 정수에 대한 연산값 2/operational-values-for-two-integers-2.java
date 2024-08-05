import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {
    public static void calc(IntWrapper n, IntWrapper m) {
        if (n.value > m.value) {
            n.value *= 2;
            m.value += 10;
        } else {
            n.value += 10;
            m.value *= 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper n = new IntWrapper(a);
        IntWrapper m = new IntWrapper(b);

        calc(n, m);

        a = n.value;
        b = m.value ;

        System.out.println(a + " " + b);
    }
}