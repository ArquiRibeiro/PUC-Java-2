import java.util.Scanner;

public class Area_Quadrado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o lado do quadrado\n-");
		int lado = sc.nextInt();
		System.out.printf("Um quadrado de lado %d possui área %d", lado, lado*2);
		
		sc.close();
	}

}
