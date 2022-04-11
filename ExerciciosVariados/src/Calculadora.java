import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double x,y;
		char op;
		
		System.out.print("Digite o primeiro número:\n-");
		x = sc.nextDouble();
		
		System.out.print("Digite o segundo número:\n-");
		y = sc.nextDouble();
		
		System.out.print("Digite a opreração:\n(+)Soma\n(-)Subtração\n(*)Multiplicação\n(/)Divisão\n(^)Elevar\n-");
		op = sc.next().charAt(0);
		
		switch(op) {
			case '+':
				System.out.printf("A soma de %.2f e %.2f é: %.2f", x, y, (x+y));
				break;
			case '-':
				System.out.printf("A subtração de %.2f e %.2f é: %.2f", x, y, (x-y));
				break;
			case '*':
				System.out.printf("A multiplicação de %.2f e %.2f é: %.2f", x, y, (x*y));
				break;
			case '/':
				System.out.printf("A divisão de %.2f e %.2f é: %.2f", x, y, (x/y));
				break;
			case '^':
				System.out.printf("%.2f elevado por %.2f é: %.2f", x, y, Math.pow(x,y));
				break;
			default:
				System.out.printf("Opreração Inválida");
				break;
		}
		
		sc.close();
	}

}
