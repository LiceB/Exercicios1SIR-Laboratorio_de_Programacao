import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int n, x1, x2, x3, x4;
		
		System.out.print("Informe o valor de n --> ");
		n = teclado.nextInt();

		x1 = n / 100;

		x2 = n % 100 / 10;

		x3 = n % 10;

		x4 =x1 + x2 + x3;

		System.out.println("x4 = "+x4);


	}

}
