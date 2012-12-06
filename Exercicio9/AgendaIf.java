package Exercicio9;

import java.util.Collection;
import java.util.Iterator;

public interface AgendaIf {

	public void adiciona(String nome,String telefone);
	public void remove(String nomeContato)throws ContatoInexistenteException;
	public Contato pesquisaContato(String nomeContato)throws ContatoInexistenteException;
	public Collection<Contato> getContatos();
	public Iterator<Contato> getContatosOrdenados();
}
