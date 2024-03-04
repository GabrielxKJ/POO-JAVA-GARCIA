package com.aula3;

public class Produto {

	String nome, tipo;
	double preco;
	
	Produto(String nome, double preco, String tipo){
		this.nome = nome;
		this.preco = preco;
		this.tipo = tipo;
	}

	
	void mostrarInformações() {
		System.out.println("O nome do produto é:" + nome);
		System.out.println("O preco do produto é:" + preco);
		System.out.println("O tipo do produto é:" + tipo);
	}
	
	void calcularDesconto() {
		switch(tipo) {
			case "livro":
				System.out.println("Você teve um desconto de 15% no livro é equivalente a:" + (15 * preco)/100);
				break;
			case "escritorio":
				System.out.println("Você teve um desconto de 10% no item de escritório é equivalente a:" + (10 * preco)/100);
				break;
			case "tecnologia":
				System.out.println("Você teve um desconto de 5% no item de tecnologia é equivalente a:" + (5 * preco)/100);
				break;
			case "casa":
				System.out.println("Você teve um desconto de 12% no item de casa é equivalente a:" + (12 * preco)/100);

		}
	}
}
