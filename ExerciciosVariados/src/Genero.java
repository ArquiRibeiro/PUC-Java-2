/*
 - Usar '.equals'ao invés de '==' ao comparar Strings derivadas de Scan;
 - '==' faz comparação de endereço de memoria;
 - '.equals' faz comparação de conteúdo;
 */

import java.util.Scanner;

public class Genero {

	public static void main(String[] args) {
		
		//- Declaração de objeto
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Você se identifica com o sexo masculino? (escreva por extenso 'SIM' ou 'NÃO')\n-");
		
		//- Declaração seguida de atribuição TRUE/FALSE através de comparação (má prática)
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
