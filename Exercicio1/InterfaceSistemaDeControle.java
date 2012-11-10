

import java.util.*;

public interface InterfaceSistemaDeControle {
		
	public void adicionaPedido(Pedido p);
	List<Pedido> pesquisaPedidosIncluindoProduto(long codProduto);
	void removePedido(long numPedido);
	
	
	

}
