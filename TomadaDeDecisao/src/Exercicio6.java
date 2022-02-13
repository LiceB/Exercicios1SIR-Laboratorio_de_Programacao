import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x, y;
		
		System.out.print(" x --> ");
		x = teclado.nextDouble();
		
		if(x > 5 || x < -5) {
			y = 8 / Math.sqrt(x * x - 25);
			System.out.println("y = " + String.format("%.5f", y));			
		} else {
		System.out.println("A expressão não pode ser calculada");
		}
	}
}
