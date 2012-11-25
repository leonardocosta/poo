package Exercicio6;

import java.io.IOException;
import java.io.Serializable;
import java.util.*;


public class ControleDePedidos implements InterfaceSistemaDeControle, Serializable{
	
	public List<Pedido> pedidos;
	GravadorDePedidos gravador = new GravadorDePedidos();
	
	public ControleDePedidos(){
		try{
			
			this.pedidos = gravador.lePedido();
		}catch(IOException erro){
			
			pedidos =new ArrayList<Pedido>();
		}
		
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
	
	
	public void removePedido(long numPedido) throws PedidoInexistenteExecption {
		for(Pedido pd: pedidos){
			if(pd.getNumeroDoPedido()== numPedido){
				pedidos.remove(numPedido);

			}
		}
		throw new PedidoInexistenteExecption("numero do pedido não encontrado");
		
		
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
	
	public void sairDoPrograma(){
		try{
			this.gravador.gravaPedido(pedidos);
		}catch(IOException erro){
			System.err.println("Não conseguiu gravar");
			
		}
	}
		
	
}
