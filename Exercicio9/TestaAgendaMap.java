package Exercicio9;

import static org.junit.Assert.*;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
 
public class TestaAgendaMap {
	
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
	public void adicionaTeste(){
		agenda.adiciona("marto", "7654");
		agenda.adiciona("marto","8945");
		try{
			Contato c = agenda.pesquisaContato("marto");
			assertEquals("8945",c.getTelefone());
		
		}catch(ContatoInexistenteException e){
			fail("não deveria falhar");
		}
		
	}
	@Test
	public void removeTeste(){
		agenda.adiciona("marilia", "6734");
		agenda.adiciona("marto","8945");
		try{
		Contato c = agenda.pesquisaContato("marto");
		assertEquals("8945", c.getTelefone());
		agenda.remove("marto");
		}catch(ContatoInexistenteException e){
			fail("não era para dá erro");
			
		}
		// contato não existente
		try{
			agenda.remove("lucas");
			fail("era para dá erro");
			}catch(ContatoInexistenteException e){
				
			}
					
	}
	
	@Test
	public void ContatoSemOrdenacao(){
		agenda.adiciona("marilia", "6734");
		agenda.adiciona("lucas", "7654");
		agenda.adiciona("marto","8945");
		
		Collection <Contato> contatoProcurados = agenda.getContatos();
		for(Contato c: contatoProcurados){
			assertTrue(c.getTelefone().equals("6734")|| c.getTelefone().equals("7654")|| c.getTelefone().equals("8945"));
		}
				
	}
	@Test
	public void ContatosComOrdenacao() {
		agenda.adiciona("marilia", "6734");
		agenda.adiciona("lucas", "7654");
		agenda.adiciona("marto","8945");
		
		Iterator<Contato> contatosProcurados = agenda.getContatosOrdenados();
		assertTrue(contatosProcurados.hasNext());
		
	}
}


