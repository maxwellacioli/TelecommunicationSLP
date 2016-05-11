/**
 * 
 */
public class PessoaJuridica extends Cliente {

	private int cnpj;
	
	public PessoaJuridica(String name, String endereco, int cnpj) {
		super(name, endereco);
		this.cnpj = cnpj;
	}
	
	public int getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

}