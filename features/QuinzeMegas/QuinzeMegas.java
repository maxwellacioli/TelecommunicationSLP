/**
 * 
 */
public class QuinzeMegas extends Internet {
	
	private final double valorInternetQuinze = 125.00;
	private final String descricaoQuinze = "Internet 15 megas";
	
	public Servicos servicoInternet() {
		
		this.descricao = descricaoQuinze;
		this.valor = valorInternetQuinze;
		
		return this;
	}
	
}