import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;

		System.out.print("Informe um valor --> ");
		valor = teclado.nextInt();

		for (int cont = -valor; cont <= valor; cont++) {
			if (cont != 0 && valor % cont == 0) {
				System.out.print(cont + " ");

			}

		}

	}

}
