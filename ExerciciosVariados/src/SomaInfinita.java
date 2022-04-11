import java.util.Scanner;

public class SomaInfinita {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0,
			num = 1,			
			rep = 0;
		
		double media;
		
		while(num != 0) {
			System.out.printf("%d� n�mero: ", rep+1);
			num = sc.nextInt();
			
			if(num != 0) {
				sum = sum + num;
				rep++;
			}
			else {
				media = (float)sum/rep;
				System.out.printf("Soma: %d\nRepeti��es: %d\nM�dia: %.2f", sum, rep, media);
			}			
		}
		
		sc.close();

	}

}
