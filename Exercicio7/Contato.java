package Exercicio7;

import java.io.Serializable;

public class Contato implements Serializable{
	private String nome;
	private String telefone;
	
	public Contato(String nome,String telefone){
		this.nome=nome;
		this.telefone=telefone;
	}
	public Contato(){
		this("","");
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setTelefone(String telefone){
		this.telefone=telefone;
	}
	public String getTelefone(){
		return this.telefone;
	}
	public String toString(){
		return this.nome + " " + this.telefone;
	}
}
