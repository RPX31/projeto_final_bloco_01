package repository;

import java.util.ArrayList;
import java.util.List;

import model.Principal;

public class RepositoryImpl implements Repository {

    
    private List<Principal> produtos= new ArrayList<>();

    
       
    

    @Override
    public void adicionarProduto(Principal produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado.");
    }

    @Override
    public Principal buscarProdutoPorNumero(int numero) {
        for (Principal produto : produtos) {
            if (produto.getNumero() == numero) {
                return produto;
            }
        }
        return null; // 
    }

    @Override
    public void removerProduto(Principal produto) {
        if (produtos.remove(produto)) {
            System.out.println("Produto " + produto.getNome() + " removido.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

	@Override
	public void atualizarProduto(Principal produto) {
		Principal produtoExistente = buscarProdutoPorNumero(produto.getNumero());
        
        if (produtoExistente != null) {
            produtoExistente.setNome(produto.getNome()); 
            produtoExistente.setPreco(produto.getPreco()); 
            System.out.println("Produto " + produto.getNome() + " atualizado.");
        } else {
            System.out.println("Produto não encontrado para atualização.");
        }
		
		
	}

	@Override
    public List<Principal> listarProduto() {
        return produtos;
        }
}
