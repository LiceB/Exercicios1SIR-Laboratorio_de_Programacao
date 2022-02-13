import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double c, m, i;
		int n;

		System.out.print("Informe o capital investido --> R$ ");
		c = teclado.nextDouble();

		System.out.print("Informe a taxa de juros (0% a 100%) --> ");
		i = teclado.nextDouble();

		System.out.print("Informe a quantidade de meses --> ");
		n = teclado.nextInt();

		m = c * Math.pow(1 + i /100,n);
		System.out.println("montante --> R$ "+String.format("%.2f", m));

		teclado.close();


	}

}
