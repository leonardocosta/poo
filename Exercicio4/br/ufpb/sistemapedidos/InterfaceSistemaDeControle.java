package br.ufpb.sistemapedidos;

import java.util.List;
/**
 * 
 * @author Ayla
 * @version 1.0
 */

public interface InterfaceSistemaDeControle {
	/**
	 * o metodo que adiciona um pedido
	 * @param p  recebe um pedido feito pelo cliente
	 */
	public void adicionaPedido(Pedido p);
	
	
	/**
	 * o metodo pesquisa o código do produto em uma lista de pedido
	 * @param codProduto recebe o código do produto
	 * @return e retorna o produto procurado
	 */
	public List <Pedido> pesquisaPedidosIncluindoProduto(String codProduto);
	
	
	/**
	 * o metodo remove o número do pedido 
	 * @param numeroPedido recebe o número do pedido 
	 */
	public void removePedido(long numeroPedido);
}
