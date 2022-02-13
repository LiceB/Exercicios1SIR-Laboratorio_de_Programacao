import java.util.Scanner;

public class Exercicio2c {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double a, b, c, x;

		System.out.print("Valor de a --> ");
		a = teclado.nextDouble();

		System.out.print("Valor de b --> ");
		b = teclado.nextDouble();

		System.out.print("Valor de c --> ");
		c = teclado.nextDouble();

		x = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
		System.out.println("x = " + x);


	}

}
