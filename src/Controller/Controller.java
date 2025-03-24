package Controller;

import java.util.ArrayList;
import java.util.List;

import model.Produto;
import repository.Repository;

public class Controller implements Repository {

	
	
private List<Produto> produtos= new ArrayList<>();

    
       
    

    @Override
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto " + produto.getNome() + " adicionado.");
    }

    @Override
    public Produto buscarProdutoPorNumero(int numero) {
        for (Produto produto : produtos) {
            if (produto.getNumero() == numero) {
                return produto;
            }
        }
        return null; // 
    }

    @Override
    public void removerProduto(Produto produto) {
        if (produtos.remove(produto)) {
            System.out.println("Produto " + produto.getNome() + " removido.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

	@Override
	public void atualizarProduto(Produto produto) {
		Produto produtoExistente = buscarProdutoPorNumero(produto.getNumero());
        
        if (produtoExistente != null) {
            produtoExistente.setNome(produto.getNome()); 
            produtoExistente.setPreco(produto.getPreco()); 
            System.out.println("Produto " + produto.getNome() + " atualizado.");
        } else {
            System.out.println("Produto não encontrado para atualização.");
        }
		
		
	}

	@Override
    public List<Produto> listarProduto() {
        return produtos;
        }

	
	
}




