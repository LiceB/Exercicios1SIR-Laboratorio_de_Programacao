import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcao;
		double valor1, valor2, resultado = 0;

		System.out.println("1. Somar\n2. Subtrair");
		System.out.println("3. Multiplicar");
		System.out.println("4. Dividir");
		opcao = teclado.nextInt();

		if (opcao < 1 || opcao > 4) {
			System.out.println("Opção inválida");
		} else {
			System.out.print("Informe o 1o valor: ");
			valor1 = teclado.nextDouble();
			System.out.print("Informe o 2o valor: ");
			valor2 = teclado.nextDouble();
			if (opcao == 4 && valor2 == 0) {
				System.out.println("Não existe divisão por zero");
			} else {
				switch(opcao) {
					case 1:
						resultado = valor1 + valor2;
						break;
					case 2:
						resultado = valor1 - valor2;
						break;
					case 3:
						resultado = valor1 * valor2;
						break;
					case 4:
						resultado = valor1 / valor2;
						break; // é opcional
				}
				System.out.println("resultado = " + resultado);

			}
		}

	}

}
