package com.fatec.sistema;

import com.fatec.modelo.*;

import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Pessoa> lista = new ArrayList<>();
	
		Pessoa p1 = new Pessoa("Marie", "123.456.789-01");
		Pessoa p2 = new Pessoa("Luis", "312.546.897-02");
		Pessoa p3 = new Pessoa("Lucy", "321.645.987-03");
		
		p1.telefone = new Telefone("12", "98374646");
		p2.telefone = new Telefone("12", "12345678");
		p3.telefone = new Telefone("12", "9837789");
		
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		
		for (int i = 0; i < lista.size(); i++) {
		if(i == 2) {
		System.out.println(lista.get(i).nome);
			}
		}
	}
}