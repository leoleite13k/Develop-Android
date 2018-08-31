package com.projeto.condicionais;

public class Condicional {

	public static void main(String[] args) {
	
		boolean teste = true;
		int media = 9;
		
		//Se
		if( media < 6 ) {
			System.out.println("Reprovado");
		}
		//Senao
		/*else {
			System.out.println("Falso");
		}*/
		//Senao faca
		else if (media >= 6 && media <= 8) {
			System.out.println("Aprovado");
		}
		else if (media > 8 ) {
			System.out.println("Aprovado, Excelente !");
		}
	}

}
