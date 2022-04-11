import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double altura, peso, imc;
		
		System.out.print("Altura (em M): ");
		altura = sc.nextDouble();
		
		System.out.print("Peso (em KG): ");
		peso = sc.nextDouble();
		
		imc = peso/(Math.pow(altura,2));
		
		if(imc < 18.5) {
			System.out.printf("IMC: %.2f\nAbaixo do peso!", imc);
		}
		
		else if((imc >= 18.5) && (imc <= 24.9)) {
			System.out.printf("IMC: %.2f\nBom!");
		}
		
		else if ((imc >= 25) && (imc <= 29.9)){
			System.out.printf("IMC: %.2f\nAcima do peso!", imc);	
		}
		
		else{
			System.out.printf("IMC: %.2f\nMuito acima do peso!", imc);
		}
				
		sc.close();
		

	}
	
	
}
