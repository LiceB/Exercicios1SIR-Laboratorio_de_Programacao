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
		System.out .println("A soma �: "+resultado);
		
		resultado = valor1 - valor2;
		System.out .println("A diferen�a �: "+resultado);
		
		resultado = valor1 * valor2;
		System.out .println("A multiplica��o �: "+resultado);
		
		quociente = (double)valor1 / valor2;
		System.out.println("A divis�o �: "+quociente);
		
		resultado = valor1 % valor2;
		System.out.println("O resto da divis�o �: "+resultado);

	}

}
