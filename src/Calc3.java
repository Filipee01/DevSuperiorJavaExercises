import java.util.Scanner;
import java.util.Locale;

public class Calc3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int A, B ,C ,D, DIFFERENCE;

        System.out.println("Write four numbers: ");
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        DIFFERENCE = (A * B - C * D);

        System.out.printf("The difference was = %d", DIFFERENCE);
    }
}
