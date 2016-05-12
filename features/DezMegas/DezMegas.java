/**
 *
 */
public class DezMegas extends Internet {

	private final double valorInternetDez = 100.00;
	private final String descricaoDez = "Internet 10 megas";
	
	public Servicos servicoInternet() {
		
		this.descricao = descricaoDez;
		this.valor = valorInternetDez;
		
		return this;
	}
	
}