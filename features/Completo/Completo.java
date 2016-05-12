/**
 * 
 */
public class Completo extends Tv {

	private final double valorTvCompleto = 150.0;
	private final String descricaoCompleto = "Pacote completo de TV";
	
	public Servicos servicoTv() {
		
		this.descricao = descricaoCompleto;
		this.valor = valorTvCompleto;
		
		return this;
	}
	
}