import java.util.Scanner;
public class Exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int aptos = 75,
			aptos80 =  aptos*80/100,
			aptos50 = aptos*50/100;
		
		double diaria, diariaComDesconto;
		
		System.out.print("Digite o valor da di�ria: ");
		diaria = sc.nextDouble();
		diariaComDesconto = diaria-(diaria*25/100);
		
		System.out.printf("valor da di�ria promocional: R$%.2f", diariaComDesconto);
		System.out.printf("\nArrecadado com promo��o e 80%% de ocupa��o: R$%.2f", diariaComDesconto*aptos80);
		System.out.printf("\nArrecadado normalmente com 50%% de ocupa��o: R$%.2f", diaria*aptos50);
		System.out.printf("\nDiferen�a: R$%.2f", (diariaComDesconto*aptos80)-(diaria*aptos50));
		sc.close();
	}

}
