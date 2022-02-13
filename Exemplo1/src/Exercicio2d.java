import java.util.Scanner;

public class Exercicio2d {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double x, y;
		
		System.out.print("Valor de x --> ");
		x = teclado.nextDouble();
		System.out.print("Valor de y --> ");
		y = teclado.nextDouble();
		
		y = Math.pow(x, 4.0 / 5.0) / (x - 3) + 2.0 / 3.0 * Math.pow(x, 5) / Math.sqrt(x + y);
		System.out.println("y = "+y);

	}

}
