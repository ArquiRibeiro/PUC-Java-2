import java.util.Scanner;
public class Exerc_19_Escadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double quantidadeDegraus, alturaDegrau, alturaDesejada;
		
		System.out.print("Altura do Degrau (em metros): ");
		alturaDegrau = sc.nextDouble();
		System.out.print("Altura Desejada (em metros): ");
		alturaDesejada = sc.nextDouble();
		
		quantidadeDegraus = alturaDesejada/alturaDegrau;
		System.out.printf("Quantidade de degraus necessária: %.1f", quantidadeDegraus);
		
		sc.close();

	}

}
