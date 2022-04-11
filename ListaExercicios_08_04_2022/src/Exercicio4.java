import java.util.Scanner;
public class Exercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int habitante = 1, rendaBaixa = 0, filhos = 0, filhosTotal = 0;
		double salario = 1, salarioTotal = 0, maiorSalario = 1;
	
		System.out.printf("!Digitar um valor negativo para parar!\n\n");
		
		do {			
			System.out.printf("%d° HABITANTE", habitante);
			System.out.print("\nSalario (Separar centavos com ','): ");
			salario = sc.nextDouble();
			
			if(salario > 0) {				
				
				if(salario > maiorSalario) {
					maiorSalario = salario;
				}
				
				if(salario < 100) {
					rendaBaixa++;
				}
				
				do {
					System.out.print("Número de filhos: ");
					filhos = sc.nextInt();
				}
				while(filhos < 0);
								
				salarioTotal += salario;
				filhosTotal += filhos;
				habitante++;
			}
			
			else {
				habitante--;
			}
		}
		while(salario > 0);
		
		System.out.printf("\n\n********\nMedia do salario da população: R$%.2f", (salarioTotal/habitante));
		System.out.printf("\nMedia de filhos da população: %d", (filhosTotal/habitante));
		System.out.printf("\nMaior Salário: %.2f", maiorSalario);
		System.out.printf("\nPorcentagem da população com baixa renda: %d%%", rendaBaixa*100/habitante);
		
		sc.close();

	}

}
