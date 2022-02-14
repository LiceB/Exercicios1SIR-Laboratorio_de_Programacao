import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2, valor3, aux;

		System.out.print("Valor 1 --> ");
		valor1 = teclado.nextInt();
		System.out.print("Valor 2 --> ");
		valor2 = teclado.nextInt();
		System.out.print("Valor 3 --> ");
		valor3 = teclado.nextInt();

		if (valor1 > valor2) {
			aux = valor1;
			valor1 = valor2;
			valor2 = aux;
		}
		
		if (valor1 > valor3) {
			aux = valor1;
			valor1 = valor3;
			valor3 = aux;
		}
		
		if (valor2 > valor3) {
			aux = valor2;
			valor2 = valor3;
			valor3 = aux;
		}
		
		System.out.println(valor1 + " " + valor2 + " " + valor3);

	}

}
