import java.util.Scanner;
public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nota;
		
		System.out.print("Digite a nota: ");
		nota = sc.nextInt();
		
		if(nota >= 8 && nota <= 10) {
			System.out.print("Ótimo!");
		}
		
		else if(nota >= 7 && nota < 8) {
			System.out.print("Bom");
		}
		
		else if(nota >= 5 && nota < 7) {
			System.out.print("Regular");
		}
		
		else if(nota >= 0 && nota < 5){
			System.out.print("Insatisfatório");
		}
		
		else {
			System.out.print("VALOR INVÁLIDO");
		}
		
		sc.close();
	}

}
