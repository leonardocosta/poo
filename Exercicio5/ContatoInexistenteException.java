package br.ufpb.sistemapedidos;

public class ContatoInexistenteException extends Exception{
	
	public ContatoInexistenteException(String nomeContato){
		super(nomeContato);
	}
	

}
