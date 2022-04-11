/*
 - Usar '.equals'ao inv�s de '==' ao comparar Strings derivadas de Scan;
 - '==' faz compara��o de endere�o de memoria;
 - '.equals' faz compara��o de conte�do;
 */

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {
		
		//- Declara��o de objeto
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Voc� se identifica com o sexo masculino? (escreva por extenso 'SIM' ou 'N�O')\n-");
		
		//- Declara��o seguida de atribui��o TRUE/FALSE atrav�s de compara��o (m� pr�tica)
		boolean masculino = (sc.next().equals("sim"));		
		"Leticia".equals("Leonardo");
		
		if(masculino == true){
			System.out.println("Bom dia, Senhor");
		}
		
		else{
			System.out.println("Boa noite, senhora!");
		}
		
		sc.close();
		
		System.out.println("Boa noite, senhora!");
		
		return;

	}	

}
