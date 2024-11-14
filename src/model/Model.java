package model;

public class Model extends Principal {

    private String marca;

    
    public Model(String nome, int numero, float preco, String marca) {
        super(nome, numero, preco); 
        this.marca = marca;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); 
        System.out.println("Marca: " + marca);
    }
}
