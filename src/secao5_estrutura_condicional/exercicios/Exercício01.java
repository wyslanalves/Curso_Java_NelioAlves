package secao5_estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercício01 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro, 
		//e depois dizer se este número é negativo ou não.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		if(numero % 2 == 0) {
			System.out.println("PAR: " + numero);
		}else {
			System.out.println("IMPAR: " + numero);
		}
		
		sc.close();
	}

}
