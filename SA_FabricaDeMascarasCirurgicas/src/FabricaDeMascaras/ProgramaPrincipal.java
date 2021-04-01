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
		ArrayList<Cliente> cliente = new ArrayList<>();
		
		//Ínstancia de Classes
		Cliente clienteCadastro = new Cliente();
		
		int idCliente = 0;
		
		do //Inicializando Ciclo de repetição
        {
			
			System.out.println("\n\n\n    ****************************************************");
			System.out.println("    *                   MENU PRINCIPAL                 *");
			System.out.println("    *                                                  *");
			System.out.println("    *                1- MANTER CLIENTE                 *");
			System.out.println("    *                2- EDITAR RECEITAS                *");
			System.out.println("    *                3- ELIMINAR RECEITAS              *");
			System.out.println("    *                4- RECEITAS CADASTRADAS           *");
			System.out.println("    *                5- CONSULTA                       *");
			System.out.println("    ****************************************************\n\n");
			
			System.out.print("Digite a opção desejada no menu:  ");
            int respostaMenu = scan.nextInt(); //Opção do menu
			
            switch (respostaMenu) //Decisão do menu
            {
            
                case 1: //Decisão
                	
                	System.out.println("\n\n    ==================================");
                	System.out.println("    ******** CADASTRAR CLIENTE *******");
                	System.out.println("    ==================================\n\n\n");
                	
                	
                	
                	
                	for (i=0; i<99999; i++) {
                		
                		idCliente = i;
						System.out.println("\n\nCadastro N°: " + idCliente +"\n");
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
						
						
						
						
						
						
						
						
                		cliente.add(clienteCadastro);
                		break;
                	}
			
                	
                	for (Cliente c : cliente) {
                		System.out.println(c);
                	}
                	
                	
                	
                	
                	
			break;
            }
			System.out.print("\n\n  Digite '1' para voltar ao menu ou '2' para sair do programa: ");
            menu = scan.nextInt(); //Voltar ciclo de repetição do menu (do while)
        }
        while (menu == 1); //Voltar ciclo de repetição

	}

}
