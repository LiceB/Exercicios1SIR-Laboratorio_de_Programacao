import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		// declaração das varíaveis --> reservar espaço em memórias
		Scanner teclado = new Scanner(System.in);
		double valor1, valor2, valor3, media;
		
		System.out.print("Informe o 1º valor --> ");
		valor1 = teclado.nextDouble();
		System.out.print("Informe o 2º valor --> ");
		valor2 = teclado.nextDouble();
		System.out.print("Informe o 3º valor --> ");
		valor3 = teclado.nextDouble();

		media = (valor1 + valor2 + valor3) / 3;
		System.out.println("média = "+media);


	}

}
