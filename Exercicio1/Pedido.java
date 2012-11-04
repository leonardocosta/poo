package POO;

import java.util.*;



public class Pedido {
	
	private long numeroDoPedido;
	private Cliente cliente;
	private List<ItemDePedido> itens;
	
	
	public Pedido(long numeroDoPedido){
		this.numeroDoPedido= numeroDoPedido;
		itens = new ArrayList<ItemDePedido>(); 
		
	}
	
	public List<ItemDePedido> getItens(){
		return itens;
	}
	public void adicionaItem(ItemDePedido item){
		itens.add(item);
	}
	public long getNumeroDoPedido(){
		return this.numeroDoPedido;
	}
	public void setNumeroDoPedido(long numeroDoPedido){
		this.numeroDoPedido=numeroDoPedido;
		
	}
	public Cliente getCliente(){
		return this.cliente;
	}
	public void setCliente(Cliente c){
		this.cliente=c;
		
	}
}
