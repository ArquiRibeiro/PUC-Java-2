import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String name = "";
		//String last_name = "";
		//int idade = 0;
		System.out.println("Escreva seu nome" );
		name = sc.next();
		System.out.println("Nome: "+name);
		
		sc.close();
	}

}
