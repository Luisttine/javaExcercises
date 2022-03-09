package com.fatec.modelo;

public class Pessoa {
	public String nome;
	public String cpf;
	public Telefone telefone;
	public String pessoa;
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.pessoa = nome + " " + cpf;
	}
}
