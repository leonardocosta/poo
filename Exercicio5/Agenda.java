package br.ufpb.sistemapedidos;

import java.util.*;

import Revisando.Contato;

public class Agenda implements AgendaIf{ 
	
	private List<Contato2> contato;
	
	public Agenda(){
		this.contato= new ArrayList<Contato2>();
	}
	public void adiciona(String nome, String telefone ){
		contato.add(new Contato2(nome, telefone));
	}
	public void remove(String nomeContato)throws ContatoInexistenteException{
		for(Contato2 c: this.contato){
			if(c.getNome().equals(nomeContato)){
				contato.remove(c);
				return;
				
			}
		}
		
		throw new ContatoInexistenteException("contato Inexistente");
		
		
	}
	public Contato2 pesquisaContato(String nomeContato) throws ContatoInexistenteException{
		for(Contato2 c : this.contato){
			if(c.getNome().equals(nomeContato)){
				return c;
				
			}
			
		}
		
		throw new ContatoInexistenteException(" Contato não cadastrado");
	}
	public void imprimirTodos(){
		for(Contato2 c: this.contato){
			System.out.println("O Nome é : "+ c.getNome());
			
		}
	}

}
