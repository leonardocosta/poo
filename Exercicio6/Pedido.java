package Exercicio6;
import java.util.*;



public class Pedido{
	
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
	public double getValorTotal(){
		int contador=0;
		for(int i=0; i<itens.size();i++){
			ItemDePedido itens = this.itens.get(i);
			contador+=itens.getSubTotal();
			
		}
		
		return contador;
	}
	
	public String toString(){
		return "Cliente: " + this.cliente.getNome() + "\n Número do pedido: " + this.numeroDoPedido + "\n valor : " + this.itens.toString();
	}
}
