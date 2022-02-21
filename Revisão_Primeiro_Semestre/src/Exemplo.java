import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int valor;

		System.out.print("Informe um valor inteíro --> ");
		valor = teclado.nextInt();

		// par ou ímpar usando if-else
		if (valor % 2 == 0) {
			System.out.println("É par");
		} else {
			System.out.println("É ímpar");
		}
		
		// par ou ímpar usando switch-case
		switch (valor % 2) {
			case 0:
				System.out.println("É par");
				break;
			case 1:
				System.out.println("É ímpar");
				break;
		}
		
		// par ou ímpar usando o operador ternário
		System.out.println((valor % 2 == 0) ? "É par" : "É impar");

	}

}
