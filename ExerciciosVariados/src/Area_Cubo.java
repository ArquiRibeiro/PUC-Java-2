import java.util.Scanner;

public class Area_Cubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o lado do cubo\n-");
		int lado = sc.nextInt();
		
		System.out.printf("Um cubo de lado %d possui volume %d", lado, lado*lado*lado);
		
		sc.close();
	}

}