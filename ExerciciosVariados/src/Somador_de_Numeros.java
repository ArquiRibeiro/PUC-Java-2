//Tomei a liberdade de usar o "Scanner" para praticar.

import java.util.Scanner;

public class Somador_de_Numeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número:\n-");
		int num_1 = sc.nextInt();
		
		System.out.print("Digite o segundo número:\n-");
		int num_2 = sc.nextInt();
		
		System.out.print("Digite o terceiro número:\n-");
		int num_3 = sc.nextInt();
		
		System.out.printf("A soma dos números %d, %d e %d é: %d!", num_1, num_2, num_3, (num_1 + num_2 + num_3));
		sc.close();
	}

}