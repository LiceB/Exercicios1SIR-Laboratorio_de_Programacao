import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String letra;

		System.out.print("Inforne uma letra --> ");
		letra = teclado.next();

		letra = letra.toLowerCase(); // letra.touppercase();

		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o")
				|| letra.equalsIgnoreCase("u")) {
			System.out.println(letra + " é uma vogal");
		} else {
			System.out.println(letra + " não é uma vogal");

		}

	}

}
