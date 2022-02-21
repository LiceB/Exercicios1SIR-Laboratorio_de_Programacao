import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int n;
		int i, j, qtdImpressao, maiorImpressao = 0;

		System.out.print("Informe o ínicio do intervalo ");
		i = teclado.nextInt();
		System.out.print("Informe o fim do intervalo ");
		j = teclado.nextInt();

		while (i <= j) {
			
			n = i;
			qtdImpressao = 0;

			while (true) {
				qtdImpressao++;
				if (n == 1) {
					break;
				}
				if (n % 2 != 0) {
					n = 3 * n + 1;
				} else {
					n = n / 2;
				}
			}
			i++;
			if(qtdImpressao > maiorImpressao) {
				maiorImpressao = qtdImpressao;
			}

		}
		System.out.println("Valor máximo de impressões = " + maiorImpressao);

	}

}
