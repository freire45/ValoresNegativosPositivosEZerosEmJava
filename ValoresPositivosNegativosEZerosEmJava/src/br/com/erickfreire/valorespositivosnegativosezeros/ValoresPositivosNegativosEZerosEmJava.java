package br.com.erickfreire.valorespositivosnegativosezeros;

import java.util.Scanner;

public class ValoresPositivosNegativosEZerosEmJava {

	public static void main(String[] args) {
		
		int numero = 0;
		int positivo = 0;
		int negativo = 0;
		int zero = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que recebe 5 valores e informa quantos são positivos, negativos e zeros!");
		
		System.out.print("Digite o primeiro valor: ");
		numero = entrada.nextInt();
		
		if(numero > 0) {
			positivo = positivo + 1;
		}
		
		if(numero == 0) {
			zero = zero + 1;
		}
		
		if(numero < 0) {
			negativo = negativo + 1;
		}
		
		System.out.print("Digite o segundo valor: ");
		numero = entrada.nextInt();
		
		if(numero > 0) {
			positivo = positivo + 1;
		}
		
		if(numero == 0) {
			zero = zero + 1;
		}
		
		if(numero < 0) {
			negativo = negativo + 1;
		}
		
		System.out.print("Digite o terceiro valor: ");
		numero = entrada.nextInt();
		
		if(numero > 0) {
			positivo = positivo + 1;
		}
		
		if(numero == 0) {
			zero = zero + 1;
		}
		
		if(numero < 0) {
			negativo = negativo + 1;
		}
		
		System.out.print("Digite o quarto valor: ");
		numero = entrada.nextInt();
		
		if(numero > 0) {
			positivo = positivo + 1;
		}
		
		if(numero == 0) {
			zero = zero + 1;
		}
		
		if(numero < 0) {
			negativo = negativo + 1;
		}
		
		System.out.print("Digite o quinto valor: ");
		numero = entrada.nextInt();
		
		if(numero > 0) {
			positivo = positivo + 1;
		}
		
		if(numero == 0) {
			zero = zero + 1;
		}
		
		if(numero < 0) {
			negativo = negativo + 1;
		}
		
		System.out.printf("%nTotal de valores: %nNegativos: %d%nZeros: %d%nPositivos: %d%n", negativo, zero, positivo);
		

	}

}
