import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int	num = 1;
		char op;
		
		System.out.print("Digite um número: ");
		num = sc.nextInt();
		System.out.print("Digite uma operação: ");
		op = sc.next().charAt(0);
		
		switch(op) {
			case '*':
				for(int i = 0; i <= 10; i++) {
					System.out.printf("%d X %d = %d\n", num, i, (num*i));
				}
				break;
		}
		
		sc.close();


	}

}
