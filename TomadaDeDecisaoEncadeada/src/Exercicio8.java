import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		String cargo;
		double salarioAtual, novoSalario = 0, diferenca;
		int tempodeservico;

		System.out.print("cargo --> ");
		cargo = t.nextLine();
		System.out.print("Sal�rio atual --> R$");
		salarioAtual = t.nextDouble();
		System.out.print("tempo de servi�o --> ");
		tempodeservico = t.nextInt();

		if (cargo.equalsIgnoreCase("gerente")) {
			if (tempodeservico >= 5) {
				novoSalario = salarioAtual * 1.10;
			} else {
				if (tempodeservico >= 3) {
					novoSalario = salarioAtual * 1.09;
				} else {
					novoSalario = salarioAtual * 1.08;
				}
			}
		} else {
			if (cargo.equalsIgnoreCase("engenheiro")) {
				if (tempodeservico >= 5) {
					novoSalario = salarioAtual * 1.11;
				} else {
					if (tempodeservico >= 3) {
						novoSalario = salarioAtual * 1.10;
					} else {
						novoSalario = salarioAtual * 1.09;
					}
				}
			} else {
				if(cargo.equalsIgnoreCase("t�cnico")) {
					if (tempodeservico >= 5) {
						novoSalario = salarioAtual * 1.12;
					} else {
						if (tempodeservico >= 3) {
							novoSalario = salarioAtual * 1.11;
						} else {
							novoSalario = salarioAtual * 1.10;
						}
					}
				} else {
					novoSalario = salarioAtual * 1.05;
				}
			}
		}
		
		diferenca = novoSalario - salarioAtual;
		System.out.println("Sal�rio atual --> R$ " + String.format("%.2f", salarioAtual));
		System.out.println("Novo sal�rio --> R$ " + String.format("%.2f", novoSalario));
		System.out.println("Diferen�a --> R$ " + String.format("%.2f", diferenca));
		
	}
	
}
