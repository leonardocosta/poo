package Exercicio6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

public class GravadorDePedidos {
	
	public List<Pedido> lePedido() throws IOException{
		ObjectInputStream entrada = null;
		
		try{
			
			entrada = new ObjectInputStream (new FileInputStream("Pedido.txt"));
			return (List<Pedido>) entrada.readObject();
		
		}catch(FileNotFoundException erro){
			throw new IOException("Não encontrou o arquivo Pedido");
			
		}catch (ClassNotFoundException e) {
			throw new IOException ();
		}
		finally{
			if(entrada != null){
				entrada.close();
		}
	}
}
	public void gravaPedido(List<Pedido> pedidos)throws IOException{
			
		ObjectOutputStream saida = null;
		
		try{
			saida = new ObjectOutputStream (new FileOutputStream("Pedido.txt"));
			saida.writeObject(pedidos);
			
		}catch(FileNotFoundException erro){
			throw new IOException (erro.getMessage());
					
		}
		catch(IOException erro){
			throw new IOException (erro.getMessage());
					
		}finally{
			if(saida!=null){
				saida.close();
			}
		}
		
	}

	
}