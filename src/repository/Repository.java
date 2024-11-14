package repository;

import model.Principal;

public interface Repository {

    
    void adicionarProduto(Principal produto);

    
    Principal buscarProdutoPorNumero(int numero);
    
    
    void atualizarProduto(Principal produto);

    
    void removerProduto(Principal produto);
}
