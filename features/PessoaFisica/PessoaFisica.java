/**
 * 
 */
public class PessoaFisica extends Cliente {

	private String cpf;
	
	public PessoaFisica(String name, String endereco, String cpf) {
		super(name, endereco);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}