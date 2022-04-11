import java.util.Scanner;
public class Exerc_25_HoraMinuto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int horas, minutos;
		
		System.out.print("digite as horas: ");
		horas = sc.nextInt();
		
		System.out.print("digite os minutos: ");
		minutos = sc.nextInt();
		
		//Verifica se os minutos chegam a 60 e os converte em horas caso positivo
		if(minutos >= 60){
			horas += minutos / 60;
			minutos = minutos % 60;
		}
		
		System.out.printf("Horas: %d\nMinutos: %d\n", horas, minutos);
		System.out.printf("Total em minutos: %d\n", ((horas * 60) + minutos));
		System.out.printf("Total em segundos: %d\n", (((horas * 60) + minutos) * 60));
		
		sc.close();

	}

}
