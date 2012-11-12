package br.ufpb.sistemapedidos;

import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		Pedido pedido = new Pedido(01);
		ItemDePedido item;
		
		int continua=1;
		double valorTotal=0;
		
		
		do{
			System.out.println("Digite o código do Produto: ");
			String codigo = teclado.next();
						
			System.out.println("Quantidade de item: ");
			int quantidade = teclado.nextInt();
					
			System.out.println("Valor o unitário do ítem: ");
			double valor = teclado.nextDouble();
			
			item = new ItemDePedido (codigo, quantidade, valor );
			pedido.adicionaItem(item);
			
			if(codigo.equals("0")){
				continua=0;
			}
			
			
			
		
	}while(continua==1);
						
		
		System.out.println(pedido.getValorTotal());
		
						
			
			
		}
		
		
		
		
		
		
	}

