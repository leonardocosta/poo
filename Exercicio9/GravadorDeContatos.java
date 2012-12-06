package Exercicio9;

	import java.util.*;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.util.List;

public class GravadorDeContatos {
	
	public List<Contato> leContato()throws  IOException {
		ObjectInputStream entrada = null;
		
		try{
			 entrada = new ObjectInputStream(new FileInputStream("Agenda.txt"));
			 return (List<Contato>) entrada.readObject();
			 
		}catch(FileNotFoundException erro){
			throw new IOException(" Não encontrou a agenda.txt");
			
		} catch (ClassNotFoundException e) {
			throw new IOException ();
		}
		finally{
			if(entrada != null){
				entrada.close();
			}
		}
		
		
	}
	public void gravaContatos(List<Contato> contato)throws IOException{
		
		ObjectOutputStream saida = null;
		
		try{
			
			saida= new ObjectOutputStream(new FileOutputStream("Agenda.txt"));
			saida.writeObject(contato);
			
		}catch(FileNotFoundException e){
			
			throw new IOException(e.getMessage());
			
		}catch(IOException erro){
			
			throw new IOException (erro.getMessage());
			
		}finally{
			if(saida!= null){
				saida.close();
			}
		}
	}
		
	
	public Map<String,Contato> leContatoMap()throws  IOException {
		ObjectInputStream in = null;
		
		try{
			 in = new ObjectInputStream(new FileInputStream("AgendaMap.txt"));
			 return (Map<String,Contato>) in.readObject();
			 
		}catch(FileNotFoundException erro){
			throw new IOException(" Não encontrou a agendaMap.txt");
			
		} catch (ClassNotFoundException erro) {
			throw new IOException ();
		}
		finally{
			if(in != null){
				in.close();
			}
		}
		
		
	}
	public void gravaContatosMap(Map<String,Contato> contato)throws IOException{
		
		ObjectOutputStream out = null;
		
		try{
			
			out= new ObjectOutputStream(new FileOutputStream("AgendaMap.txt"));
			out.writeObject(contato);
			
		}catch(FileNotFoundException e){
			
			throw new IOException(e.getMessage());
			
		}catch(IOException erro){
			
			throw new IOException (erro.getMessage());
			
		}finally{
			if(out!= null){
				out.close();
			}
		}
	}
		
	
	

}




