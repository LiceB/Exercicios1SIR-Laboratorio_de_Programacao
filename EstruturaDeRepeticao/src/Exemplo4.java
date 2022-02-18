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
				System.out.println("PARABÉN! Você adivinhou o número secreto");
				System.out.println("Total de tentativas --> " + tentativa);
				achou = true;
			} else if (palpite < secreto) {
				System.out.println("O valor secreto está acima do palpite");
			} else {
				System.out.println("O valor secreto está abaixo do palpitel");
			}
			tentativa++;
		}
	}

}
