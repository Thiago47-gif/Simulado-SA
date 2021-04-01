package FabricaDeMascaras;

public class Funcionario extends Pessoa {
	
	private int IdFuncionario;
	private String Cargo;
	
	public int getIdFuncionario() {
		return IdFuncionario;
	}
	public void setIdFuncionario(int idFuncionario) {
		IdFuncionario = idFuncionario;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	
	
	//Métodos Get e Set da classe Pessoa
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public int getCpf() {
		return Cpf;
	}
	public void setCpf(int cpf) {
		Cpf = cpf;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	} 
	
	
	//Métodos Get e Set da classe Endereco
	public String getRua() {
		return Rua;
	}
	public void setRua(String rua) {
		Rua = rua;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	} 
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getCidade() {
		return Cidade;
	} 
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public String getEstado() {
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
	@Override
	public String toString() {
		
	return "ID do Funcionário: "+ IdFuncionario +
				"\nNome: "+ Nome +
				"\nCPF: "+ Cpf +
				"\nCargo: "+ Cargo +
				"\nIdade: "+ Idade +
				"\nTelefone: "+ Telefone +
				"\nE-mail: "+ Email +
				"\nEndereço: Rua " + Rua +", " +
				"Bairro "+ Bairro +", " +
				"N° " + Numero +", " +
				"\nCidade: "+ Cidade +
				"\nEstado: "+ Estado;
				
	}
	
}
