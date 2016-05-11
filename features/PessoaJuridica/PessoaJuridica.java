/**
 * 
 */
public class PessoaJuridica extends Cliente {

	private String cnpj;
	
	public PessoaJuridica(String name, String endereco, String cnpj) {
		super(name, endereco);
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}