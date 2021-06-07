package projeto_lcr;

import java.util.Scanner;

public class Para {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro ");
		int n = sc.nextInt();
		int soma = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o valor na posição:" +i);
			int x = sc.nextInt();
			soma = soma + x;
			
		}
	}
}
