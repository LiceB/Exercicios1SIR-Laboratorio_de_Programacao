import java.util.Scanner;

public class Extra1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor, Valorínvertido;
		int unidade, dezena, centena;

		System.out.print("Informe um valor com 3 dígitos (100 - 999) --> ");
		valor = teclado.nextInt();

		centena = valor / 100;

		dezena = (valor / 10) % 10;

		unidade = valor % 10;

		Valorínvertido = (unidade * 100) + (dezena * 10) + centena;
		System.out.println(valor + " invertido é " + Valorínvertido);

	}

}
