import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1, num2, sum;
		
		System.out.print("Digite o 1° numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Digite o 2° numero: ");
		num2 = sc.nextInt();
		
		sum = num1 + num2;
		
		if(sum >= 10) {
			sum += 5;
		}
		
		else {
			sum += 7;
		}
		
		System.out.printf("Soma: %d", sum);
		
		sc.close();
	}

}
