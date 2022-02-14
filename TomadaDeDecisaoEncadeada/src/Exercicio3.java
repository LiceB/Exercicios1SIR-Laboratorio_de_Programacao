import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int diaria;
		double conta;
		
		System.out .print("Informe o total de diárias --> ");
		diaria = teclado.nextInt();
		
		if(diaria > 15) {
			conta = 250*diaria + 15.5*diaria;
		} else {
			if(diaria == 15) {
				conta = 250*diaria + 36*diaria;
			} else {
				conta = 250*diaria + 58*diaria;
			}
		}
		
		System.out.println("Valor total R$ " + String.format("%.2f", conta));
	}
}
