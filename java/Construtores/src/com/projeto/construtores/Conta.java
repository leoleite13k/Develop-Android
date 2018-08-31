package com.projeto.construtores;

public class Conta {
	
	private int numeroConta;
	private double saldo;
	
	//Contrutor Simples
	/*public Conta() {
		//Corpo
		
		System.out.println("Construtor invocado");		
	}*/
	
	//Construtor com Parametros
	public Conta (int nConta) {
		this.numeroConta = nConta;
	}
	
	//Metodo para impressao na tela
	public void imprime () {
		System.out.println(this.numeroConta);
	}

}
