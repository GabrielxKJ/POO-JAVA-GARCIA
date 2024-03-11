package aula4;

public class Sapo {
	private int qtPulo;
	private static int qtSapo;
	
	public Sapo() {
		qtSapo ++;
	}
	
	public void pular() {
		qtPulo ++;
	}

	public int getQtPulo() {
		return qtPulo;
	}

	public void setQtPulo(int qtPulo) {
		this.qtPulo = qtPulo;
	}

	public static int getQtSapo() {
		return qtSapo;
	}

	public static void setQtSapo(int qtSapo) {
		Sapo.qtSapo = qtSapo;
	}
	
	
}
