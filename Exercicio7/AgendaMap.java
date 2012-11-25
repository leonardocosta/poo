package Exercicio7;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AgendaMap implements AgendaIf,Serializable {
	
	private Map <String,Contato> contato;
	GravadorDeContatos gravador = new GravadorDeContatos();
	
	public AgendaMap(){
		
		try{
			this.contato = gravador.leContatoMap();
			
		}catch(IOException e){
			this.contato = new HashMap<String,Contato>();
		}
		
		
		
	}

	
	public void adiciona(String nome, String telefone) {
		contato.put(nome, new Contato(nome, telefone) );
	
		
	}

	public void remove(String contato)throws ContatoInexistenteException{
		boolean achou = false;
		for(Contato c: this.contato.values()){
			if(c.getNome().contains(contato)){
				this.contato.remove(contato);
				achou = true;
				return;
			}
		}
		if(achou==false){
			throw new ContatoInexistenteException("");
		}
		
	}
	public Contato pesquisaContato(String nomeContato) throws ContatoInexistenteException{
		for(Contato c: contato.values()){
			if(c.getNome().equals(nomeContato)){
				return c;
				
			}
						
		}
		throw new ContatoInexistenteException("não encontrou");
		
	}
	public void sairDoSistema(){
		try{
			this.gravador.gravaContatosMap(this.contato);
			
		}catch(IOException erro){
			System.err.println(erro.getMessage());
			
		}
		
	}
	

}
