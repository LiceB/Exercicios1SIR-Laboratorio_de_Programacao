import java.util.Scanner;

public class Exercicio15_v2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		int total = 0;

		do {
			System.out.print("Informe um valor inteiro e positivo --> ");
			valor = teclado.nextInt();
			if (valor <= 0) {
				System.out.println("O valor deve ser maior que zero");
			}
		} while(valor <= 0);
		
		for (int i = 2; i < valor; i++) {
			if (valor % i == 0) {
				total++;
				break; // interrompe a estrutura de repetição --> para a estrutura
			}
		}
		if (total == 0) {
			System.out.println(valor + " é um número primo");
		} else {
			System.out.println(valor + " não É um número primo");
		}
		
		
		
		
		

	}

}
