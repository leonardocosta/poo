package Exercicio6;
import java.util.Scanner;
import java.util.*;
public class TesteDePedidos {
	public  static void main(String []args){
		Scanner teclado= new Scanner (System.in);
		
		Pedido p1 = new Pedido(1);
		Pedido p2 = new Pedido(2);
		ControleDePedidos controle = new ControleDePedidos();
		ItemDePedido item =null;
		Cliente c= new Cliente();
					
		boolean continua = false;
							
		do{
			System.out.println("");

			System.out.println(" Digite\n 1 p/ adicionar Pedido,\n 2 p/ pesquisa Pedido,\n 3 p/ sair:   ");
			int opcao = teclado.nextInt();
			
			switch(opcao){
			
				case 1:
					
						System.out.println("digite o nome do Cliente: ");
						String nome = teclado.next();
						
						System.out.println("digite o Código do Pedido");
						long cod = teclado.nextLong();
						
						System.out.println("digite o a quantidade do Pedido");
						int quant = teclado.nextInt();
						
						System.out.println("digite o valor do Pedido");
						double preco = teclado.nextDouble();
						
						c.setNome(nome);
						item = new ItemDePedido(cod,quant, preco);
						p1.adicionaItem(item);
						p1.setCliente(c);
						controle.adicionaPedido(p1);
						
						break;
												
				case 2:
					System.out.println("digite o Código do Pedido");
					long codigo = teclado.nextLong();
					System.out.println(controle.pesquisaPedidosIncluindoProduto(codigo));
					break;
					
				case 3:
					continua= true;
					controle.sairDoPrograma();
					break;
						
			}
								
			
		}while(continua !=true);
		
	}

}
