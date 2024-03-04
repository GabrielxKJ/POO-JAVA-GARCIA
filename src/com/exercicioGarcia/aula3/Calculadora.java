package com.aula3;

public class Calculadora {
	
	double numero1;
	double numero2;
	
	Calculadora(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	void soma() {
	 	System.out.println("A soma dos dois dos numeros é:"+ (numero1 + numero2));	
	}
	
	void multiplicacao() {
		System.out.println("A multiplicacao dos dois dos numeros é:"+ (numero1 * numero2));
	}
	
	void subtracao() {
		System.out.println("A subtracao dos dois dos numeros é:"+ (numero1 - numero2));
	}
	
	void divisao() {
		System.out.println("A divisao dos dois dos numeros é:"+ (numero1 / numero2));
	}
}
