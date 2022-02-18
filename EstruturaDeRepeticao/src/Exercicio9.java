import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2, resultado, contador;

		System.out.print("Valor 1 --> ");
		valor1 = teclado.nextInt();
		System.out.print("Valor 2 --> ");
		valor2 = teclado.nextInt();

		resultado = 0; 
		contador = 1;

		while(contador <= valor2) {
		resultado += valor1;
		contador++;

		}
		System.out .println(resultado);
	}

}
