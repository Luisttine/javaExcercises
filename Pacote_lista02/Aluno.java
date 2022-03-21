package Pacote_lista02;

public class Aluno{
	private int ra;
	private String nome;
	private char sexo;
	private String rg;
	private String cpf;
	
	public Aluno(int ra2, String nome2, String string, String rg2, String cpf2) {
		// TODO Auto-generated constructor stub
	}
	public int getRa(int ra) {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	
	
	public String getNome(String nome) {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getRg(String rg) {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	

	public String getCpf() {
		return cpf;
	}
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	
	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	public Aluno(int ra, String nome, char sexo, String rg, String cpf) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.setSexo(sexo);
		this.rg = rg;
		this.cpf = cpf;
	}

}	
