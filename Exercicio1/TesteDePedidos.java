package POO;

public class TesteDePedidos {
	public  static void main(String []args){
		
		Pedido p1 = new Pedido(1);
		Pedido p2 = new Pedido(2);
		
		ItemDePedido item = new ItemDePedido(001,2, 2.00);
		ItemDePedido item2 = new ItemDePedido(001,1, 5.00);
		
		Cliente c = new Cliente("Lucas");
		
		ControleDePedidos controle = new ControleDePedidos();
		
		p1.setCliente(c);
		p2.setCliente(c);
		
		p1.adicionaItem(item);
		p2.adicionaItem(item2);
		
		controle.adicionaPedido(p1);
		controle.adicionaPedido(p2);
		
		
		System.out.println(controle.calculaQuantidadeDePedidosDoCliente("lucas"));
		
		
		
		
		
		
		
		
		
	}

}
