import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2, contador;

		System.out.print("Primeiro valor --> ");
		valor1 = teclado.nextInt();
		System.out.print("Segundo valor --> ");
		valor2 = teclado.nextInt();

		if (valor2 > valor1) {
			contador = valor1;
			while (contador <= valor2) {
				System.out.print(contador + " ");
				contador = contador + 1;
			}
		} else {
			System.out.println("o segundo valor deve ser maior que o primeiro");
		}

	}

}
