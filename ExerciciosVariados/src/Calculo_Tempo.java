import java.util.Scanner;

public class Calculo_Tempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a velocidade do ve�culo (em metros por segundo)\n-");
		int velocidade = sc.nextInt();
		
		System.out.printf("Digite a dist�ncia a ser percorrida (em metros)\n-");
		int distancia = sc.nextInt();
		
		int tempo = (distancia / velocidade);
		
		System.out.printf("Um ve�culo a %d m/s percorrer� %d metros em  %d segundos", velocidade, distancia, tempo);
		
		sc.close();
	}

}