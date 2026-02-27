package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Metodos {
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	
	// Testes de entrada (p.s. não é a melhor forma de fazer isso)
	public static int validarN () throws IOException {
		
		System.out.print("Digite um número > 9 e < 1.000000: ");
		int n = Integer.parseInt (br.readLine());
		
		if (n < 10 || n > 999999) {
			System.out.println ("Número inválido (deve estar entre 10 e 999999! ");
			return validarN( );
		}
		
		else {
			return n;
		}
		
	}	
	
	// Teste de entrada 2
	public static int validarN2 () throws IOException {
		
		System.out.print("Digite um número >= 0 e <= 9: ");
		int n2 = Integer.parseInt (br.readLine());
		
		if (n2 < 0 || n2 > 9) {
			System.out.println ("Número inválido (deve estar entre 0 e 9)! ");
			return validarN( );
		}
		
		else {
			return n2;
		}
	}
	
	public static int QTDaparece (int n, int n2) {
		
		// Dividi o número por 10 para pegar o último digito com o resto dessa divisão
		// Caso % 10 for igual a n2 somei um a recursão e passei como parâmetro a parte inteira da divisão
		// Quando a parte inteira chega a zero a função retorna para Main
		if (n == 0) {
				return + 0;
		}
		
		else if (n % 10 == n2) {
			return 1 + Metodos.QTDaparece(n / 10, n2);
		} else { return QTDaparece (n / 10, n2); }		
	}
}
