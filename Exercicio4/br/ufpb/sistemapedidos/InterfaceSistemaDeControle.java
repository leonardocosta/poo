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
	 * o metodo pesquisa o c�digo do produto em uma lista de pedido
	 * @param codProduto recebe o c�digo do produto
	 * @return e retorna o produto procurado
	 */
	public List <Pedido> pesquisaPedidosIncluindoProduto(String codProduto);
	
	
	/**
	 * o metodo remove o n�mero do pedido 
	 * @param numeroPedido recebe o n�mero do pedido 
	 */
	public void removePedido(long numeroPedido);
}
