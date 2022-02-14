import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int valor1, valor2, valor3;

		System.out.print("Informe o lo valor --> ");
		valor1 = teclado.nextInt();
		System.out.print("Informe o 2o valor --> ");
		valor2 = teclado.nextInt();
		System.out.print("Informe o 3o valor --> ");
		valor3 = teclado.nextInt();

		if (valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
			if (valor1 < valor2 && valor1 < valor3) {
				System.out.println(valor1 + " é o menor");
			} else {
				if (valor2 < valor3) {
					System.out.println(valor2 + " é o menor");
				} else {
					System.out.println(valor3 + " é o menor");
				}
			}
		} else {
			System.out.println("Os valores devem ser diferentes");
		}

	}

}
