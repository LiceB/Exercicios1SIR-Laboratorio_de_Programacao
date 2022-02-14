import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double a, b, c, delta, x1, x2;

		System.out.print("a --> ");
		a = teclado.nextDouble();

		if (a == 0) {
			System.out.println("Não é uma equação do 20 grau");
		} else {
			System.out.print("b --> ");
			b = teclado.nextDouble();
			System.out.print("c --> ");
			c = teclado.nextDouble();
			delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("A equação não tem raiz real");
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("x1 = " + String.format("%.2f", x1));
				System.out.println("x2 = " + String.format("%.2f", x2));
			}
		}
	}
}