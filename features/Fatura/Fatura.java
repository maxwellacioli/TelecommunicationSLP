import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO description
 */
public class Fatura {
	private int vencimento;
	private double valorDaFatura;
	
	public Fatura(int vencimento) {
		valorDaFatura = 0;
		this.vencimento = vencimento;
	}
	
	public int getVencimento() {
		return vencimento;
	}
	
	public void setVencimento(int vencimento) {
		this.vencimento = vencimento;
	}
	
	public double getValorDaFatura() {
		return valorDaFatura;
	}
	
}