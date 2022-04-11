import java.util.Scanner;

public class Calculo_Distancia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a velocidade do veículo (em metros por segundo)\n-");
		int velocidade = sc.nextInt();
		
		System.out.printf("Digite o tempo (em segundos)\n-");
		int tempo = sc.nextInt();
		
		int distancia = (velocidade * tempo);
		
		System.out.printf("Um veículo a %d m/s por %ds percorre %d metros", velocidade, tempo, distancia);
		
		sc.close();
	}

}