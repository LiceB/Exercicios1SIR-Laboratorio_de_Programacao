import java.util.Scanner;

public class Exemplo2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		int resultado;
		double quociente;
		
		System.out.print("Informe o 10 valor --> ");
		valor1 = teclado.nextInt(); // busca o valor inteiro digitado no teclado
		System.out.print("Informe o 20 valor --> ");
		valor2 = teclado.nextInt();
		
		resultado = valor1 + valor2;		
		System.out .println("A soma é: "+resultado);
		
		resultado = valor1 - valor2;
		System.out .println("A diferença é: "+resultado);
		
		resultado = valor1 * valor2;
		System.out .println("A multiplicação é: "+resultado);
		
		quociente = (double)valor1 / valor2;
		System.out.println("A divisão é: "+quociente);
		
		resultado = valor1 % valor2;
		System.out.println("O resto da divisão é: "+resultado);

	}

}
