package Exercicio9;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestaAgenda {
	
	Agenda agenda;
	
	@Before
	public void setup(){
		agenda = new Agenda();
		
	}
	@After
	public void tearDown(){
		File arquivo = new File("Agenda.txt");
		if(arquivo.exists()){
			arquivo.delete();
			
		}
	}

	@Test
	public void adicionaTeste() {
		agenda.adiciona("lucas", "8111");
		agenda.adiciona("lucas", "2111");
		try {
			Contato c = agenda.pesquisaContato("lucas");
			assertEquals("2111", c.getTelefone());
		} catch (ContatoInexistenteException e) {
			fail("falhou");
		}

	}

	@Test
	public void removeTeste() {
		Agenda agenda = new Agenda();
		agenda.adiciona("lucas", "8111");
		
		//testando contato existente
		try {
			Contato c = agenda.pesquisaContato("lucas");
			assertEquals("8111", c.getTelefone());
			agenda.remove("lucas");
		} catch (ContatoInexistenteException e) {
			fail("n�o deveria falhar");
		}
		
		//testando contato  n�o existente
		try {
			agenda.remove("saulo");
			fail("deveria lan�ar exce��o");
		} catch (ContatoInexistenteException e) {
			
		}			
		
	}

	@Test
	public void ContatosSemOrdenacao() {
		agenda.adiciona("lucas", "8111");
		agenda.adiciona("gil", "9513");
		agenda.adiciona("ana", "9767");

		Collection<Contato> contatosAchados = agenda.getContatos();
		for (Contato c : contatosAchados) {
			assertTrue(c.getNome().equals("lucas") || c.getNome().equals("gil")|| c.getNome().equals("ana"));
		}

	}
	

	@Test
	public void ContatosComOrdenacao() {
		Agenda agenda = new Agenda();
		agenda.adiciona("lucas", "8111");
		agenda.adiciona("gil", "9513");
		agenda.adiciona("ana", "9767");
		
		Iterator<Contato> contatosAchados = agenda.getContatosOrdenados();
		assertEquals("ana",contatosAchados.next().getNome());
		assertEquals("lucas",contatosAchados.next().getNome());
		assertEquals("gil",contatosAchados.next().getNome());
		
		
		
	}
}
