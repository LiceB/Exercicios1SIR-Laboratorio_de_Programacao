import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int contador = 1;
		int maior = Integer.MIN_VALUE;
		int valor;

		while (contador <= 5) {
			System.out.print("Valor --> ");
			valor = teclado.nextInt();
			if (valor > maior) {
				maior = valor;
			}
			contador = contador + 1;
		}
		System.out.println("maior = " + maior);

	}

}
