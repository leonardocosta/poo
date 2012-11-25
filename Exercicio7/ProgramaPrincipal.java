package Exercicio7;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class ProgramaPrincipal {
	public static void main(String [] args) {
					
		
		AgendaIf agenda = null;
		boolean continua = false;
		String opcao= null;
		
		do{
		     opcao = JOptionPane.showInputDialog("Digite\n 1 P/ Map,\n 2 p/ List.");
			
			if(opcao.equals("1")){
				agenda= new AgendaMap();
				continua=true;
			}
			else if(opcao.equals("2")){
				agenda = new Agenda();
				continua=true;
			}
			else{
				JOptionPane.showMessageDialog(null,"não escolheu nenhuma agenda...");
			}
			
					
		}while(continua!=true);
		
		
		do{			
			int escolha =Integer.parseInt(JOptionPane.showInputDialog("Digite \n 1: p/ adiciona,\n 2: p/ remover,\n" +
					" 3: p/ consultar Contatos,\n 4: p/ sair."));
					
			switch(escolha){
				
			case 1:
				String nome = JOptionPane.showInputDialog("Digite o nome do Contato: ");
				String tel = JOptionPane.showInputDialog("Digite o telefone do Contato: ");
				agenda.adiciona(nome, tel);
				JOptionPane.showMessageDialog(null, nome+ " adicionado ");
				break;
			
			case 2:
				
				String nome_remove = JOptionPane.showInputDialog("Digite o nome do Contato: ");
				try{
					agenda.remove(nome_remove);
					JOptionPane.showMessageDialog(null, nome_remove+" removido ");
													
				}catch(ContatoInexistenteException erro){
					JOptionPane.showMessageDialog(null,erro.getMessage());
				}
				break;
				
			case 3:
				String nome_pesquisa = JOptionPane.showInputDialog("Digite o nome do Contato que deseja pesquisar: ");
				try{
				
					JOptionPane.showMessageDialog(null,agenda.pesquisaContato(nome_pesquisa));
									
				}catch(ContatoInexistenteException erro){
					System.err.println(erro.getMessage());
				}
				
				break;
				
			case 4: 
				JOptionPane.showMessageDialog(null,"OBrigado e Volte Sempre!");
				
				if(opcao.equals("1")){
					((AgendaMap)agenda).sairDoSistema();
			    	}else{
				     ((Agenda) agenda).sairDoSistema();
			    }
				continua = false;
				break;
			}
			
		
			
		}while(continua!= false);
		
		}
		
		
	}


