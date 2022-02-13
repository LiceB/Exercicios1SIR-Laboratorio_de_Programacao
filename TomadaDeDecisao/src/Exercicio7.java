import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, c;
		
		System.out.print("Informe o valor do 10 lado --> ");
		a = teclado.nextDouble();
		System.out.print("Informe o valor do 20 lado --> ");
		b = teclado.nextDouble();
		System.out.print("Informe o valor do 3o lado --> ");
		c = teclado.nextDouble();
		
		if(a < b + c && b < a + b && c < a + b) {
		System.out.println("Os valores formam um triângulo");
		} else {
		System.out.println("Os valores não formam um triângulo");
		}

	}

}
