import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double valorTotal, valorTotalComDesconto, desconto;
		
		System.out .print("Informe o valor total da compra --> R$ ");
		valorTotal = teclado.nextDouble();
		
		if(valorTotal > 1000) {
		desconto = valorTotal * 15 / 100;
		} else {
		desconto = valorTotal * 8 / 100;
		}
		
		valorTotalComDesconto = valorTotal - desconto;
		System.out.println("Valor total a pagar --> R$ " + String.format("%.2f", valorTotalComDesconto));
		System.out.println("Você economizou --> R$ " + String.format("%.2f", desconto));


	}

}
