/**
 *
 */
public class LocalIlimitado extends Fixa {

	private final double valorFixaLocal = 60.0;
	private final String descricaoFixaLocal = "Telefone fixo com local ilimitado";
	
	public Servicos servicoTelefonia() {
		
		this.descricao = descricaoFixaLocal;
		this.valor = valorFixaLocal;
		
		return this;
		
	}
	
}