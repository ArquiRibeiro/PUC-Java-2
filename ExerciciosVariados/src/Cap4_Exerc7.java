import java.util.Scanner;
public class Cap4_Exerc7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		int i, a, b, c;
		
		System.out.print("Digite a operação: ");
		i = sc.nextInt();
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		b = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		c = sc.nextInt();
		
		
		
		switch(i){
			//ORDEM CRESCENTE
			case 1:
				if(a<b && a<c && b!=c) {
					if(b<c) {
						System.out.printf("A ordem crescente dos números é: %d, %d e %d", a, b, c);
					}
					else if(c<b) {
						System.out.printf("A ordem crescente dos números é: %d, %d e %d", a, c, b);
					}
				}
				else if(b<a && b<c && a!=c) {
					if(a<c) {
						System.out.printf("A ordem crescente dos números é: %d, %d e %d", b, a, c);
					}
					else if(c<a) {
						System.out.printf("A ordem crescente dos números é: %d, %d e %d", b, c, a);
					}
				}
				else if(c<a && c<b && a!=b) {
					if(a<b) {
						System.out.printf("A ordem crescente dos números é: %d, %d e %d", c, a, b);
					}
					else if(b<a) {
						System.out.printf("A ordem crescente dos números é: %d, %d e %d", c, b, a);
					}
				}
				else {
					System.out.print("Não digite números iguais!");
				}
				break;
				
			case 2:
				if(a>b && a>c && b!=c) {
					if(b>c) {
						System.out.printf("A ordem decrescente dos números é: %d, %d e %d", a, b, c);
					}
					else if(c>b) {
						System.out.printf("A ordem decrescente dos números é: %d, %d e %d", a, c, b);
					}
				}
				else if(b>a && b>c && a!=c) {
					if(a>c) {
						System.out.printf("A ordem decrescente dos números é: %d, %d e %d", b, a, c);
					}
					else if(c>a) {
						System.out.printf("A ordem decrescente dos números é: %d, %d e %d", b, c, a);
					}
				}
				else if(c>a && c>b && a!=b) {
					if(a>b) {
						System.out.printf("A ordem decrescente dos números é: %d, %d e %d", c, a, b);
					}
					else if(b>a) {
						System.out.printf("A ordem decrescente dos números é: %d, %d e %d", c, b, a);
					}
				}
				else {
					System.out.print("Não digite números iguais!");
				}
				break;
			case 3:
				if(a>b && a>c) {
					System.out.printf("Ordem desejada: %d %d e %d", b, a, c);
				}
				else if(b>a && b>c) {
					System.out.printf("Ordem desejada: %d %d e %d", a, b, c);
				}
				else if(c>a && c>b) {
					System.out.printf("Ordem desejada: %d %d e %d", a, c, b);
				}
				else {
					System.out.print("Não digite números iguais!");
				}
				break;
		}
		
		sc.close();
	}

}