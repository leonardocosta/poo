package br.ufpb.sistemapedidos;

public interface AgendaIf {

	public void adiciona(String nome,String telefone);
	public void remove(String nomeContato)throws ContatoInexistenteException;
	public Contato2 pesquisaContato(String nomeContato)throws ContatoInexistenteException;
}
