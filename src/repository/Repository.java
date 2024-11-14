package repository;

import java.util.List;

import model.Principal;

public interface Repository {

    
    void adicionarProduto(Principal produto);
    
    Principal buscarProdutoPorNumero(int numero);
    
    void atualizarProduto(Principal produto);

    
    void removerProduto(Principal produto);


	List<Principal> listarProduto();
}
