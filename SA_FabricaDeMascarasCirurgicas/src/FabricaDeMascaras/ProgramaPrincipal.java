package FabricaDeMascaras;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//Ler o teclado
		
		int contCliente = 0; //Contador de Clientes cadastrados
		
		int menu;//Opção de repetição do ciclo
		
		int i = 0; //Índece
		
		//Lista de cadastros
		ArrayList<Cliente> listCliente = new ArrayList<>();
		ArrayList<Funcionario> listFuncionario = new ArrayList<>();
		
		//Ínstancia de Classes
		Cliente clienteCadastro = new Cliente();
		Funcionario funcionarioCadastro = new Funcionario();
		Estoque codMateriais = new Estoque();
		
		
		int idCliente = 0;
		int idFuncionario = 0;
		
		do //Inicializando Ciclo de repetição
        {
			
			System.out.println("\n\n\n    ****************************************************");
			System.out.println("    *                   MENU PRINCIPAL                 *");
			System.out.println("    *                                                  *");
			System.out.println("    *                1- MANTER CLIENTE                 *");
			System.out.println("    *                2- MANTER FUNCIONARIO             *");
			System.out.println("    *                3- MATERIAIS                      *");
			System.out.println("    *                4- RECEITAS CADASTRADAS           *");
			System.out.println("    *                5- CONSULTA                       *");
			System.out.println("    ****************************************************\n\n");
			
			System.out.print("    Digite a opção desejada no menu:  ");
            int respostaMenu = scan.nextInt(); //Opção do menu
			
            switch (respostaMenu) //Decisão do menu
            {
            
                case 1: //Decisão
                	
                	System.out.println("\n\n    ==================================");
                	System.out.println("    ******** CADASTRAR CLIENTE *******");
                	System.out.println("    ==================================\n\n\n");
                	
                	
                	
                	
                	for (i=0; i<99999; i++) {
                		
                		idCliente = i;
						System.out.println("\n\nID: " + idCliente +"\n");
						clienteCadastro.setIdCliente(idCliente);
						
						System.out.print("\nNome: ");
						String nome = scan.next();
						clienteCadastro.setNome(nome);
						
						System.out.print("\nCPF: ");
						int cpf = scan.nextInt();
						clienteCadastro.setCpf(cpf);
						
						System.out.print("\nIdade: ");
						int idade = scan.nextInt();
						clienteCadastro.setIdade(idade);
						 
						System.out.print("\nTelefone: ");
						int telefone = scan.nextInt();
						clienteCadastro.setTelefone(telefone);
						 
						
						System.out.println("\n\nInsira seu Endereço.");
						
						System.out.print("\nRua: ");
						String rua = scan.next();
						clienteCadastro.setRua(rua);
						
						System.out.print("Bairro: ");
						String bairro = scan.next();
						clienteCadastro.setBairro(bairro);
						
						System.out.print("Número: ");
						int numero = scan.nextInt();
						clienteCadastro.setNumero(numero);
						
						System.out.print("Cidade: ");
						String cidade = scan.next();
						clienteCadastro.setCidade(cidade);
						
						System.out.print("Estado: ");
						String estado = scan.next();
						clienteCadastro.setEstado(estado);
						
						System.out.print("\nE-mail: ");
						String email = scan.next();
						clienteCadastro.setEmail(email);
						
						
                		listCliente.add(i,clienteCadastro);//Adicionar os dados lidos no ArrayList
                		
                		
                		System.out.println("\n\nDeseja cadastrar mais clientes ? ");
                		System.out.println("Opção 1 - sim");
                		System.out.println("Opção 2 - não");
                		System.out.print("\nOpção: ");
                		int repita = scan.nextInt();
                		
                		if (repita == 2) {
                			break; //Fim da estrutura de repetição
                		}
                	}
			
                	
                	for (Cliente c : listCliente) {
                		System.out.println(c);
                	}
                	
                	
                	
                
                	
                	break;
                	
                case 2:
                	
                	
                	System.out.println("\n\n    ======================================");
                	System.out.println("    ******** CADASTRAR FUNCIONARIO *******");
                	System.out.println("    ======================================\n");
                	
                	
                	
                	
                	for (i=0; i<99999; i++) {
                		
                		idFuncionario = i;
						System.out.println("\n\nID: " + idFuncionario +"\n");
						funcionarioCadastro.setIdFuncionario(idFuncionario);
						
						System.out.print("\nNome: ");
						String nome = scan.next();
						funcionarioCadastro.setNome(nome);
						
						System.out.print("\nCPF: ");
						int cpf = scan.nextInt();
						funcionarioCadastro.setCpf(cpf);
						
						System.out.print("\nCargo: ");
						String cargo = scan.next();
						funcionarioCadastro.setCargo(cargo);
						
						System.out.print("\nIdade: ");
						int idade = scan.nextInt();
						funcionarioCadastro.setIdade(idade);
						 
						System.out.print("\nTelefone: ");
						int telefone = scan.nextInt();
						funcionarioCadastro.setTelefone(telefone);
						 
						
						System.out.println("\n\nInsira seu Endereço.");
						
						System.out.print("\nRua: ");
						String rua = scan.next();
						funcionarioCadastro.setRua(rua);
						
						System.out.print("Bairro: ");
						String bairro = scan.next();
						funcionarioCadastro.setBairro(bairro);
						
						System.out.print("Número: ");
						int numero = scan.nextInt();
						funcionarioCadastro.setNumero(numero);
						
						System.out.print("Cidade: ");
						String cidade = scan.next();
						funcionarioCadastro.setCidade(cidade);
						
						System.out.print("Estado: ");
						String estado = scan.next();
						funcionarioCadastro.setEstado(estado);
						
						System.out.print("\nE-mail: ");
						String email = scan.next();
						funcionarioCadastro.setEmail(email);
						
						
                		listFuncionario.add(funcionarioCadastro);
                		
                		
                		System.out.println("\n\nDeseja cadastrar mais Funcionarios ? ");
                		System.out.println("Opção 1 - sim");
                		System.out.println("Opção 2 - não");
                		System.out.print("\nOpção: ");
                		int repita = scan.nextInt();
                		
                		if (repita == 2) {
                			break; //Fim da estrutura de repetição
                		}
                	}
                	
                	
                	break;
                	
                case 3:
                	
                	System.out.println("\n\n    ==========================");
                	System.out.println("    ******** MATERIAIS *******");
                	System.out.println("    ==========================\n\n");
                	
                	
                	System.out.println("    1 - Materias em estoque.");
                	System.out.println("    2 - Comprar materias (Fornecedor).");
                	System.out.print("    Opção: ");
                	int opcao = scan.nextInt();
                	
                	switch (opcao) {
                	
                	case 1: 
                		
                		System.out.println("\n\n    =====================================");
                    	System.out.println("    ******** MATERIAIS EM ESTOQUE *******");
                    	System.out.println("    =====================================\n\n");
                		
                		System.out.println("Nome: TNT (6 unidade)");
                		System.out.println("Codigo: "+ codMateriais.getTNT());
                		System.out.println("Quantidade: "+ codMateriais.getQtdTNT());
                		
                		
                		System.out.println("\nNome: SMS (6 unidades)");
                		System.out.println("Codigo: "+ codMateriais.getSMS());
                		System.out.println("Quantidade: "+ codMateriais.getQtdSMS());
                		
                		System.out.println("\nNome: Clip Nasal (6 unidades)");
                		System.out.println("Codigo: "+ codMateriais.getClipNasal());
                		System.out.println("Quantidade: "+ codMateriais.getQtdClipNasal());
                		
                		System.out.println("\nNome: Caixa de elástico (1 unidade)");
                		System.out.println("Codigo: "+ codMateriais.getCaixaElástico());
                		System.out.println("Quantidade: "+ codMateriais.getQtdCaixaElástico());
                		
                		System.out.println("\nNome: Caixa 50 unidades de mascaras (200 unidades)");
                		System.out.println("Codigo: "+ codMateriais.getCaixaUnidade());
                		System.out.println("Quantidade: "+ codMateriais.getQtdCaixaUnidade());
                		
                		System.out.println("\nNome: Caixa Master (10 unidades)");
                		System.out.println("Codigo: "+ codMateriais.getCaixaMaster());
                		System.out.println("Quantidade: "+ codMateriais.getQtdCaixaMaster());
                    	
                    	
                		
                	}
                	
					
						
					
					
                	
                	
                	
                	
                	
                	
                	
            }
			System.out.print("\n\n  Digite '1' para voltar ao menu ou '2' para sair do programa: ");
            menu = scan.nextInt(); //Voltar ciclo de repetição do menu (do while)
        }
        while (menu == 1); //Voltar ciclo de repetição

	}

}
