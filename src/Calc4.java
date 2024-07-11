import java.util.Scanner;
import java.util.Locale;

public class Calc4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int fNumber, hours, number;
        double value, salary;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the functionary number: ");
        fNumber = sc.nextInt();
        System.out.println("Enter the time worked: ");
        hours = sc.nextInt();
        System.out.println("Enter the value received for hours: ");
        value = sc.nextDouble();

        salary = hours * value;

        System.out.println("NUMBER = " + fNumber);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}
