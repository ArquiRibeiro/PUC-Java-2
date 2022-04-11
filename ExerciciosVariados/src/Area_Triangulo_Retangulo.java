import java.util.Scanner;

public class Area_Triangulo_Retangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a base do triângulo\n-");
		int base = sc.nextInt();
		
		System.out.printf("Digite a altura do triângulo\n-");
		int altura = sc.nextInt();
		
		System.out.printf("Um triângulo retângulo de base %d e altura %d possui área %d", base, altura, base*altura);
		
		sc.close();
	}

}