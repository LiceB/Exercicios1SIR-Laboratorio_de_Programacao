import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int qtd;
		int x = 1;
		int y = 1;
		int z;
		int contador;
		
		System.out.print("Quantidade de termos --> ");
		qtd = teclado.nextInt();
		
		if (qtd == 1) {
			System.out.println(x);
		} else if (qtd == 2) {
			System.out.println(x + " " + y);
		} else {
			System.out.print(x + " " + y + " "); 
			contador = 3;
			while(contador <= qtd) {
				z = x + y;
				System.out.print(z + " ");
				x = y;
				y = z;
				contador++;
			}
		}

	}

}
