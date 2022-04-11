//-25/03/2022
import java.util.Scanner;

public class Equacao_Primeiro_Grau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double 	a = 0,
				b;
		
		while(a != 0) {
			System.out.print("digite o valor de A:\n-");
			a = sc.nextDouble();
			
			if(a == 0) {
				System.out.print("Não digite 0!");
			}
		}
		
		System.out.print("digite o valor de B:\n-");
		b = sc.nextDouble();
		
		System.out.printf("O valor da raiz é: %.2f", -b/a);
		
		sc.close();
	}

}
