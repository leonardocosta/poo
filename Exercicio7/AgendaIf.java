package Exercicio7;

public interface AgendaIf {

	public void adiciona(String nome,String telefone);
	public void remove(String nomeContato)throws ContatoInexistenteException;
	public Contato pesquisaContato(String nomeContato)throws ContatoInexistenteException;
	
}
