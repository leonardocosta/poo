package Exercicio8;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;



public class Contato implements Serializable, Comparable <Contato>{
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
	
	public int compareTo(Contato n) {
		if(this.nome.compareTo(n.getNome())<0){
			return -1;
		}
		else if(this.nome.compareTo(n.getNome())==0){
			return 0;
			
		}else{
			return 1;
		}
		
	}
}
