import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double altura, raio, area;
		double qtdLatas, custoTotal;
		
		System.out.print("Informe a altura do tanque --> ");
		altura = teclado.nextDouble();
		System.out.print("Informe o raio do tanque --> ");
		raio = teclado.nextDouble();
		
		area = 2 * Math.PI * raio * (raio + altura);
		qtdLatas = area / 15;
		custoTotal = qtdLatas * 190.00;

		System.out.println("Quantidade de lata --> "+qtdLatas);
		System.out.println("Custo total --> R$ "+custoTotal);

	}

}
