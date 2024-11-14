package model;

public class Principal {
	
	private String nome;
	private int numero;
	private float preco;
	
	
	public Principal(String nome,int numero,float preco) {
		this.nome = nome ;
		this.numero = numero;
		this.preco = preco;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	
	  public void exibirDetalhes() {
	        System.out.println("Produto: " + nome + ", Número: " + numero + ", Preço: R$" + preco);
	    }
	
	
	

}
