import java.util.Scanner;

public class PowerMethod {

    static int power(int base, int exp) {
        int result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int exp = sc.nextInt();

        System.out.println(power(base, exp));

        sc.close();
    }
}