package com.projeto.variaveisjava;

public class Variavel {
	
	// Tipo de Variaveis
	//byte - Numeros = -128 ate 127
	//short - NUmeros = -32768 ate 32767
	//int - Numeros = -2147483648 ate 2147483647
	//long - Numeros = –9223372036854775808 ate 9223372036854775807
	//float - Numeros Decimais = 3.4e–038 ate 3.4e+038
	//double - Numeros Decimais com mais precisao = 1 .7e–308 ate 1.7e+308
	//boolean - Valores Boleanos = true / false
	//String - Textos = "Testeeetete"
	

	public static void main(String[] args) {
		byte minhaVariavelByte = 10;
		int minhaVariavelInt = 1000000;
		long minhaVariavelLong = 1000000000;
		float minhaVariavelFloat = 1.3f;
		double minhaVariavelDouble = 1.3121321;
		boolean minhaVariavelBoolean = true;
		String minhaVariavelString = "Leonardo Leite " + minhaVariavelByte;
		
		System.out.println(minhaVariavelByte);
		System.out.println(minhaVariavelInt);
		System.out.println(minhaVariavelLong);
		System.out.println(minhaVariavelFloat);
		System.out.println(minhaVariavelDouble);
		System.out.println(minhaVariavelBoolean);
		System.out.println(minhaVariavelString);
		
	}

}
