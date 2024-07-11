import java.util.Scanner;
import java.util.Locale;

public class Calc5 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
        int cp1, np1, cp2, np2;
        double vup1, vup2, value;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter code, numbers and unitary value from p1: ");
        cp1 = sc.nextInt();
        np1 = sc.nextInt();
        vup1 = sc.nextDouble();
        System.out.println("Enter code, numbers and unitary value from p2: ");
        cp2 = sc.nextInt();
        np2 = sc.nextInt();
        vup2 = sc.nextDouble();

        value = (np1 * vup1) + (np2 * vup2);

        System.out.printf("Value to be payed: %.2f\n", value);

    }
}
