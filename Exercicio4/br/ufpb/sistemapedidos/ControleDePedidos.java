package br.ufpb.sistemapedidos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author Ayla
 * @version 1.0
 */

public class ControleDePedidos implements InterfaceSistemaDeControle {
	
	private List <Pedido> pedidos;
	
	/**
	 * construtor que inicia a lista de pedidos
	 */
	
	public ControleDePedidos(){
		this.pedidos = new ArrayList<Pedido>();
	}
	
	/**
	 * calcula a quantidade de um pedido de um certo cliente
	 * @param nomeCliente recebe o nome do cliente
	 * @return retorna a quantidade de pedido feito pelo cliente
	 */
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
		
		int cont = 0;
		for (Pedido p: this.pedidos){
			if (p.getCliente().getNome().equals(nomeCliente)){
				cont++;
			}
		}
		return cont;
	}
	
	
	/**
	 * adiciona na lista de pedidos um pedido 
	 */
	public void adicionaPedido(Pedido p) {
		this.pedidos.add(p);

	}

	/**
	 * o metodo pesquisa na lista o codigo de um determinado produto
	 * @return retorna o produto procurado
	 */
	public List<Pedido> pesquisaPedidosIncluindoProduto(String codProduto) {
		List <Pedido> pedidosProcurados = new LinkedList<Pedido>();
		for (Pedido p: this.pedidos){
			List<ItemDePedido> itens = p.getItens();
			for (ItemDePedido it: itens){
				if (it.getCodProduto().equals(codProduto)){
					pedidosProcurados.add(p);
				}
			}
		}
		//TODO: ajeitar para verificar itens repetidos
		return pedidosProcurados;
	}

	/**
	 * o metodo remove o numero de um pedido feito
	 * 
	 */
	public void removePedido(long numeroPedido) {
		for (Pedido p: this.pedidos){
			if (p.getNumeroPedido()== numeroPedido){
				this.pedidos.remove(p);
				break;
			}
		}

	}

}
