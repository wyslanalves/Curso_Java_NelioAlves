package secao5_estrutura_condicional.exercicios;

import java.util.Scanner;

public class Exercício02 {

	public static void main(String[] args) {
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número:");
		int numero = sc.nextInt();
		
		if(numero < 0) {
			System.out.println("Número negativo " + numero);
		}else {
			System.out.println("Número positivo " + numero);
		}
		
		sc.close();
	}

}
