package br.ufpb.sistemapedidos;

public class Principal {
	public static void main(String [] args) {
		Agenda a = new Agenda();
		Contato2 c = new Contato2();
		
		a.adiciona("lucas", "8182-8282");
		a.adiciona("mateus", "8182-8282");
		a.adiciona("felipe", "8182-8282");
		
				
		try{
			a.pesquisaContato("marta");
			a.imprimirTodos();
		}catch(ContatoInexistenteException e){
			System.err.println(e.getMessage());
			
			
		}
		try{
			
			a.remove("lucas");
			a.imprimirTodos();
		}catch(ContatoInexistenteException e){
			System.err.println(e.getMessage());
			
			
		}
		
		
	}

}
