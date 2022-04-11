import java.util.Scanner;

public class SomaControlada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0,
			num,
			rep;
		
		System.out.print("Digite a quantidade de números a somar: ");
		rep = sc.nextInt();
		
		for(int i = 1; i <= rep; i++) {
			System.out.printf("%d° numero: ", i);
			num = sc.nextInt();
			sum = sum + num;
			if(i != rep) {
				System.out.printf("soma: %d\n\n", sum);
			}
			else {
				System.out.printf("-SOMA FINAL: %d\n\n", sum);
			}
		}
		
		sc.close();
	}

}
