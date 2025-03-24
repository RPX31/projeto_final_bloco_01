package model;

public class Produto extends Marca{

	private String nome;
	private int numero;
	private float preco;

	public Produto(String nome, int numero, float preco, String marca) {
		super(marca);
		this.nome = nome;
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

	 @Override
	    public void exibirDetalhes() {
	        System.out.println("Produto: " + nome);
	        System.out.println("Número: " + numero);
	        System.out.println("Preço: R$" + preco);
	        System.out.println("Marca: " + getMarca());
	    }

}
