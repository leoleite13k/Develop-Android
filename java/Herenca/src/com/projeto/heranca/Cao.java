package com.projeto.heranca;

public class Cao extends Animal {
	
	public void latir () {	
		System.out.println("Au Au Au !!!");
	}
	
	//Sobreencrever o metodo da classe pai (Primeiro verifica dentro da classes chamada e depois da pai * caso ano tiver o metodo/atributo)
	public void correr() {
		//Chamar o metodo da super classe
		super.correr();
		System.out.println("Correr como Cao");
	}

}
