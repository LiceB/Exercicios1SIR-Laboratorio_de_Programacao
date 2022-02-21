import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int valor;

		System.out.print("Informe um valor inte�ro --> ");
		valor = teclado.nextInt();

		// par ou �mpar usando if-else
		if (valor % 2 == 0) {
			System.out.println("� par");
		} else {
			System.out.println("� �mpar");
		}
		
		// par ou �mpar usando switch-case
		switch (valor % 2) {
			case 0:
				System.out.println("� par");
				break;
			case 1:
				System.out.println("� �mpar");
				break;
		}
		
		// par ou �mpar usando o operador tern�rio
		System.out.println((valor % 2 == 0) ? "� par" : "� impar");

	}

}
