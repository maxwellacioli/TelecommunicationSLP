import java.util.ArrayList;

/**
 * 
 */
public class Cliente {

	private String nome;
	private String endereco;

	private Fatura fatura;

	private ArrayList<Servicos> servicos;

	public Cliente() {
		servicos = new ArrayList<Servicos>();
		fatura = new Fatura();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public void listarServicos() {
		
		for (Servicos servico : servicos) {
			System.out.println(servico);
		}
	}
	
	public void gerarFatura(int dia) {
		
		double total;
		String data;
		
		total = fatura.calcularValorTotal(servicos);
		System.out.println("O valor total da sua fatura é: R$ "+ total);
		
		data = fatura.getProximaData(dia);
		System.out.println("O vencimento será em: "+ data);
		
	}

	
}