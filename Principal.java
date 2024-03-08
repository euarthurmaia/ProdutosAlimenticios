import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner leitor;
		int resp = 0;
		int loopP = 1;
		leitor = new Scanner(System.in);
		List<Alimentos> ListaAlimentos;
		ListaAlimentos = new ArrayList<Alimentos>();

		while (loopP != 0) {
			System.out.println("1 - Cadastrar	2 - Excluir	  3 - Listar	4 - Sair");
			resp = leitor.nextInt();

			if (resp == 1) {
				int loop = 1;
				int respAlimento = 0;

				while (loop != 0) {
					System.out.println("");
					System.out.println("O Alimento é: 	1 - PERECIVEL		2 - NÃO PERECIVEL");
					respAlimento = leitor.nextInt();

					if (respAlimento == 1) {
						System.out.println("");
						System.out.println("Código: ");
						int ID = leitor.nextInt();
						System.out.println("Nome: ");
						leitor.nextLine();
						String Nome = leitor.nextLine();
						System.out.println("Fabricação: ");
						String Fabricacao = leitor.nextLine();
						System.out.println("Validade: ");
						String Validade = leitor.nextLine();
						System.out.println("Preço: ");
						float Preco = leitor.nextFloat();
						System.out.println("Tempo de Armazenamento Congelado: ");
						leitor.nextLine();
						String tempCongelado = leitor.nextLine();
						System.out.println("Sazonalidade: ");
						String sazonalidade = leitor.nextLine();
						System.out.println("Perda nutricional: ");
						String perdaNutricional = leitor.nextLine();
						System.out.println("Cadastrado com sucesso!");

						Perecivel P1 = new Perecivel(tempCongelado, sazonalidade, perdaNutricional);
						P1.PreencheDados(ID, Nome, Fabricacao, Validade, Preco);
						ListaAlimentos.add(P1);
					}
					loop = 0;

					if (respAlimento == 2) {
						System.out.println("");
						System.out.println("Código: ");
						int ID = leitor.nextInt();
						System.out.println("Nome: ");
						leitor.nextLine();
						String Nome = leitor.nextLine();
						System.out.println("Fabricação: ");
						String Fabricacao = leitor.nextLine();
						System.out.println("Validade: ");
						String Validade = leitor.nextLine();
						System.out.println("Preço: ");
						float Preco = leitor.nextFloat();
						System.out.println("Vida útil: ");
						leitor.nextLine();
						String vidaUtil = leitor.nextLine();
						System.out.println("Embalagem: ");
						String embalagem = leitor.nextLine();
						System.out.println("Cadastrado com sucesso!");

						NaoPerecivel NP1 = new NaoPerecivel(vidaUtil, embalagem);
						NP1.PreencheDados(ID, Nome, Fabricacao, Validade, Preco);
						ListaAlimentos.add(NP1);
					}
					loop = 0;
				}
			}

			else if (resp == 2) {
				int loop = 1;
				while (loop != 0) {
					int CodigoDELETE;
					int Confirmar = 0;
					System.out.println("");
					System.out.println("Digite o código do Alimento que deseja excluir: ");
					CodigoDELETE = leitor.nextInt();

					for (int qtd = 0; qtd < ListaAlimentos.size(); qtd++) {
						if (ListaAlimentos.get(qtd).getID() == CodigoDELETE) {
							System.out.println("Item excluído: ");
							ListaAlimentos.get(qtd).Exibedados();
							ListaAlimentos.remove(qtd);
							Confirmar = 1;
							break;
						}
					}
					if(Confirmar == 1) {
						System.out.println("Item excluído com sucesso!");
						System.out.println("");
					}
					else {
						System.out.println("Item não encontrado!");
						System.out.println("");
					}
					loop = 0;
				}
			}

			else if (resp == 3) {
				int loop = 1;
				while (loop != 0) {
					if (ListaAlimentos.isEmpty()) {
						System.out.println("Lista de Alimentos Vazia.");
						break;
					} else {
						System.out.println("Lista de Alimentos:");
						int qtdP = 0;
						int qtdNP = 0;
						for (int qtd = 0; qtd < ListaAlimentos.size(); qtd++) {
							ListaAlimentos.get(qtd).Exibedados();
							if (ListaAlimentos.get(qtd).getTipo() == TipoAlimento.PERECIVEL) {
								qtdP++;
							} else if (ListaAlimentos.get(qtd).getTipo() == TipoAlimento.NAO_PERECIVEL) {
								qtdNP++;
							}
						}
						System.out.println("");
						System.out.println("Quantidade de Perecivel: " + qtdP);
						System.out.println("Quantidade de Não Perecivel: " + qtdNP);
						System.out.println("");
						loop = 0;
					}
				}
			}

			else {
				System.out.println("Sistema fechado.");
				System.exit(0);
			}
		}
		leitor.close();
	}
}
