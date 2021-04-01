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
	
}
