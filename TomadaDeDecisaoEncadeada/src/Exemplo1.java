import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		int idade;

		System.out.print("Qual sua idade? ");
		idade = teclado.nextInt();

		teclado. nextLine(); // retira e joga fora o enter que sobrou da entrada do número
		System.out.print("Qual seu nome? ");

		nome = teclado.nextLine();

	}
}
