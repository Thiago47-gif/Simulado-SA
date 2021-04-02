package FabricaDeMascaras;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//Ler o teclado
		
		int contCliente = 0; //Contador de Clientes cadastrados
		
		int menu;//Op��o de repeti��o do ciclo
		
		int i = 0; //�ndece
		
		//Lista de cadastros
		ArrayList<Cliente> listCliente = new ArrayList<>();
		ArrayList<Funcionario> listFuncionario = new ArrayList<>();
		
		//�nstancia de Classes
		Cliente clienteCadastro = new Cliente();
		Funcionario funcionarioCadastro = new Funcionario();
		Estoque codMateriais = new Estoque();
		
		
		int idCliente = 0;
		int idFuncionario = 0;
		
		do //Inicializando Ciclo de repeti��o
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
			
			System.out.print("    Digite a op��o desejada no menu:  ");
            int respostaMenu = scan.nextInt(); //Op��o do menu
			
            switch (respostaMenu) //Decis�o do menu
            {
            
                case 1: //Decis�o
                	
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
						 
						
						System.out.println("\n\nInsira seu Endere�o.");
						
						System.out.print("\nRua: ");
						String rua = scan.next();
						clienteCadastro.setRua(rua);
						
						System.out.print("Bairro: ");
						String bairro = scan.next();
						clienteCadastro.setBairro(bairro);
						
						System.out.print("N�mero: ");
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
                		System.out.println("Op��o 1 - sim");
                		System.out.println("Op��o 2 - n�o");
                		System.out.print("\nOp��o: ");
                		int repita = scan.nextInt();
                		
                		if (repita == 2) {
                			break; //Fim da estrutura de repeti��o
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
						 
						
						System.out.println("\n\nInsira seu Endere�o.");
						
						System.out.print("\nRua: ");
						String rua = scan.next();
						funcionarioCadastro.setRua(rua);
						
						System.out.print("Bairro: ");
						String bairro = scan.next();
						funcionarioCadastro.setBairro(bairro);
						
						System.out.print("N�mero: ");
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
                		System.out.println("Op��o 1 - sim");
                		System.out.println("Op��o 2 - n�o");
                		System.out.print("\nOp��o: ");
                		int repita = scan.nextInt();
                		
                		if (repita == 2) {
                			break; //Fim da estrutura de repeti��o
                		}
                	}
                	
                	
                	break;
                	
                case 3:
                	
                	System.out.println("\n\n    ==========================");
                	System.out.println("    ******** MATERIAIS *******");
                	System.out.println("    ==========================\n\n");
                	
                	
                	System.out.println("    1 - Materias em estoque.");
                	System.out.println("    2 - Comprar materias (Fornecedor).");
                	System.out.print("    Op��o: ");
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
                		
                		System.out.println("\nNome: Caixa de el�stico (1 unidade)");
                		System.out.println("Codigo: "+ codMateriais.getCaixaEl�stico());
                		System.out.println("Quantidade: "+ codMateriais.getQtdCaixaEl�stico());
                		
                		System.out.println("\nNome: Caixa 50 unidades de mascaras (200 unidades)");
                		System.out.println("Codigo: "+ codMateriais.getCaixaUnidade());
                		System.out.println("Quantidade: "+ codMateriais.getQtdCaixaUnidade());
                		
                		System.out.println("\nNome: Caixa Master (10 unidades)");
                		System.out.println("Codigo: "+ codMateriais.getCaixaMaster());
                		System.out.println("Quantidade: "+ codMateriais.getQtdCaixaMaster());
                    	
                    	
                		
                	}
                	
					
						
					
					
                	
                	
                	
                	
                	
                	
                	
            }
			System.out.print("\n\n  Digite '1' para voltar ao menu ou '2' para sair do programa: ");
            menu = scan.nextInt(); //Voltar ciclo de repeti��o do menu (do while)
        }
        while (menu == 1); //Voltar ciclo de repeti��o

	}

}
