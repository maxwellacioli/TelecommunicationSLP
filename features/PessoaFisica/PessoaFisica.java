/**
 * 
 */
public class PessoaFisica extends Cliente {

	private int cpf;
	
	public PessoaFisica(String name, String endereco, int cpf) {
		super(name, endereco);
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}