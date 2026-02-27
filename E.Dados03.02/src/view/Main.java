package view;
import java.io.IOException;

import controller.Metodos;

public class Main {
	public static void main(String[] args) throws IOException {
		
		int n = Metodos.validarN();
		int n2 = Metodos.validarN2();
		
		System.out.printf("Vamos ver quantas vezes o número %d aparece em %d \n", n2, n);
		
		int result = Metodos.QTDaparece(n, n2);
		System.out.printf ("O número %d aparece %d vezes em %d!", n2, result, n);
		
		}
		
}

