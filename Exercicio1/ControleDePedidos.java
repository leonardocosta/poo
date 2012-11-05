package POO;

import java.util.*;


public class ControleDePedidos implements InterfaceSistemaDeControle{
	
	List<Pedido>pedidos;
	
	public ControleDePedidos(){
		pedidos=new ArrayList<Pedido>();
	}

	
	public void adicionaPedido(Pedido p) {
		pedidos.add(p);
		
	}
	public int calculaQuantidadeDePedidosDoCliente(String nomeCliente){
		int cont=0;
		for(Pedido cliente : pedidos){
			if(cliente.getCliente().getNome().equals(nomeCliente)){
				cont++;
				
			}
		}
		return cont;
	}
	
	
	public void removePedido(long numPedido) {
		for(Pedido pd: pedidos){
			if(pd.getNumeroDoPedido()== numPedido){
				pedidos.remove(numPedido);

			}
		}
		
		
	}
	
	public List<Pedido> pesquisaPedidosIncluindoProduto(long codProduto){
		List<Pedido> ped = new ArrayList<Pedido>();
		for(Pedido pedido : pedidos){
			List<ItemDePedido> itens = pedido.getItens();
			for(ItemDePedido pItens: itens ){
				if(pItens.getCodProduto()==codProduto){
					ped.add(pedido);
				}
			}
				
		}
		return ped;

	}
}