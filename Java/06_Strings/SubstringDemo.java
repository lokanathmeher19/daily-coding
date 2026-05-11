import java.util.Scanner;

public class SubstringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        System.out.println(str.substring(0, 4));

        sc.close();
    }
}