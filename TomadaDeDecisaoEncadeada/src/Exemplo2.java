import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String faculdade;

		System.out .print("Em qual faculdade voc� estuda? ");

		faculdade = teclado.nextLine();

		if(faculdade.equalsIgnoreCase("fiap")) {
		System.out.println("parab�ns");

		} else {
		System.out.println("que pena");

		}

	}
}
