import java.util.ArrayList;

/**
 * 
 */
public class Cliente {

	private String name;
	private String endereco;

	private Fatura fatura;

	private ArrayList<Servicos> servicos;

	public Cliente(String name, String endereco) {
		this.name = name;
		this.endereco = endereco;
		
		servicos = new ArrayList<Servicos>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Fatura getFatura() {
		return fatura;
	}

	public void setFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	public void setServicos(ArrayList<Servicos> servicos) {
		this.servicos = servicos;
	}

	public void listServicos() {
		
		addServicos();
		for (Servicos servico : servicos) {
			System.out.println(servico);
		}
	}

	private void addServicos() {
		
	}

	
}