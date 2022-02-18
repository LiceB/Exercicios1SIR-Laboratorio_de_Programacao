import java.util.Scanner;

public class Exercicio18 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		double y = 0;

		System.out.print("n (inteiro e maior que zero) --> ");
		n = teclado.nextInt();
		if (n <= 0) {
			System.out.println("n deve ser inteiro e maior que zero");
		} else {
			for (int k = 1; k <= n; k++) {
				y = y + Math.pow(-1, k-1) * 1.0 / k;
			}

			System.out.println("y = " + y);
		}

	}

}
