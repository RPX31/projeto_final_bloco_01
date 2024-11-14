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
				System.out.println("            1 - Criar Conta                          ");
				System.out.println("            2 - Listar todas as Contas               ");
				System.out.println("            3 - Buscar Conta por Numero              ");
				System.out.println("            4 - Atualizar Dados da Conta             ");
				System.out.println("            5 - Apagar Conta                         ");
				System.out.println("            0 - Sair                                 ");
				System.out.println("                                                     ");
				System.out.println("*****************************************************");
				System.out.println("Entre com a opção desejada:                          ");
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
						System.out.println("Criar Conta\n\n");

						break;
					case 2:
						System.out.println("Listar todas as Contas\n\n");

						break;
					case 3:
						System.out.println("Consultar dados da Conta - por número\n\n");

						break;
					case 4:
						System.out.println("Atualizar dados da Conta\n\n");

						break;
					case 5:
						System.out.println("Apagar a Conta\n\n");

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

