import java.util.Scanner;

public class Hipotenusa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double catetoMaior, catetoMenor, hipotenusa;
		
		System.out.print("Cateto Maior: ");
		catetoMaior = sc.nextDouble();
		
		System.out.print("Cateto Menor: ");
		catetoMenor = sc.nextDouble();
		
		hipotenusa = Math.sqrt((Math.pow(catetoMaior, 2) + Math.pow(catetoMenor, 2)));
		
		System.out.printf("A hipotenusa deste triângulo é: %.2f", hipotenusa);
		
		sc.close();

	}

}
