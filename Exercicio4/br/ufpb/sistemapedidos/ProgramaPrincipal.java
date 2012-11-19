package br.ufpb.sistemapedidos;

import java.util.Scanner;
import java.util.InputMismatchException;

public class ProgramaPrincipal {
	public static void main(String [] args){
		Scanner teclado = new Scanner(System.in);
		
		Pedido pedido = new Pedido(01);
		ItemDePedido item;
		
		boolean continua=false;
		String codigo = null;
		
	
		do{
			try{
				System.out.println("Digite o código do Produto: ");
				codigo = teclado.next();
							
				System.out.println("Quantidade de item: ");
				String quantidade = teclado.next();
						
				System.out.println("Valor o unitário do ítem: ");
				String valor = teclado.next();
				
				item = new ItemDePedido (codigo,Integer.parseInt(quantidade),Integer.parseInt(valor));
				pedido.adicionaItem(item);
				
				if(codigo.equals("0")){
					continua=true;
				}
					
			}catch(NumberFormatException erro){
				System.out.println("valor inválido, Digite novamente: ");
				System.out.println("");
				}
			
				
				
		}while(continua!=true);
						
		
		System.out.println("valor é: R$ "+ pedido.getValorTotal());
		
						
			
			
		
	}

}