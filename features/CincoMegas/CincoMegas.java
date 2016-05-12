/**
 * 
 */
public class CincoMegas extends Internet {

	private final double valorInternetCinco = 85.00;
	private final String descricaoCinco = "Internet 5 megas";
	
	public Servicos servicoInternet() {
		
		this.descricao = descricaoCinco;
		this.valor = valorInternetCinco;
		
		return this;
	}

}