/**
 *
 */
public class PrePago extends Movel {

	private final double valorMovelPre = 0;
	private final String descricaoMovelPre = "Telefone m�vel pr� pago";
	
	public Servicos servicoTelefonia() {
		
		this.descricao = descricaoMovelPre;
		this.valor = valorMovelPre;
		
		return this;
		
	}

}