import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador, n;
		double y;

		System.out.print("Informe o valor de n (maior que zero) --> ");
		n = teclado.nextInt();

		if (n <= 0) {
			System.out.println("O valor de n deve ser maior que zero");
		} else {
			contador = 1;
			y = 0;
			while (contador <= n) {
				y = y + (double) contador / Math.sqrt(contador);
				contador++;
				System.out.println("y = " + 5);
			}
		}

	}

}
