package aula4;

public class Circulo {
	
	private double raio; 
	private double perimetro;
	private double area;
	static double pi = Math.PI;
	
	
	Circulo(double raio) {
		this.raio = raio;
	}
	
	public void area() {
		System.out.println("calculando Area:" + (pi*(raio *raio)));
	}
	
	public void perimetro() {
		System.out.println("calculando Perímetro:" + (2*pi * raio));
	}

}
