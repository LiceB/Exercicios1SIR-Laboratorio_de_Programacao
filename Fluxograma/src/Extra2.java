import java.util.Scanner;

public class Extra2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String nome;

		double peso, altura, imc;

		System.out.print("Informe seu nome: ");

		nome = teclado.nextLine(); //usando apenas para String
		System.out.println(nome);

		teclado.close();


	}

}
