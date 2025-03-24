package repository;

import java.util.List;

import model.Produto;

public interface Repository {

    
    void adicionarProduto(Produto produto);
    
    Produto buscarProdutoPorNumero(int numero);
    
    void atualizarProduto(Produto produto);

    
    void removerProduto(Produto produto);


	List<Produto> listarProduto();
}
