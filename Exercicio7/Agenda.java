package Exercicio7;


import java.io.IOException;
import java.io.Serializable;
import java.util.*;



public class Agenda implements AgendaIf, Serializable{ 
	
	private List<Contato> contato;
	GravadorDeContatos gravador= new GravadorDeContatos();
	
	public Agenda(){
		try{
			this.contato = gravador.leContato();
			
		}catch(IOException e){
			this.contato= new ArrayList<Contato>();
		}
	}
	
	public void adiciona(String nome, String telefone ){
		contato.add(new Contato(nome, telefone));
	}
	
	public void remove(String nomeContato)throws ContatoInexistenteException{
		for(Contato c: this.contato){
			if(c.getNome().equals(nomeContato)){
				contato.remove(c);
				return;
				
			}
		}
		
		throw new ContatoInexistenteException("contato Inexistente");
	}
	
	public Contato pesquisaContato(String nomeContato) throws ContatoInexistenteException{
		for(Contato c : this.contato){
			if(c.getNome().equals(nomeContato)){
				return c;
			}
		}
		
		throw new ContatoInexistenteException(" Contato não cadastrado");
	}
	
	public void imprimirTodos(){
		for(Contato c: this.contato){
			System.out.println("O Nome é : "+ c.toString());
		}
	}
	
	public void sairDoSistema(){
		try{
			this.gravador.gravaContatos(this.contato);
		}catch(IOException erro){
			System.err.println(erro.getMessage());
			
			
		}
	}
	
}

