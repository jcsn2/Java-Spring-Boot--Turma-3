package erros;

public class Cliente {

	private String nome;
	private String cpf;
	private String sobrenome;

	public Cliente(String nome, String cpf, String sobrenome) {
		this.nome = nome;
		this.cpf = cpf;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getSobrenome() {
		return sobrenome;
	}

}
