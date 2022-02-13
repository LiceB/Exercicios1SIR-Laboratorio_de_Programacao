import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double prova1, prova2;
		double trabalho, trabalho2, trabalho3;
		double media;

		System.out.print("Informe a nota da la prova --> ");
		prova1 = teclado.nextDouble();
		System.out.print("Informe a nota da 2a prova --> ");
		prova2 = teclado.nextDouble();
		System.out.print("Informe a nota do lo trabalho --> ");
		trabalho = teclado.nextDouble();
		System.out.print("Informe a nota do 20 trabalho --> ");
		trabalho2 = teclado.nextDouble();
		System.out.print("Informe a nota do 3o trabalho --> ");
		trabalho3 = teclado.nextDouble();

		media = (prova1 + prova2) / 2 * 0.7 + (trabalho + trabalho2 + trabalho3) / 3 * 0.3;
		
		System.out.println("Média final = " + String.format("%.2f", media));
		
		if (media >= 6) {
			System.out.println("APROVADO");
		} else {
			System.out.println( "REPROVADO" );			
		}
	}
}
