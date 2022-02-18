import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor;
		int contador;
		int fat;

		System.out.print("valor inteiro e positivo --> ");
		valor = teclado.nextInt();
		if (valor < 0) {
			System.out.println("Não existe fatorial de número negativo");
		} else {
			contador = valor;
			fat = 1;
			while (contador >= 1) {
				fat = fat * contador;
				contador--; // contador = contador - 1;
			}
			System.out.println(fat);

		}

	}

}
