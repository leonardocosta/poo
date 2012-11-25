package Exercicio6;

import java.util.*;

public interface InterfaceSistemaDeControle {
		
	public void adicionaPedido(Pedido p);
	List<Pedido> pesquisaPedidosIncluindoProduto(long codProduto);
	public void removePedido(long numPedido)throws PedidoInexistenteExecption;
	
	
	

}
