import java.util.Scanner;

public class Exemplo3 {

	public static void main(String[] args) {
		
		// declara��o das var�aveis --> reservar espa�o em mem�rias
		Scanner teclado = new Scanner(System.in);
		double valor1, valor2, valor3, media;
		
		System.out.print("Informe o 1� valor --> ");
		valor1 = teclado.nextDouble();
		System.out.print("Informe o 2� valor --> ");
		valor2 = teclado.nextDouble();
		System.out.print("Informe o 3� valor --> ");
		valor3 = teclado.nextDouble();

		media = (valor1 + valor2 + valor3) / 3;
		System.out.println("m�dia = "+media);


	}

}
