import java.util.Scanner;

public class Exercicio2b {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double x, y;

		System.out.print("Valor de x --> ");

		x = teclado.nextDouble();

		y = Math.pow(x, 1.0 / 3) + Math.pow(x + 2, 3.0 / 5);
		System.out.println("y = "+y);

	}

}
