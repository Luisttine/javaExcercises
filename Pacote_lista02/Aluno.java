package Pacote_lista02;

public class Aluno{
	private int ra;
	private String nome;
	private char sexo;
	private String rg;
	private String cpf;
	
	public Aluno(int ra, String nome, char string, String rg, String cpf) {
		super();
		this.ra = ra;
		this.nome = nome;
		this.setSexo(string);
		this.rg = rg;
		this.cpf = cpf;
	}

	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getRg() {
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

	public void setSexo(char string) {
		this.sexo = string;
	}

}	
