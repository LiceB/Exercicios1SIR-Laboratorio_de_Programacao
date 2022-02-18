import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int valor, resultado, contador;
		String resposta;

		do {
			System.out.print("Valor --> ");
			valor = teclado.nextInt();
			
			contador = 0;
			
			while(contador <= 10) {
				resultado = valor * contador;
				System.out.println(valor + " * " + contador + " = " + resultado);
				contador = contador + 1;
			}
			System.out.print("Deseja imprimir outra tamuada (s/n)? ");
			resposta = teclado.next();
		} while(resposta.equalsIgnoreCase("s"));


	}

}
