import java.util.Scanner;

public class Exercicio4 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome, genero;
		double altura, pesoIdeal;

		System.out .print("Informe seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Informe sua altura em metros: ");
		altura = teclado.nextDouble();
		System.out .print("Informe o gênero (feminino ou masculino): ");
		genero = teclado.next();

		if(genero.equalsIgnoreCase("feminino")) {
		pesoIdeal = 62.1 * altura - 44.7;

		} else {
			pesoIdeal = 72.7 * altura - 58;
		}
		
		System.out.println(nome + " seu peso ideal é: " + pesoIdeal);
	}
}
