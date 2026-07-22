package class1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		
		/*
		Exercício 1 - IMC
		
		System.out.println("Digite Peso seguido de altura: ");
		Scanner teclado = new Scanner(System.in);
		int peso = teclado.nextInt();
		double altura = teclado.nextDouble();
		
		double imc = peso / (altura * altura);
		
		System.out.printf("IMC: %.2f", imc);
		
		Scanner teclado = new Scanner(System.in);
		
		
		Exercício 2 - Leonidas
		
		
		int palpite;
		int valorCorreto = 10000;
		System.out.println("Digite seu palpite: ");
		palpite = teclado.nextInt();
		
		while (palpite != valorCorreto) {
			if (palpite>valorCorreto) {
				System.out.println("Um pouco menos...");
			}
			else {
				System.out.println("Um pouco mais ...");
			}
			System.out.println("Digite outro Palpite: ");
			palpite = teclado.nextInt();
		}
		System.out.println("Parabéns, acertou!");*/
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList <String> listaNomes = new ArrayList<String>();
		System.out.println("Digite a quantidade de nomes: ");
		
		int qtd = teclado.nextInt();
		String nome;
		for (int i=0; i<qtd; i++) {
			nome = teclado.next();
			listaNomes.add(nome);
		}
		for(int i=listaNomes.size()-1; 1>=0; i--) {
			System.out.println(listaNomes.get(i));
		}
		
		// Collections.reverse(listaNomes); outra maneira de inverter

	}

}
