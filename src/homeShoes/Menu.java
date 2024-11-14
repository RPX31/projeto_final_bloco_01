package homeShoes;

import repository.Repository;
import repository.RepositoryImpl;
import model.Principal;
import java.util.Scanner;
import java.util.List;

public class Menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Repository repository = new RepositoryImpl(); 
        String nome;
        int opcao, numero;
        float preco;

        while (true) {

            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("                      RPXSHOES                       ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("                                                     ");
            System.out.println("            1 - Adicionar Produto                    ");
            System.out.println("            2 - Listar Todos Produtos                ");
            System.out.println("            3 - Buscar Produto por Número            ");
            System.out.println("            4 - Atualizar Dados do Produto           ");
            System.out.println("            5 - Excluir Produto                      ");
            System.out.println("            0 - Sair                                 ");
            System.out.println("                                                     ");
            System.out.println("*****************************************************");
            System.out.println("              Entre com a opção desejada:            ");
            System.out.println("                                                     ");

            opcao = leia.nextInt();
            leia.nextLine(); 

            if (opcao == 0) {
                System.out.println("Obrigado por escolher a RPXShoes! Esperamos que sua experiência tenha sido incrível. Até a próxima!");
                sobre();
                leia.close();
                System.exit(0);
            }

            switch (opcao) {
                case 1:
                    
                    System.out.println("Adicionar Produto\n\n");
                    System.out.println("Digite o nome do Produto: ");
                    nome = leia.nextLine();
                    System.out.println("Digite o Número para o Produto: ");
                    numero = leia.nextInt();
                    System.out.println("Digite o preço do Produto: ");
                    preco = leia.nextFloat();

                    
                    Principal produto = new Principal(nome, numero, preco);
                    repository.adicionarProduto(produto);

                    break;

                case 2:
                    
                    System.out.println("Listar Todos os Produtos\n\n");
                    List<Principal> produtos = repository.listarProduto();
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto disponível.");
                    } else {
                        for (Principal p : produtos) {
                            System.out.println("Produto: " + p.getNome() + ", Número: " + p.getNumero() + ", Preço: R$" + p.getPreco());
                        }
                    }
                    break;

                case 3:
                    
                    System.out.println("Consultar Dados do Produto - Por Número\n\n");
                    System.out.println("Digite o número do produto: ");
                    numero = leia.nextInt();
                    Principal produtoEncontrado = repository.buscarProdutoPorNumero(numero);
                    if (produtoEncontrado != null) {
                        System.out.println("Produto encontrado: " + produtoEncontrado.getNome() + ", Número: " + produtoEncontrado.getNumero() + ", Preço: R$" + produtoEncontrado.getPreco());
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                   
                    System.out.println("Atualizar Dados do Produto\n\n");
                    System.out.println("Digite o número do produto para atualizar: ");
                    numero = leia.nextInt();
                    leia.nextLine(); 
                    System.out.println("Digite o novo nome do Produto: ");
                    nome = leia.nextLine();
                    System.out.println("Digite o novo preço do Produto: ");
                    preco = leia.nextFloat();

                    
                    Principal produtoAtualizado = new Principal(nome, numero, preco);
                    repository.atualizarProduto(produtoAtualizado);
                    break;

                case 5:
                    
                    System.out.println("Excluir Produto\n\n");
                    System.out.println("Digite o número do produto para excluir: ");
                    numero = leia.nextInt();
                    Principal produtoExcluir = repository.buscarProdutoPorNumero(numero);
                    if (produtoExcluir != null) {
                        repository.removerProduto(produtoExcluir);
                    } else {
                        System.out.println("Produto não encontrado para exclusão.");
                    }
                    break;

                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Rodrigo Oliveira de Santana ");
        System.out.println("Generation Brasil - RodrigoS@generation.org");
        System.out.println("github.com/RPX31");
        System.out.println("*********************************************************");
    }
}
