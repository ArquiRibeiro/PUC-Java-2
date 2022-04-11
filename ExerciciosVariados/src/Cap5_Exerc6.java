import java.util.Scanner;
public class Cap5_Exerc6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horasTrabalhadas;
		double valorHorasTrabalhadas;
		char turno, categoria;
		
		for(int i = 1; i <= 10; i++){
			horasTrabalhadas = 0;
			turno = ' ';
			categoria = ' ';
			valorHorasTrabalhadas = 0.00;
			
			System.out.printf("Trabalhador de codigo *%d*\n", i);
			System.out.print("Digite o número de horas trabalhadas (valor inteiro): ");
			horasTrabalhadas = sc.nextInt();
						
			while(turno != 'M' && turno != 'V' && turno != 'N'){
				System.out.print("Digite o turno (M-V-N): ");
				turno = sc.next().toUpperCase().charAt(0);
			}
			
			while(categoria != 'O' && categoria != 'G'){
				System.out.print("Digite o categoria (O-G): ");
				categoria = sc.next().toUpperCase().charAt(0);
			}
			
			switch(turno) {
				case 'M':
				case 'V':
					if(categoria == 'O') {
						valorHorasTrabalhadas = (450 * 10)/100;
					}
					else {
						valorHorasTrabalhadas = (450 * 15)/100;
					}
					break;
					
				case 'N':
					if(categoria == 'O') {
						valorHorasTrabalhadas = (450 * 13)/100;
					}
					else {
						valorHorasTrabalhadas = (450 * 18)/100;
					}
					break;
			}
			
			System.out.printf("Valor da Hora Trabalhada: %.2f\n", valorHorasTrabalhadas);
			System.out.printf("Salario: %.2f\n\n", (valorHorasTrabalhadas*horasTrabalhadas));
			
		}
		
		sc.close();

	}

}
