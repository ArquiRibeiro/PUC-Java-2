import java.util.Scanner;

public class Area_Triangulo_Retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a base do tri�ngulo\n-");
		int base = sc.nextInt();
		
		System.out.printf("Digite a altura do tri�ngulo\n-");
		int altura = sc.nextInt();
		
		System.out.printf("Um tri�ngulo ret�ngulo de base %d e altura %d possui �rea %d", base, altura, base*altura);
		
		sc.close();
	}

}