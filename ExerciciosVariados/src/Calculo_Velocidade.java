import java.util.Scanner;

public class Calculo_Velocidade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a distancia percorrida pelo veículo (em metros)\n-");
		int distancia = sc.nextInt();
		
		System.out.printf("Digite o tempo (em segundos)\n-");
		int tempo = sc.nextInt();
		
		int velocidade = (distancia / tempo);
		
		System.out.printf("Um veículo que percorreu %d metros em %ds segundos possui velocidade de %d m/s", distancia, tempo, velocidade);
		
		sc.close();
	}

}