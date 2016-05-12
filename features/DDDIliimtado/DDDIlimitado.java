/**
 * 
 */
public class DDDIlimitado extends Fixa {

	private final double valorFixaDDD = 180.0;
	private final String descricaoFixaDDD = "Telefone fixo com DDD ilimitado";
	
	public Servicos servicoTelefonia() {
		
		this.descricao = descricaoFixaDDD;
		this.valor = valorFixaDDD;
		
		return this;
		
	}
	
}