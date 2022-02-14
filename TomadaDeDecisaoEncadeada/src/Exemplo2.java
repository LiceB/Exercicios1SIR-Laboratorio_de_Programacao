import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String faculdade;

		System.out .print("Em qual faculdade você estuda? ");

		faculdade = teclado.nextLine();

		if(faculdade.equalsIgnoreCase("fiap")) {
		System.out.println("parabéns");

		} else {
		System.out.println("que pena");

		}

	}
}
