import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		int total = 0;

		System.out.print("Informe um valor inteiro e positivo --> ");
		valor = teclado.nextInt();
		if (valor <= 0) {
			System.out.println("O valor deve ser maior que zero");
		} else {
			for (int i = 2; i < valor; i++) {
				if (valor % i == 0) {
					total++;
					break; // interrompe a estrutura de repeti��o --> para a estrutura
				}
			}
			if (total == 0) {
				System.out.println(valor + " � um n�mero primo");
			} else {
				System.out.println(valor + " n�o � um n�mero primo");
			}
		}

	}

}
