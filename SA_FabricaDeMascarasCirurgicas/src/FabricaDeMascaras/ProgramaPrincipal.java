package FabricaDeMascaras;

import java.util.ArrayList;
import java.util.Scanner;



public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//Ler o teclado
		
		int contCliente = 0; //Contador de Clientes cadastrados
		
		int menu;//Opção de repetição do ciclo
		int subMenu;
		int subMenu2;
		
		int i = 0; //Índece
		
		//Lista de cadastros
		ArrayList<Cliente> listCliente = new ArrayList<>();
		ArrayList<Funcionario> listFuncionario = new ArrayList<>();
		
		//Ínstancia de Classes
		Cliente clienteCadastro = new Cliente();
		Funcionario funcionarioCadastro = new Funcionario();
		Estoque materiais = new Estoque();
		Fornecedor fornecedor = new Fornecedor();
		RelatorioProducao relatorio = new RelatorioProducao();
		
		
		int idCliente = 0;
		int idFuncionario = 0;
		
		//Estoque de Mascaras
		int estoqueMascaras = 0;
		int estoqueCaixaMaster =0;
		
		
		
		//Somar materiais no estoque
		int somaTNT = 0;
		int somaSMS = 0;
		int somaClipNasal = 0;
		int somaCaixaElastico = 0;
		int somaCaixaUnidade = 0;
		int somaCaixaMaster = 0;
		
		//Subtração materiais no estoque
		int subtracaoTNT = 0;
		int subtracaoSMS = 0;
		int subtracaoClipNasal = 0;
		int subtracaoCaixaElastico = 0;
		int subtracaoCaixaUnidade = 0;
		int subtracaoCaixaMaster = 0;
		
		//Soma produção com o estoque
		int somaProducao = 0;
		
		
		
		do //Inicializando Ciclo de repetição
        {
			
			System.out.println("\n\n\n    ****************************************************");
			System.out.println("    *                   MENU PRINCIPAL                 *");
			System.out.println("    *                                                  *");
			System.out.println("    *                1- FINANCEIRO                     *");
			System.out.println("    *                2- MANTER CLIENTE                 *");
			System.out.println("    *                3- MANTER FUNCIONARIO             *");
			System.out.println("    *                4- MATERIAIS                      *");
			System.out.println("    *                5- PRODUÇÃO DE MÁSCARAS           *");
			System.out.println("    *                5- CONSULTA                       *");
			System.out.println("    ****************************************************\n\n");
			
			System.out.print("    Digite a opção desejada no menu:  ");
            int respostaMenu = scan.nextInt(); //Opção do menu
			
            switch (respostaMenu) //Decisão do menu
            {
            
            	case 1:
            	
            		System.out.println("\n\n    =============================");
                	System.out.println("    ******** FINANCEIRO *******");
                	System.out.println("    ===========================\n\n\n");
            		
            		
            		break;
            
                case 2: //Decisão
                	
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
                	
                case 3:
                	
                	
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
                	
                case 4:
                	
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
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoTNT()+"0");
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
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoSMS()+"0");
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
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoClipNasal()+"0");
	                		System.out.print("    Quantidade: ");
	                		int qtdClipNasalComprada = scan.nextInt();
	                		materiais.setQtdClipNasalComprada(qtdClipNasalComprada);
	                		
	                		if (qtdClipNasalComprada > 0) {
	                		somaClipNasal = qtdClipNasalComprada + materiais.getQtdClipNasal();
	                		}
	                		
							break;
							
						case 4:
							
							System.out.println("\n    Nome: Caixa de elástico (1 unidade)");
	                		System.out.println("    Codigo: "+ materiais.getCaixaElástico());
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoCaixaElastico()+"0");
	                		System.out.print("    Quantidade: ");
	                		int qtdCaixaElásticoComprada = scan.nextInt();
	                		materiais.setQtdCaixaElásticoComprada(qtdCaixaElásticoComprada);
							
	                		if (qtdCaixaElásticoComprada > 0) {
	                		somaCaixaElastico = qtdCaixaElásticoComprada + materiais.getQtdCaixaElástico();
	                		}
	                		
							break;
							
						case 5:
							
							System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
	                		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoCaixaUnidade()+"0");
	                		System.out.print("    Quantidade: ");
	                		int qtdCaixaUnidadeComprada = scan.nextInt();
	                		materiais.setQtdCaixaUnidadeComprada(qtdCaixaUnidadeComprada);
	                		
	                		if (qtdCaixaUnidadeComprada > 0) {
	                		somaCaixaUnidade = qtdCaixaUnidadeComprada + materiais.getQtdCaixaUnidade();
	                		}
	                		
							break;
							 
						case 6:
							
							System.out.println("\n    Nome: Caixa Master (10 unidades)");
	                		System.out.println("    Codigo: "+ materiais.getCaixaMaster());
	                		System.out.println("    Preço: R$"+ fornecedor.getPrecoCaixaMaster()+"0");
	                		System.out.print("    Quantidade: ");
	                		int qtdCaixaMasterComprada = scan.nextInt();
	                		materiais.setQtdCaixaMasterComprada(qtdCaixaMasterComprada);
	                		
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
                		
                    	//Material TNT
                    	if (somaTNT > 0 && subtracaoTNT == 0) { //Ocorreu uma atualização no estoque - soma
                    		System.out.println("    Nome: TNT (6 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getTNT());
                    		System.out.println("    Quantidade: "+ somaTNT);
                    	}
                    	else if (subtracaoTNT > 0 && somaTNT == 0) { //Ocorreu uma atualização no estoque - subtração
                    		System.out.println("    Nome: TNT (6 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getTNT());
                    		System.out.println("    Quantidade: "+ subtracaoTNT);
                    	}
                    	else if (somaTNT > 0 && subtracaoTNT > 0) { //Ocorreu uma atualização no estoque - soma
                    		System.out.println("    Nome: TNT (6 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getTNT());
                    		System.out.println("    Quantidade: "+ (somaTNT-subtracaoTNT));
                    	}
                    	else { //Não ocorreu atualização no estoque
                		System.out.println("    Nome: TNT (6 unidade)");
                		System.out.println("    Codigo: "+ materiais.getTNT());
                		System.out.println("    Quantidade: "+ materiais.getQtdTNT());
                    	}
                		
                    	
                    	
                    	//Material SMS
                		if (somaSMS > 0 && subtracaoSMS == 0){ //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: SMS (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getSMS());
                    		System.out.println("    Quantidade: "+ somaSMS);
                		}
                		else if (subtracaoSMS > 0 && somaSMS == 0) {
                			System.out.println("\n    Nome: SMS (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getSMS());
                    		System.out.println("    Quantidade: "+ subtracaoSMS);
                		}
                		else if (subtracaoSMS > 0 && somaSMS > 0) {
                			System.out.println("\n    Nome: SMS (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getSMS());
                    		System.out.println("    Quantidade: "+ (somaSMS-subtracaoSMS));
                		}
                		else { //Não ocorreu atualização no estoque
                		System.out.println("\n    Nome: SMS (6 unidades)");
                		System.out.println("    Codigo: "+ materiais.getSMS());
                		System.out.println("    Quantidade: "+ materiais.getQtdSMS());
                		}
                		
                		
                		
                		//Material Clip Nasal
                		if (somaClipNasal > 0 && subtracaoClipNasal == 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Clip Nasal (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getClipNasal());
                    		System.out.println("    Quantidade: "+ somaClipNasal);
                		}
                		else if (subtracaoClipNasal > 0 && somaClipNasal == 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Clip Nasal (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getClipNasal());
                    		System.out.println("    Quantidade: "+ subtracaoClipNasal);
                		}
                		else if (somaClipNasal > 0 && subtracaoClipNasal > 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Clip Nasal (6 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getClipNasal());
                    		System.out.println("    Quantidade: "+ (somaClipNasal-subtracaoClipNasal));
                		}
                		else { //Não ocorreu atualização no estoque
                		System.out.println("\n    Nome: Clip Nasal (6 unidades)");
                		System.out.println("    Codigo: "+ materiais.getClipNasal());
                		System.out.println("    Quantidade: "+ materiais.getQtdClipNasal());
                		}
                		
                		
                		
                		//Material Caixa de Elástico
                		if (somaCaixaElastico > 0 && subtracaoCaixaElastico == 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa de elástico (1 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaElástico());
                    		System.out.println("    Quantidade: "+ somaCaixaElastico);
                		}
                		else if (subtracaoCaixaElastico > 0 && somaCaixaElastico == 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa de elástico (1 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaElástico());
                    		System.out.println("    Quantidade: "+ subtracaoCaixaElastico);
                		}
                		else if (somaCaixaElastico > 0 && subtracaoCaixaElastico > 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa de elástico (1 unidade)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaElástico());
                    		System.out.println("    Quantidade: "+ (somaCaixaElastico-subtracaoCaixaElastico));
                		}
                		else { //Não ocorreu atualização no estoque
                		System.out.println("\n    Nome: Caixa de elástico (1 unidade)");
                		System.out.println("    Codigo: "+ materiais.getCaixaElástico());
                		System.out.println("    Quantidade: "+ materiais.getQtdCaixaElástico());
                		}
                		
                		
                		
                		//Material Caixa 50 unidades
                		if (somaCaixaUnidade > 0 && subtracaoCaixaUnidade == 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
                    		System.out.println("    Quantidade: "+ somaCaixaUnidade);
                		}
                		else if (subtracaoCaixaUnidade > 0 && somaCaixaUnidade == 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
                    		System.out.println("    Quantidade: "+ subtracaoCaixaUnidade);
                		}
                		else if (somaCaixaUnidade > 0 && subtracaoCaixaUnidade > 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
                    		System.out.println("    Quantidade: "+ (somaCaixaUnidade-subtracaoCaixaUnidade));
                		}
                		else { //Não ocorreu atualização no estoque
                		System.out.println("\n    Nome: Caixa 50 unidades de mascaras (200 unidades)");
                		System.out.println("    Codigo: "+ materiais.getCaixaUnidade());
                		System.out.println("    Quantidade: "+ materiais.getQtdCaixaUnidade());
                		}
                		
                		
                		
                		//Material Caixa Master
                		if (somaCaixaMaster > 0 && subtracaoCaixaMaster == 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa Master (10 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaMaster());
                    		System.out.println("    Quantidade: "+ somaCaixaMaster);
                		}
                		else if (subtracaoCaixaMaster > 0 && somaCaixaMaster == 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa Master (10 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaMaster());
                    		System.out.println("    Quantidade: "+ subtracaoCaixaMaster);
                		}
                		else if (somaCaixaMaster > 0 && subtracaoCaixaMaster > 0) { //Ocorreu uma atualização no estoque
                			System.out.println("\n    Nome: Caixa Master (10 unidades)");
                    		System.out.println("    Codigo: "+ materiais.getCaixaMaster());
                    		System.out.println("    Quantidade: "+ (somaCaixaMaster-subtracaoCaixaMaster));
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
					
                	
                case 5:
            		
                	do
                	{
                	
            		System.out.println("\n\n    =====================================");
                	System.out.println("    ******** PRODUÇÃO DE MÁSCARAS *******");
                	System.out.println("    =====================================\n\n");
                	
                	
                	System.out.println("    1 - Estoque de Máscaras.");
                	System.out.println("    2 - Produção do dia.");
                	System.out.println("    3 - Atualizar estoque de Máscaras.\n");
                	System.out.print("    Opcão:");
                	int opcaoMascaras = scan.nextInt();
                	
                	switch (opcaoMascaras) {
                	
					case 1:
						
						System.out.println("\n\n    ==============================================================");
                    	System.out.println("    ******** DECLARAR A QUANTIDADE DE MÁTERIAIS EM ESTOQUE *******");
                    	System.out.println("    ==============================================================\n\n");
                    	
                    	
                    	System.out.print("Quantidade de Máscaras em estoque (Caixa Master): ");
                    	estoqueMascaras = scan.nextInt();
                    	materiais.setEstoqueMascaras(estoqueMascaras);
						
						break;
						
					case 2:
						
						System.out.println("\n\n    =====================================");
	                	System.out.println("    ******** PRODUÇÃO DE MÁSCARAS *******");
	                	System.out.println("    =====================================\n\n");
	                	
	                	System.out.print("    Caixa Master produzida: ");
	                	estoqueCaixaMaster = scan.nextInt();
	                	if (estoqueCaixaMaster > 0) {
	                		somaProducao = estoqueCaixaMaster + materiais.getEstoqueMascaras();
	                	}
	                	
	                	System.out.print("\n    Materiais utilizados na produção.");
	                	
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
	                	
	                	if (somaSMS > 0) {
	                		somaSMS = somaSMS - utilizadaSMS;
	                	}
	                	else {
	                		subtracaoSMS = materiais.getQtdSMS() - utilizadaSMS;
	                	}
	                	
	                	
	                	System.out.print("    Clip Nasal (6 unidade): ");
	                	int utilizadaClipNasal = scan.nextInt();
	                	relatorio.setMaterialUtilizadoClipNasal(utilizadaClipNasal);
	                	
	                	if (somaClipNasal > 0) {
	                		somaClipNasal = somaClipNasal - utilizadaClipNasal;
	                	}
	                	else {
	                		subtracaoClipNasal = materiais.getQtdClipNasal() - utilizadaClipNasal;
	                	}
	                	
	                	
	                	System.out.print("    Caixa de elástico (1 unidade): ");
	                	int utilizadaCaixaElastico = scan.nextInt();
	                	relatorio.setMaterialUtilizadoCaixaElastico(utilizadaCaixaElastico);
	                	
	                	if (somaCaixaElastico > 0) {
	                		somaCaixaElastico = somaCaixaElastico - utilizadaCaixaElastico;
	                	}
	                	else {
	                		subtracaoCaixaElastico = materiais.getQtdCaixaElástico() - utilizadaCaixaElastico;
	                	}
	                	
	                	
	                	
	                	System.out.print("    Caixa 50 unidades de mascaras (200 unidades): ");
	                	int utilizadaCaixaUnidade = scan.nextInt();
	                	relatorio.setMaterialUtilizadoCaixaUnidade(utilizadaCaixaUnidade);
	                	
	                	if (somaCaixaUnidade > 0) {
	                		somaCaixaUnidade = somaCaixaUnidade - utilizadaCaixaUnidade;
	                	}
	                	else {
	                		subtracaoCaixaUnidade = materiais.getQtdCaixaUnidade() - utilizadaCaixaUnidade;
	                	}
	                	
	                	
	                	
	                	System.out.print("    Caixa Master (10 unidades): ");
	                	int utilizadaCaixaMaster = scan.nextInt();
	                	relatorio.setMaterialUtilizadoCaixaMaster(utilizadaCaixaMaster);
	                	
	                	if (somaCaixaMaster > 0) {
	                		somaCaixaMaster = somaCaixaMaster - utilizadaCaixaMaster;
	                	}
	                	else {
	                		subtracaoCaixaMaster = materiais.getQtdCaixaMaster() - utilizadaCaixaMaster;
	                	}
	                	
	                	
						
						break;
						
						
					case 3:
						
						System.out.println("\n\n    ==============================================");
                    	System.out.println("    ******** ATUALIZAR ESTOQUE DE MASCARAS *******");
                    	System.out.println("    ==============================================\n\n");
						
                    	if (estoqueCaixaMaster > 0) {
	                		System.out.println("    Total de Caixa Master em Estoque: "+ somaProducao);
	                		System.out.println("    Total de Caixas 50 unidades em Estoque: "+ (somaProducao*72));
	                		System.out.println("    Total de Mascaras em Estoque: "+ (somaProducao*3600));
                    	}
                    	else {
	                		System.out.println("    Total de Caixa Master em Estoque: "+ materiais.getEstoqueMascaras());
	                		System.out.println("    Total de Caixas 50 unidades em Estoque: "+ (materiais.getEstoqueMascaras()*72));
	                		System.out.println("    Total de Mascaras em Estoque: "+ (materiais.getEstoqueMascaras()*3600));
                    	}
                    	
						
						
						break;
						
						
					}
                	
                	
                	System.out.print("\n\n  Digite '1' para voltar ao Menu de Produção ou '2' para sair: ");
					subMenu2 = scan.nextInt();
                	}	
					while(subMenu2 == 1);
                	
                	
            }
			System.out.print("\n\n  Digite '1' para voltar ao menu ou '2' para sair do programa: ");
            menu = scan.nextInt(); //Voltar ciclo de repetição do menu (do while)
        }
        while (menu == 1); //Voltar ciclo de repetição

	}

}
