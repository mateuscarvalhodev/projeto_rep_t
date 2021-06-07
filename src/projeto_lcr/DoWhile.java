package projeto_lcr;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		//f = 9.0 * c / 5.0 + 32;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em Celsius: ");
		double c = sc.nextDouble();
		double f = 9.0 * c / 5.0 + 32;
		System.out.println("O valor em fahrenheit é: "+f);
		System.out.println("Deseja repetir a conversão? (s/n): ");
		char resposta = sc.next().charAt(0);
		while(resposta != 'n') {
			System.out.println("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			f = 9.0 * c / 5.0 + 32;
			
			System.out.println("O valor em fahrenheit é: "+f);
		}
	}
}
