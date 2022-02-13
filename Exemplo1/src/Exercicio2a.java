import java.util.Scanner;

public class Exercicio2a {

	public static void main(String[] args) {
		// declaração de variáveis

		Scanner teclado = new Scanner(System.in);
		double a, b, c, x;

		// entrada de dados
		System.out.print("Valor de a --> ");

		a = teclado.nextDouble();
		System.out.print("Valor de b --> ");

		b = teclado.nextDouble();
		System.out.print("Valor de c --> ");

		c = teclado.nextDouble();

		// processamento
		x=(- b - b * b * b - 4 * a * c + 2 * a * a) / (2 * a / (b + 1) * (b + 1));
		// saídade de dados
		System.out.println("x = "+x);


	}

}
