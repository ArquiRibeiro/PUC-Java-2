import java.util.Scanner;
public class IMC2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double altura, peso, imc;
		
		System.out.print("Altura (em M): ");
		altura = sc.nextDouble();
		
		System.out.print("Peso (em KG): ");
		peso = sc.nextDouble();
		
		imc = peso/(Math.pow(altura,2));
		
		if(imc < 18) {
			System.out.printf("IMC: %.2f\nDesnutrição!!", imc);
		}
		
		else if(imc >= 18 && imc <= 20) {
			System.out.printf("IMC: %.2f\nAbaixo do pes o!", imc);
		}
		
		else if((imc > 20) && (imc <= 24)) {
			System.out.printf("IMC: %.2f\nBom!");
		}
		
		else if ((imc > 24) && (imc <= 27)){
			System.out.printf("IMC: %.2f\nAcima do peso!", imc);	
		}
		
		else{
			System.out.printf("IMC: %.2f\nObesidade!!", imc);
		}
				
		sc.close();
		

	}
	
	
}
