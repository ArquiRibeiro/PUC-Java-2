import java.util.Scanner;

public class Distancia_de_pontos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int pontos[][] = new int[2][2];
		double distancia;
		String mensagem;
		
		for(int i = 0; i < 2; i++) {
			for(int i2 = 0; i2 < 2; i2++) {
				/*if(i2 % 2 == 0) {System.out.print("Digite o valor de X\n-");}
				else{System.out.print("Digite o valor de Y\n-");}*/
				mensagem = (i2 % 2 == 0) ? "Digite o valor de X" : "Digite o valor de Y";
				System.out.print(mensagem);
				pontos[i][i2] = sc.nextInt();
			}
			System.out.printf("(X: %d, Y: %d)\n", pontos[i][0], pontos[i][1]);
		}
		
		distancia = Math.sqrt(Math.pow(pontos[1][0] - pontos[0][0], 2) + pontos[1][1] - pontos[0][1]);
		System.out.printf("A distancia entre os pontos é: %.2f", distancia);
		
		sc.close();
	}

}
