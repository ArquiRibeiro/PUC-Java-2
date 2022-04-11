/*
 - '.charAt(0)' equivale a String[0] em outras linguagens;
 */

import java.util.Scanner;

public class Genero_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char genero;
		boolean finish = false;
		
		while(finish == false){		
			System.out.print("Por favor, digite seu gênero:\n(M)asculino\n(F)eminino\n(O)utro\n-");
			genero = sc.next().charAt(0);
			finish = true;
			
			switch(genero) {
				case 'm':
					System.out.println("Bom dia Senhor!");
					break;
				case 'f':
					System.out.println("Boa tarde Senhora!");
					break;
				case 'o':
					System.out.println("Boa noite, Senhorx!");
					break;
				default:
					System.out.println("(ERRO) Por favor, tente novamente e digite um caractere valido.\n");
					finish = false;
					break;
			}
			
		}
		
		sc.close();

	}

}
