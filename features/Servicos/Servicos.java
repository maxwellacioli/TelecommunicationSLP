
/**
 * 
 */
public class Servicos {
	
	double valor;
	String descricao;
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return descricao + ": R$ " + valor; 
	}

}