package br.ufpb.sistemapedidos;

public class Contato2 {
	private String nome;
	private String telefone;
	
	public Contato2(String nome,String telefone){
		this.nome=nome;
		this.telefone=telefone;
	}
	public Contato2(){
		this("","");
	}
	public void setNome(String nome){
		this.nome=nome;
	}
	public String getNome(){
		return this.nome;
	}
	public void setTelefone(String telefone){
		this.telefone=telefone;
	}
	public String getTelefone(){
		return this.telefone;
	}
	
}
