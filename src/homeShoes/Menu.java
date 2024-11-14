package homeShoes;
import java.util.Scanner;

public class Menu {

		public static void main(String[] args) {

			Scanner leia = new Scanner(System.in);

			int opcao;

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

				if (opcao == 0) {
					System.out.println("Obrigado por escolher a RPXShoes! Esperamos que sua experiência tenha sido incrível. Até a próxima!");
					sobre();
	                 leia.close();
					System.exit(0);
				}

				switch (opcao) {
					case 1:
						System.out.println("Criar Produto\n\n");

						break;
					case 2:
						System.out.println("Listar Todos os Produtos\n\n");

						break;
					case 3:
						System.out.println("Consultar Dados do Produto - Por Número\n\n");

						break;
					case 4:
						System.out.println("Atualizar Dados do Produto\n\n");

						break;
					case 5:
						System.out.println("Excluir Produto\n\n");

						break;
					
					
					default:
						System.out.println("\nOpção Inválida!\n");
						break;
				}
			}
		}
	    
		public static void sobre() {
			System.out.println("\n*********************************************************");
			System.out.println("Projeto Desenvolvido por:Rodrigo oliveira de Santana ");
			System.out.println("Generation Brasil - RodrigoS@generation.org");
			System.out.println("github.com/RPX31");
			System.out.println("*********************************************************");
		}
}

