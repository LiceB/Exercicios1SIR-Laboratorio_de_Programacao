import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String letra;

		System.out.print("Inforne uma letra --> ");
		letra = teclado.next();

		letra = letra.toLowerCase(); // letra.touppercase();

		switch (letra) {
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				System.out.println(letra + " é uma vogal");
				break;
			default:
				System.out.println(letra + " não é uma vogal");
		}

	}

}
