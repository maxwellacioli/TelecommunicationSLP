/**
 * 
 */
public class PosPago extends Movel {

	private final double valorMovelPos = 50.0;
	private final String descricaoMovelPos = "Telefone m�vel p�s pago";
	
	public Servicos servicoTelefonia() {
		
		this.descricao = descricaoMovelPos;
		this.valor = valorMovelPos;
		
		return this;
		
	}
	
}