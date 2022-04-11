import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number;
		double sum = 0;
		
		do {
			System.out.print("Digite um número maior que zero: ");
			number = sc.nextInt();
		}
		while(number <= 0);
		
		for(int i = 1; i <= number; i++) {
			System.out.printf("\n1/%d = %.4f", i, (1.0000/i));
			sum += 1.0000/i;
		}
		
		System.out.printf("\nSOMA = %.4f", sum);
		
		sc.close();
	}
}
