package com.projeto.conta;

public class ClassePrincipal {

	//default - (Sem nada definido), permite acesso dentro do pacote
	//public - Todas as classes terao acesso
	//private - Apenas pode ser acessado de dentro da classe
	//protected - Pode ser acessado dentro do mesmo pacote e de classes derivadas	
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.depositar(100); //200
		conta.sacar(50); //150
		
		conta.minhaPropProtegida = "Leonardo";
		
		System.out.println(conta.minhaPropProtegida);
		
	}

}
