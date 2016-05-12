/**
 *
 */
public class Basico extends Tv {
	
	private final double valorTvBasico = 90.0;
	private final String descricaoBasico = "Pacote básico de TV";
	
	public Servicos servicoTv() {
		
		this.descricao = descricaoBasico;
		this.valor = valorTvBasico;
		
		return this;
	}
	
}