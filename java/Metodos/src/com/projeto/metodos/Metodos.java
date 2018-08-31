package com.projeto.metodos;

public class Metodos {

	public static void main(String[] args) {
		
		int resultado;
		
		meuMetodo();
		resultado = multiplicar(2,5);
		System.out.println(resultado + 2);
		
	}
	
	public static void meuMetodo(){		
		//Corpo do metodo
		System.out.println("Esse e o meu metodo");		
	}
	
	public static int multiplicar(int numero1, int numero2){
		int resultado = 0;
		resultado = numero1 * numero2;
		return resultado;
	}
}