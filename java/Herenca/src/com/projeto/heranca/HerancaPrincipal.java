package com.projeto.heranca;

public class HerancaPrincipal {

	public static void main(String[] args) {
		//Instanciar as classes
		Cao cao = new Cao();
		Passaro passaro = new Passaro();
		
		//Setar valores dos objetos
		cao.setCor("Branco");
		cao.setPeso(18);
		cao.setTamanho("Pequeno");
		
		passaro.setCor("Verde");
		passaro.setPeso(8);
		passaro.setTamanho("Grande");
		
		//Pegar e mostrar os valores de cada objeto
		System.out.println("Cao !!");
		System.out.println(cao.getCor());
		System.out.println(cao.getPeso());
		System.out.println(cao.getTamanho());
		cao.latir();
		cao.correr();
		
		System.out.println("\n" + "Passsarinhooooooo !!");
		System.out.println(passaro.getCor());
		System.out.println(passaro.getPeso());
		System.out.println(passaro.getTamanho());
		passaro.voar();
		passaro.correr();
	}

}
