import java.util.Scanner;

public class Exemplo1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System. in);
		double nota1, nota2, media;

		System.out.print("Informe a 1a nota -->");
		nota1 = teclado.nextDouble();
		System.out.print("Informe a 2a nota --> ");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2) / 2;
		System.out.println("A sua média final é: " + media);

		if (media >= 6) {
			System.out.println("APROVADO");
		} else {
			System.out.println( "REPROVADO" );			
		}	

	}

}
