package FabricaDeMascaras;

import java.util.ArrayList;
import java.util.Scanner;



public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//Ler o teclado
		
		int contCliente = 0; //Contador de Clientes cadastrados
		
		int menu;//Op��o de repeti��o do ciclo
		int subMenu;
		
		int i = 0; //�ndece
		
		//Lista de cadastros
		ArrayList<Cliente> listCliente = new ArrayList<>();
		ArrayList<Funcionario> listFuncionario = new ArrayList<>();
		
		//�nstancia de Classes
		Cliente clienteCadastro = new Cliente();
		Funcionario funcionarioCadastro = new Funcionario();
		Estoque materiais = new Estoque();
		Fornecedor fornecedor = new Fornecedor();
		RelatorioProducao relatorio = new RelatorioProducao();
		
		
		int idCliente = 0;
		int idFuncionario = 0;
		
		
		
		//Somar materiais no estoque
		int somaTNT = 0;
		int somaSMS = 0;
		int somaClipNasal = 0;
		int somaCaixaEl�stico = 0;
		int somaCaixaUnidade = 0;
		int somaCaixaMaster = 0;
		
		//Subtra��o materiais no estoque
		int subtracaoTNT = 0;
		int subtracaoSMS = 0;
		int subtracaoClipNasal = 0;
		int subtracaoCaixaEl�stico = 0;
		int subtracaoCaixaUnidade = 0;
		int subtracaoCaixaMaster = 0;
		
		
		
		do //Inicializando Ciclo de repeti��o
        {
			
			System.out.println("\n\n\n    ****************************************************");
			System.out.println("    *                   MENU PRINCIPAL                 *");
			System.out.println("    *                                                  *");
			System.out.println("    *                1- MANTER CLIENTE                 *");
			System.out.println("    *                2- MANTER FUNCIONARIO             *");
			System.out.println("    *                3- MATERIAIS                      *");
			System.out.println("    *                4- PRODU��O DE M�SCARAS           *");
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
						 
						
						System.out.println("\n\n    Insira seu Endere�o.");
						
						System.out.print("\n    Rua: ");
						String rua = scan.next();
						clienteCadastro.setRua(rua);
						
						System.out.print("    Bairro: ");
						String bairro = scan.next();
						clienteCadastro.setBairro(bairro);
						
						System.out.print("    N�mero: ");
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
                		System.out.println("    Op��o 1 - sim");
                		System.out.println("    Op��o 2 - n�o");
                		System.out.print("\n    Op��o: ");
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
						 
						
						System.out.println("\n\n    Insira seu Endere�o.");
						
						System.out.print("\n    Rua: ");
						String rua = scan.next();
						funcionarioCadastro.setRua(rua);
						
						System.out.print("    Bairro: ");
						String bairro = scan.next();
						funcionarioCadastro.setBairro(bairro);
						
						System.out.print("    N�mero: ");
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
                		System.out.println("    Op��o 1 - sim");
                		System.out.println("    Op��o 2 - n�o");
                		System.out.print("\nOp��o: ");
                		int repita = scan.nextInt();
                		
                		if (repita == 2) {
                			break; //Fim da estrutura de repeti��o
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
                	System.out.print("    Opc�o:");
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
                		
                		System.out.println("\n    Nome: Caixa de el�stico (1 unidade)");
                		System.out.println("    Codigo: "+ materiais.getCaixaEl�stico());
                		System.out.print("    Quantidade: ");
                		int qtdCaixaEl�stico = scan.nextInt();
                		materiais.setQtdCaixaEl�stico(qtdCaixaEl�stico);
                		
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
                    	System.out.println("    4 - Caixa de el�stico (1 unidade)");
                    	System.out.println("    5 - Caixa 50 unidades de mascaras (200 unidades)");
                    	System.out.println("    6 - Caixa Master (10 unidades)\n");
                    	System.out.print("    Opc�o:");
                    	int opcaomaterial = scan.nextInt();
                    	
                    	switch (opcaomaterial) {
						case 1:
							
							System.out.println("\n\n    Nome: TNT (6 unidade)");
	                		System.out.println("    Codigo: "+ materiais.getTNT());
	                		System.out.println("    Pre�o: R$"+ fornecedor.getPrecoTNT()+"0");
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
	                		System.out.println("    Pre�o: R$"+ fornecedor.getPrecoSMS()+"0");
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
	                		System.out.println("    Pre�o: R$"+ fornecedor.getPrecoClipNasal()+"0");
	                		System.out.print("    Quantidade: ");
	                		int qtdClipNasalComprada = scan.nextInt();
	                		materiais.setQtdClipNasal(qtdClipNasalComprada);
	                		
	                		if (qtdClipNasalComprada > 0) {
	                		somaClipNasal =qtdClipNasalComprada + materiais.getQtdClipNasal();
	                		}
	                		
							break;
							
						case 4:
							
							System.out.println("\n    Nome: Caixa de el�stico (1 unidade)");
	                		System.out.println("    Codigo: "+ materiais.getCaixaEl�stico());
	                		System.out.println("    Pre�o: R$"+ fornecedor.getPrecoCaixaElastico()+"0");
	                		System.out.print("    Quantidade: ");
	                		int qtdCaixaEl�sticoComprada = scan.nextInt();
	                		materiais.setQtdCaixaEl�stico(qtdCaixaEl�sticoComprada);
							
	                		if (qtdCaixaEl�sticoComprada > 0) {
	                		somaCaixaEl�stico = qtdCaixaEl�sticoComprada + materiais.getQtdCaixaEl�stico();
	                		}
	                		
							break;
							
						case 5:
							
							System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
	                		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
	                		System.out.println("    Pre�o: R$"+ fornecedor.getPrecoCaixaUnidade()+"0");
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
	                		System.out.println("    Pre�o: R$"+ fornecedor.getPrecoCaixaMaster()+"0");
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
                		
                    	if (somaTNT > 0) { //Ocorreu uma atualiza��o no estoque
                    		System.out.println("    Nome: TNT (6 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getTNT());
                    		System.out.println("    Quantidade: "+ somaTNT);
                    	}
                    	else if (subtracaoTNT > 0 && somaTNT == 0) {
                    		System.out.println("    Nome: TNT (6 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getTNT());
                    		System.out.println("    Quantidade: "+ subtracaoTNT);
                    	}
                    	else { //N�o ocorreu atualiza��o no estoque
                		System.out.println("    Nome: TNT (6 unidade)");
                		System.out.println("    Codigo: "+ materiais.getTNT());
                		System.out.println("    Quantidade: "+ materiais.getQtdTNT());
                    	}
                		
                		if (somaSMS > 0){ //Ocorreu uma atualiza��o no estoque
                			System.out.println("\n    Nome: SMS (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getSMS());
                    		System.out.println("    Quantidade: "+ somaSMS);
                		}
                		else { //N�o ocorreu atualiza��o no estoque
                		System.out.println("\n    Nome: SMS (6 unidades)");
                		System.out.println("    Codigo: "+ materiais.getSMS());
                		System.out.println("    Quantidade: "+ materiais.getQtdSMS());
                		}
                		
                		if (somaClipNasal > 0) { //Ocorreu uma atualiza��o no estoque
                			System.out.println("\n    Nome: Clip Nasal (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getClipNasal());
                    		System.out.println("    Quantidade: "+ somaClipNasal);
                		}
                		else { //N�o ocorreu atualiza��o no estoque
                		System.out.println("\n    Nome: Clip Nasal (6 unidades)");
                		System.out.println("    Codigo: "+ materiais.getClipNasal());
                		System.out.println("    Quantidade: "+ materiais.getQtdClipNasal());
                		}
                		
                		if (somaCaixaEl�stico > 0) { //Ocorreu uma atualiza��o no estoque
                			System.out.println("\n    Nome: Caixa de el�stico (1 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaEl�stico());
                    		System.out.println("    Quantidade: "+ somaCaixaEl�stico);
                		}
                		else { //N�o ocorreu atualiza��o no estoque
                		System.out.println("\n    Nome: Caixa de el�stico (1 unidade)");
                		System.out.println("    Codigo: "+ materiais.getCaixaEl�stico());
                		System.out.println("    Quantidade: "+ materiais.getQtdCaixaEl�stico());
                		}
                		
                		if (somaCaixaUnidade > 0) { //Ocorreu uma atualiza��o no estoque
                			System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
                    		System.out.println("    Quantidade: "+ somaCaixaUnidade);
                		}
                		else { //N�o ocorreu atualiza��o no estoque
                		System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
                		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
                		System.out.println("    Quantidade: "+ materiais.getQtdCaixaUnidade());
                		}
                		
                		if (somaCaixaMaster > 0) { //Ocorreu uma atualiza��o no estoque
                			System.out.println("\n    Nome: Caixa Master (10 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaMaster());
                    		System.out.println("    Quantidade: "+ somaCaixaMaster);
                		}
                		else { //N�o ocorreu atualiza��o no estoque
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
					
                	
                case 4:
            		
            		System.out.println("\n\n    =====================================");
                	System.out.println("    ******** PRODU��O DE M�SCARAS *******");
                	System.out.println("    =====================================\n\n");
                	
                	
                	System.out.println("    1 - Estoque de M�scaras.");
                	System.out.println("    2 - Produ��o do dia.");
                	System.out.println("    3 - Atualizar estoque de M�scaras.\n");
                	System.out.print("    Opc�o:");
                	int opcaoMascaras = scan.nextInt();
                	
                	switch (opcaoMascaras) {
                	
					case 1:
						
						System.out.println("\n\n    ==============================================================");
                    	System.out.println("    ******** DECLARAR A QUANTIDADE DE M�TERIAIS EM ESTOQUE *******");
                    	System.out.println("    ==============================================================\n\n");
                    	
                    	
                    	System.out.print("Quantidade de M�scaras em estoque (Caixa Master): ");
                    	int estoqueMascaras = scan.nextInt();
                    	materiais.setEstoqueMascaras(estoqueMascaras);
						
						break;
						
					case 2:
						
						System.out.println("\n\n    =====================================");
	                	System.out.println("    ******** PRODU��O DE M�SCARAS *******");
	                	System.out.println("    =====================================\n\n");
	                	
	                	System.out.print("    Caixa Master produzida: ");
	                	int estoqueCaixaMaster = scan.nextInt();
	                	relatorio.setEstoqueCaixaMaster(estoqueCaixaMaster);
	                	
	                	System.out.print("\n    Materiais utilizados na produ��o.");
	                	
	                	System.out.print("\n    TNT (6 unidade): ");
	                	int utilizadaTNT = scan.nextInt();
	                	relatorio.setMaterialUtilizadoTNT(utilizadaTNT);
	                	
	                	if (somaTNT > 0) {
	                		somaTNT = somaTNT - utilizadaTNT;
	                	}
	                	else {
	                		subtracaoTNT = materiais.getQtdTNT() - utilizadaTNT;
	                	}
	                	
	                	
	                	System.out.print("    SMS (6 unidade): ");
	                	int utilizadaSMS = scan.nextInt();
	                	relatorio.setMaterialUtilizadoSMS(utilizadaSMS);
	                	
	                	
	                	
	                	
	                	System.out.print("    Clip Nasal (6 unidade): ");
	                	int utilizadaClipNasal = scan.nextInt();
	                	relatorio.setMaterialUtilizadoClipNasal(utilizadaClipNasal);
	                	
	                	System.out.print("    Caixa de el�stico (1 unidade): ");
	                	int utilizadaCaixaElastico = scan.nextInt();
	                	relatorio.setMaterialUtilizadoCaixaElastico(utilizadaCaixaElastico);
	                	
	                	System.out.print("    Caixa 50 unidades de mascaras (200 unidades): ");
	                	int utilizadaCaixaUnidade = scan.nextInt();
	                	relatorio.setMaterialUtilizadoCaixaUnidade(utilizadaCaixaUnidade);
	                	
	                	System.out.print("    Caixa Master (10 unidades): ");
	                	int utilizadaCaixaMaster = scan.nextInt();
	                	relatorio.setMaterialUtilizadoCaixaMaster(utilizadaCaixaMaster);
						
						break;
						
						
					case 3:
						
						
						
						break;
						
						
					}
                	
                	
                	
                	
                	
            }
			System.out.print("\n\n  Digite '1' para voltar ao menu ou '2' para sair do programa: ");
            menu = scan.nextInt(); //Voltar ciclo de repeti��o do menu (do while)
        }
        while (menu == 1); //Voltar ciclo de repeti��o

	}

}
