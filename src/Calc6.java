import java.util.Locale;
import java.util.Scanner;

public class Calc6 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double A, B , C, triangle, circle, trapezoid, square, rectangle;
        double PI = 3.14159;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Number: ");
        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();
        triangle = A * C / 2.0;
        circle = PI * C * C;
        trapezoid = (A + B) * C / 2.0;
        square = B * B;
        rectangle = A * B;

        System.out.printf("The Triangle is: %.3f\n", triangle);
        System.out.printf("The Circle is: %.3f\n", circle);
        System.out.printf("The Trapezoid is: %.3f\n", trapezoid);
        System.out.printf("The Square is: %.3f\n", square);
        System.out.printf("The Rectangle is: %.3f\n", rectangle);
        System.out.print("You find u results");

    }
}
