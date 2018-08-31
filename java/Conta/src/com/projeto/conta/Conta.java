package com.projeto.conta;

	//this. - Utilizado para usar atributos e metodos dentro da propria classes

public class Conta {
	
	//Modificador default
	//int numeroConta;
	
	//Modificador public
	//public int numeroConta;
	
	//Modificador private
	//private int numeroConta;
	
	//Modificador protected
	//protected int numeroConta;
	
	private int numeroConta;
	private double saldo = 100;
	
	protected String minhaPropProtegida ;  
	
	public void depositar(double valorDepositar) {
		this.saldo += valorDepositar;
	}
	
	public void sacar(double valorSacar) {
		this.saldo -= valorSacar;
	}
	
	public double retornarSaldo() {
		return this.saldo;
	}
}
