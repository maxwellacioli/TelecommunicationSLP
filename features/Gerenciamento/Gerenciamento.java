import java.util.ArrayList;
/**
 * 
 */
public class Gerenciamento {

	private static Gerenciamento gerenciamentoSingleton;
	
	Financeiro financeiro;
	Cliente cliente;
	ArrayList<Servicos> servicos;
	
	private Gerenciamento() {
		
		servicos = new ArrayList<Servicos>();
	
	
	}
	
	public static Gerenciamento getInstance() {
		if(gerenciamentoSingleton == null) {
			gerenciamentoSingleton = new Gerenciamento();
		}
		return gerenciamentoSingleton;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	
	public Financeiro getFinanceiro() {
		return financeiro;
	}
	
}