import java.util.Scanner;

public class Exemplo4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int secreto = 135;
		int palpite;
		int tentativa = 1;
		boolean achou = false;

		while (achou == false) {
			System.out.println("Palpite --> ");
			palpite = teclado.nextInt();

			if (palpite == secreto) {
				System.out.println("PARAB�N! Voc� adivinhou o n�mero secreto");
				System.out.println("Total de tentativas --> " + tentativa);
				achou = true;
			} else if (palpite < secreto) {
				System.out.println("O valor secreto est� acima do palpite");
			} else {
				System.out.println("O valor secreto est� abaixo do palpitel");
			}
			tentativa++;
		}
	}

}
