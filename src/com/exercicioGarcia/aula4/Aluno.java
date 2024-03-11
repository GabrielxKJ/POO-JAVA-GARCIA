package aula4;

public class Aluno {
	private String nome;
	private String ra;
	private Curso curso;
	
	public Aluno(String nome, String ra, Curso curso) {
		super();
		this.nome = nome;
		this.ra = ra;
		this.curso = curso;
	}
	
	public String getNome() {
		// nome é acessível apenas na classe aluno
		// burla a regra do private via método.
		return nome;
	}
	
	public String getRA() {
		return ra;
	}
	
	public Curso getCurso() {
		return curso;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
