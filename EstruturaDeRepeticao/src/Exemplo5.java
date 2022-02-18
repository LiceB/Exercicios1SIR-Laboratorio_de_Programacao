import java.util.Scanner;

public class Exemplo5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int limite;
		int cont = 1;

		System.out.print("Limite --> ");
		limite = teclado.nextInt();

		for( ; cont <= limite; ) {
		System.out.print(cont + " ");
		cont++;

		}

	}

}
