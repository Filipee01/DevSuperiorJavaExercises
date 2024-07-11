import java.util.Scanner;
import java.util.Locale;

public class Calc2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double ray, result;
        double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("write ray value : ");
        ray = sc.nextDouble();

        result = PI * (ray * ray);

        System.out.printf("The result was: A = %.4f ", result);
    }
}
