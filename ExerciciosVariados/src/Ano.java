import java.util.Scanner;

public class Ano {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int anoNascimento, anoAtual, anoFuturo;
		
		System.out.print("Ano Atual: ");
		anoAtual = sc.nextInt();
		
		System.out.print("Ano nascimento: ");
		anoNascimento = sc.nextInt();
		
		System.out.print("Ano futuro: ");
		anoFuturo = sc.nextInt();
		
		System.out.printf("Você tem %d anos, e terá %d em %d ", (anoAtual - anoNascimento), (anoFuturo - anoNascimento), anoFuturo);
		
		sc.close();
	}

}
