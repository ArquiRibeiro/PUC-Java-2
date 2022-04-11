import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		char op;
		
		System.out.print("Digite o primeiro n�mero:\n-");
		x = sc.nextDouble();
		
		System.out.print("Digite o segundo n�mero:\n-");
		y = sc.nextDouble();
		
		System.out.print("Digite a oprera��o:\n(+)Soma\n(-)Subtra��o\n(*)Multiplica��o\n(/)Divis�o\n(^)Elevar\n-");
		op = sc.next().charAt(0);
		
		switch(op) {
			case '+':
				System.out.printf("A soma de %.2f e %.2f �: %.2f", x, y, (x+y));
				break;
			case '-':
				System.out.printf("A subtra��o de %.2f e %.2f �: %.2f", x, y, (x-y));
				break;
			case '*':
				System.out.printf("A multiplica��o de %.2f e %.2f �: %.2f", x, y, (x*y));
				break;
			case '/':
				System.out.printf("A divis�o de %.2f e %.2f �: %.2f", x, y, (x/y));
				break;
			case '^':
				System.out.printf("%.2f elevado por %.2f �: %.2f", x, y, Math.pow(x,y));
				break;
			default:
				System.out.printf("Oprera��o Inv�lida");
				break;
		}
		
		sc.close();
	}

}
