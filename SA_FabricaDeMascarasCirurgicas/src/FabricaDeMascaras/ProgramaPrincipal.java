package FabricaDeMascaras;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//Ler o teclado
		
		int contCliente = 0; //Contador de Clientes cadastrados
		
		int menu;//Opção de repetição do ciclo
		int subMenu;
		
		int i = 0; //Índece
		
		//Lista de cadastros
		ArrayList<Cliente> listCliente = new ArrayList<>();
		ArrayList<Funcionario> listFuncionario = new ArrayList<>();
		
		//Ínstancia de Classes
		Cliente clienteCadastro = new Cliente();
		Funcionario funcionarioCadastro = new Funcionario();
		Estoque materiais = new Estoque();
		Fornecedor fornecedor = new Fornecedor();
		
		
		int idCliente = 0;
		int idFuncionario = 0;
		
		
		
		//Somar materiais no estoque
		int somaTNT = 0;
		int somaSMS = 0;
		int somaClipNasal = 0;
		int somaCaixaElástico = 0;
		int somaCaixaUnidade = 0;
		int somaCaixaMaster = 0;
		
		
		
		
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
						System.out.println("\n\n    ID: " + idCliente +"\n");
						clienteCadastro.setIdCliente(idCliente);
						
						System.out.print("\n    Nome: ");
						String nome = scan.next();
						clienteCadastro.setNome(nome);
						
						System.out.print("\n    CPF: ");
						int cpf = scan.nextInt();
						clienteCadastro.setCpf(cpf);
						
						System.out.print("\n    Idade: ");
						int idade = scan.nextInt();
						clienteCadastro.setIdade(idade);
						 
						System.out.print("\n    Telefone: ");
						int telefone = scan.nextInt();
						clienteCadastro.setTelefone(telefone);
						 
						
						System.out.println("\n\n    Insira seu Endereço.");
						
						System.out.print("\n    Rua: ");
						String rua = scan.next();
						clienteCadastro.setRua(rua);
						
						System.out.print("    Bairro: ");
						String bairro = scan.next();
						clienteCadastro.setBairro(bairro);
						
						System.out.print("    Número: ");
						int numero = scan.nextInt();
						clienteCadastro.setNumero(numero);
						
						System.out.print("    Cidade: ");
						String cidade = scan.next();
						clienteCadastro.setCidade(cidade);
						
						System.out.print("    Estado: ");
						String estado = scan.next();
						clienteCadastro.setEstado(estado);
						
						System.out.print("\n    E-mail: ");
						String email = scan.next();
						clienteCadastro.setEmail(email);
						
						
                		listCliente.add(i,clienteCadastro);//Adicionar os dados lidos no ArrayList
                		
                		
                		System.out.println("\n\n    Deseja cadastrar mais clientes ? ");
                		System.out.println("    Opção 1 - sim");
                		System.out.println("    Opção 2 - não");
                		System.out.print("\n    Opção: ");
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
						System.out.println("\n\n    ID: " + idFuncionario +"\n");
						funcionarioCadastro.setIdFuncionario(idFuncionario);
						
						System.out.print("\n    Nome: ");
						String nome = scan.next();
						funcionarioCadastro.setNome(nome);
						
						System.out.print("\n    CPF: ");
						int cpf = scan.nextInt();
						funcionarioCadastro.setCpf(cpf);
						
						System.out.print("\n    Cargo: ");
						String cargo = scan.next();
						funcionarioCadastro.setCargo(cargo);
						
						System.out.print("\n    Idade: ");
						int idade = scan.nextInt();
						funcionarioCadastro.setIdade(idade);
						 
						System.out.print("\n    Telefone: ");
						int telefone = scan.nextInt();
						funcionarioCadastro.setTelefone(telefone);
						 
						
						System.out.println("\n\n    Insira seu Endereço.");
						
						System.out.print("\n    Rua: ");
						String rua = scan.next();
						funcionarioCadastro.setRua(rua);
						
						System.out.print("    Bairro: ");
						String bairro = scan.next();
						funcionarioCadastro.setBairro(bairro);
						
						System.out.print("    Número: ");
						int numero = scan.nextInt();
						funcionarioCadastro.setNumero(numero);
						
						System.out.print("    Cidade: ");
						String cidade = scan.next();
						funcionarioCadastro.setCidade(cidade);
						
						System.out.print("    Estado: ");
						String estado = scan.next();
						funcionarioCadastro.setEstado(estado);
						
						System.out.print("\n    E-mail: ");
						String email = scan.next();
						funcionarioCadastro.setEmail(email);
						
						
                		listFuncionario.add(funcionarioCadastro);
                		
                		
                		System.out.println("\n\n    Deseja cadastrar mais Funcionarios ? ");
                		System.out.println("    Opção 1 - sim");
                		System.out.println("    Opção 2 - não");
                		System.out.print("\nOpção: ");
                		int repita = scan.nextInt();
                		
                		if (repita == 2) {
                			break; //Fim da estrutura de repetição
                		}
                	}
                	
                	
                	break;
                	
                case 3:
                	
                	do 
                	{
                		
                	
                	
                	System.out.println("\n\n    ==========================");
                	System.out.println("    ******** MATERIAIS *******");
                	System.out.println("    ==========================\n\n");
                	
                	
                	System.out.println("    1 - Declarar a quantidade de materias em estoque.");
                	System.out.println("    2 - Comprar materias (Fornecedor).");
                	System.out.println("    3 - Atualizar estoque.\n");
                	System.out.print("    Opcão:");
                	int opcao = scan.nextInt();
                	
                	switch (opcao) {
                	
                	case 1:
                		
                		System.out.println("\n\n    ==============================================================");
                    	System.out.println("    ******** DECLARAR A QUANTIDADE DE MATERIAIS EM ESTOQUE *******");
                    	System.out.println("    ==============================================================\n\n");
                		
                		
                    	System.out.println("    Nome: TNT (6 unidade)");
                		System.out.println("    Codigo: "+ materiais.getTNT());
                		System.out.print("    Quantidade: ");
                		int qtdTNT = scan.nextInt();
                		materiais.setQtdTNT(qtdTNT);
                		
                		
                		System.out.println("\n    Nome: SMS (6 unidades)");
                		System.out.println("    Codigo: "+ materiais.getSMS());
                		System.out.print("    Quantidade: ");
                		int qtdSMS = scan.nextInt();
                		materiais.setQtdSMS(qtdSMS);
                		
                		System.out.println("\n    Nome: Clip Nasal (6 unidades)");
                		System.out.println("    Codigo: "+ materiais.getClipNasal());
                		System.out.print("    Quantidade: ");
                		int qtdClipNasal = scan.nextInt();
                		materiais.setQtdClipNasal(qtdClipNasal);
                		
                		System.out.println("\n    Nome: Caixa de elástico (1 unidade)");
                		System.out.println("    Codigo: "+ materiais.getCaixaElástico());
                		System.out.print("    Quantidade: ");
                		int qtdCaixaElástico = scan.nextInt();
                		materiais.setQtdCaixaElástico(qtdCaixaElástico);
                		
                		System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
                		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
                		System.out.print("    Quantidade: ");
                		int qtdCaixaUnidade = scan.nextInt();
                		materiais.setQtdCaixaUnidade(qtdCaixaUnidade);
                		
                		System.out.println("\n    Nome: Caixa Master (10 unidades)");
                		System.out.println("    Codigo: "+ materiais.getCaixaMaster());
                		System.out.print("    Quantidade: ");
                		int qtdCaixaMaster = scan.nextInt();
                		materiais.setQtdCaixaMaster(qtdCaixaMaster);
                    	
                    	
                		
                		break;
                	
                	
                	case 2: 
                		
                		System.out.println("\n\n    ===============================================");
                    	System.out.println("    ******** COMPRAR MATERIAIS (FORNECEDOR) *******");
                    	System.out.println("    ===============================================\n\n");
                    	
                    	System.out.println("    Escolha o material desejado:\n");
                    	System.out.println("    1 - TNT  (6 unidade)");
                    	System.out.println("    2 - SMS  (6 unidade)");
                    	System.out.println("    3 - Clip Nasal  (6 unidade)");
                    	System.out.println("    4 - Caixa de elástico (1 unidade)");
                    	System.out.println("    5 - Caixa 50 unidades de mascaras (200 unidades)");
                    	System.out.println("    6 - Caixa Master (10 unidades)\n");
                    	System.out.print("    Opcão:");
                    	int opcaomaterial = scan.nextInt();
                    	
                    	switch (opcaomaterial) {
						case 1:
							
							System.out.println("\n\n    Nome: TNT (6 unidade)");
	                		System.out.println("    Codigo: "+ materiais.getTNT());
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoTNT());
	                		System.out.print("    Quantidade: ");
	                		int qtdTNTComprada = scan.nextInt();
	                		materiais.setQtdTNTComprada(qtdTNTComprada);
	                		
	                		if (qtdTNTComprada > 0) {
	                		somaTNT = qtdTNTComprada + materiais.getQtdTNT();
	                		}
	                		
	                		break;
	                		
						case 2:
							
							System.out.println("\n    Nome: SMS (6 unidades)");
	                		System.out.println("    Codigo: "+ materiais.getSMS());
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoSMS());
	                		System.out.print("    Quantidade: ");
	                		int qtdSMSComprada = scan.nextInt();
	                		materiais.setQtdSMSComprada(qtdSMSComprada);
	                		
	                		if (qtdSMSComprada > 0) {
	                		somaSMS = qtdSMSComprada + materiais.getQtdSMS();
	                		}
	                		
	                		break;
	                		
						case 3:
							
							System.out.println("\n    Nome: Clip Nasal (6 unidades)");
	                		System.out.println("    Codigo: "+ materiais.getClipNasal());
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoClipNasal());
	                		System.out.print("    Quantidade: ");
	                		int qtdClipNasalComprada = scan.nextInt();
	                		materiais.setQtdClipNasal(qtdClipNasalComprada);
	                		
	                		if (qtdClipNasalComprada > 0) {
	                		somaClipNasal =qtdClipNasalComprada + materiais.getQtdClipNasal();
	                		}
	                		
							break;
							
						case 4:
							
							System.out.println("\n    Nome: Caixa de elástico (1 unidade)");
	                		System.out.println("    Codigo: "+ materiais.getCaixaElástico());
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoCaixaElastico());
	                		System.out.print("    Quantidade: ");
	                		int qtdCaixaElásticoComprada = scan.nextInt();
	                		materiais.setQtdCaixaElástico(qtdCaixaElásticoComprada);
							
	                		if (qtdCaixaElásticoComprada > 0) {
	                		somaCaixaElástico = qtdCaixaElásticoComprada + materiais.getQtdCaixaElástico();
	                		}
	                		
							break;
							
						case 5:
							
							System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
	                		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoCaixaUnidade());
	                		System.out.print("    Quantidade: ");
	                		int qtdCaixaUnidadeComprada = scan.nextInt();
	                		materiais.setQtdCaixaUnidade(qtdCaixaUnidadeComprada);
	                		
	                		if (qtdCaixaUnidadeComprada > 0) {
	                		somaCaixaUnidade = qtdCaixaUnidadeComprada + materiais.getQtdCaixaUnidade();
	                		}
	                		
							break;
							 
						case 6:
							
							System.out.println("\n    Nome: Caixa Master (10 unidades)");
	                		System.out.println("    Codigo: "+ materiais.getCaixaMaster());
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoCaixaMaster());
	                		System.out.print("    Quantidade: ");
	                		int qtdCaixaMasterComprada = scan.nextInt();
	                		materiais.setQtdCaixaMaster(qtdCaixaMasterComprada);
	                		
	                		if (qtdCaixaMasterComprada > 0) {
	                		somaCaixaMaster = qtdCaixaMasterComprada + materiais.getQtdCaixaMaster();
	                		}
	                		
							break;
	                		
						}
                		
                    	
                    	
                    	break;
                    	
                	case 3:
                		
                		
                		System.out.println("\n\n    =====================================");
                    	System.out.println("    ******** ATUALIZAR ESTOQUE *******");
                    	System.out.println("    =====================================\n\n");
                		
                    	if (somaTNT > 0) { //Ocorreu uma atualização no estoque
                    		System.out.println("    Nome: TNT (6 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getTNT());
                    		System.out.println("    Quantidade: "+ somaTNT);
                    		System.out.println(materiais.getQtdSMS());
                    	}
                    	else { //Não ocorreu atualização no estoque
                		System.out.println("    Nome: TNT (6 unidade)");
                		System.out.println("    Codigo: "+ materiais.getTNT());
                		System.out.println("    Quantidade: "+ materiais.getQtdTNT());
                    	}
                		
                		if (somaSMS > 0){ //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: SMS (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getSMS());
                    		System.out.println("    Quantidade: "+ somaSMS);
                		}
                		else { //Não ocorreu atualização no estoque
                		System.out.println("\n    Nome: SMS (6 unidades)");
                		System.out.println("    Codigo: "+ materiais.getSMS());
                		System.out.println("    Quantidade: "+ materiais.getQtdSMS());
                		}
                		
                		if (somaClipNasal > 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Clip Nasal (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getClipNasal());
                    		System.out.println("    Quantidade: "+ somaClipNasal);
                		}
                		else { //Não ocorreu atualização no estoque
                		System.out.println("\n    Nome: Clip Nasal (6 unidades)");
                		System.out.println("    Codigo: "+ materiais.getClipNasal());
                		System.out.println("    Quantidade: "+ materiais.getQtdClipNasal());
                		}
                		
                		if (somaCaixaElástico > 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa de elástico (1 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaElástico());
                    		System.out.println("    Quantidade: "+ somaCaixaElástico);
                		}
                		else { //Não ocorreu atualização no estoque
                		System.out.println("\n    Nome: Caixa de elástico (1 unidade)");
                		System.out.println("    Codigo: "+ materiais.getCaixaElástico());
                		System.out.println("    Quantidade: "+ materiais.getQtdCaixaElástico());
                		}
                		
                		if (somaCaixaUnidade > 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
                    		System.out.println("    Quantidade: "+ somaCaixaUnidade);
                		}
                		else { //Não ocorreu atualização no estoque
                		System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
                		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
                		System.out.println("    Quantidade: "+ materiais.getQtdCaixaUnidade());
                		}
                		
                		if (somaCaixaMaster > 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa Master (10 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaMaster());
                    		System.out.println("    Quantidade: "+ somaCaixaMaster);
                		}
                		else { //Não ocorreu atualização no estoque
                		System.out.println("\n    Nome: Caixa Master (10 unidades)");
                		System.out.println("    Codigo: "+ materiais.getCaixaMaster());
                		System.out.println("    Quantidade: "+ materiais.getQtdCaixaMaster());
                		}
                		
                    	break;
                		
                		
                    	
                	}
                	
                	System.out.print("\n\n  Digite '1' para voltar ao Menu de Materiais ou '2' para sair: ");
					subMenu = scan.nextInt();
                	}	
					while(subMenu == 1);
					
                	
                	
                	
                	
                	
                	
                	
            }
			System.out.print("\n\n  Digite '1' para voltar ao menu ou '2' para sair do programa: ");
            menu = scan.nextInt(); //Voltar ciclo de repetição do menu (do while)
        }
        while (menu == 1); //Voltar ciclo de repetição

	}

}
