import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
    int x, y, soma;
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro valor: ");
    x = sc.nextInt();
    System.out.println("Digite o segundo valor: ");
    y = sc.nextInt();

    soma = x + y;

    System.out.println("Soma = " + soma);
    }
}
