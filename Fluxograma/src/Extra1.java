import java.util.Scanner;

public class Extra1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor, Valor�nvertido;
		int unidade, dezena, centena;

		System.out.print("Informe um valor com 3 d�gitos (100 - 999) --> ");
		valor = teclado.nextInt();

		centena = valor / 100;

		dezena = (valor / 10) % 10;

		unidade = valor % 10;

		Valor�nvertido = (unidade * 100) + (dezena * 10) + centena;
		System.out.println(valor + " invertido � " + Valor�nvertido);

	}

}
