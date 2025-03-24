package homeShoes;

import java.util.List;
import java.util.Scanner;

import Controller.Controller;
import model.Produto;
import repository.Repository;

public class Menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        Repository repository = new Controller(); 
        String nome, marca;
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
            
            while (true) {
                try {
                    opcao = Integer.parseInt(leia.nextLine());
                    if (opcao >= 0 && opcao <= 5) {
                        break;
                    } else {
                        System.out.println("Opção inválida. Por favor, escolha uma opção entre 0 e 5.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número de 0 a 5.");
                }
            }
            if (opcao == 0) {
                System.out.println("Obrigado por escolher a RPXShoes! Esperamos que sua experiência tenha sido incrível. Até a próxima!");
                sobre();
                leia.close();
                
            }
            switch (opcao) {
                case 1:
                    System.out.println("Adicionar Produto\n\n");
                    
                    while (true) {
                        System.out.println("Digite o nome do Produto: ");
                        nome = leia.nextLine();
                        if (!nome.isEmpty()) {
                            break;
                        } else {
                            System.out.println("O nome do produto não pode ser vazio. Tente novamente.");
                        }
                    }
                    while (true) {
                        try {
                            System.out.println("Digite o Número para o Produto: ");
                            numero = Integer.parseInt(leia.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, insira um número válido.");
                        }
                    }

                    while (true) {
                        try {
                            System.out.println("Digite o preço do Produto: ");
                            preco = Float.parseFloat(leia.nextLine().replace(',', '.'));
                            if (preco > 0) {
                                break;
                            } else {
                                System.out.println("O preço deve ser um valor positivo. Tente novamente.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, insira um preço válido.");
                        }
                    }


                    System.out.println("Digite a marca do Produto: ");
                    marca = leia.nextLine();

                    Produto produto = new Produto(nome, numero, preco, marca);
                    repository.adicionarProduto(produto);
                   break;

                case 2:
                    System.out.println("Listar Todos os Produtos\n\n");
                    List<Produto> produtos = repository.listarProduto();
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto disponível.");
                    } else {
                        for (Produto p : produtos) {
                            System.out.println("Produto:  " + p.getNome() + "\n" + "Número:  " + p.getNumero() +"\n" + "Preço: R$  " + p.getPreco() + "\n" + "Marca do Produto:  " + p.getMarca() );
                        }
                    }
                    break;
                case 3:
                    System.out.println("Consultar Dados do Produto - Por Número\n\n");

                    while (true) {
                        try {
                            System.out.println("Digite o número do produto: ");
                            numero = Integer.parseInt(leia.nextLine());
                            Produto produtoEncontrado = repository.buscarProdutoPorNumero(numero);
                            if (produtoEncontrado != null) {
                                System.out.println("Produto encontrado: " + produtoEncontrado.getNome() + "\n " + ", Número: " + produtoEncontrado.getNumero() + "\n " + ", Preço: R$" + produtoEncontrado.getPreco() + "\n " + produtoEncontrado.getMarca());
                            } else {
                                System.out.println("Produto não encontrado.");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, insira um número válido.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Atualizar Dados do Produto\n\n");

                    while (true) {
                        try {
                            System.out.println("Digite o número do produto para atualizar: ");
                            numero = Integer.parseInt(leia.nextLine());
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, insira um número válido.");
                        }
                    }

                    System.out.println("Digite o novo nome do Produto: ");
                    nome = leia.nextLine();

                    while (true) {
                        try {
                            System.out.println("Digite o novo preço do Produto: ");
                            preco = Float.parseFloat(leia.nextLine().replace(',', '.'));
                            if (preco > 0) {
                                break;
                            } else {
                                System.out.println("O preço deve ser um valor positivo. Tente novamente.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, insira um preço válido.");
                        }
                    }

                    System.out.println("Digite a nova marca do Produto: ");
                    marca = leia.nextLine();

                    Produto produtoAtualizado = new Produto(nome, numero, preco, marca);
                    repository.atualizarProduto(produtoAtualizado);
                    break;
                case 5:
                    System.out.println("Excluir Produto\n\n");

                    while (true) {
                        try {
                            System.out.println("Digite o número do produto para excluir: ");
                            numero = Integer.parseInt(leia.nextLine());
                            Produto produtoExcluir = repository.buscarProdutoPorNumero(numero);
                            if (produtoExcluir != null) {
                                repository.removerProduto(produtoExcluir);
                            } else {
                                System.out.println("Produto não encontrado para exclusão.");
                            }
                            break;
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, insira um número válido.");
                        }
                    }
                    break;

                default:
                    System.out.println("\nOpção Inválida!\n");
                    break;
            }
        }
    }

    public static void sobre() {
        System.out.println("\n\n\n*********************************************************");
        System.out.println("Projeto Desenvolvido por: Rodrigo Oliveira de Santana ");
        System.out.println("Generation Brasil - RodrigoS@generation.org");
        System.out.println("github.com/RPX31");
        System.out.println("*********************************************************");
        
    }
    
    
}
