import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Calendar; 
import java.text.SimpleDateFormat;

/**
 * 
 */
public class Fatura extends Financeiro {
	
	double valor;
	String proximaData;

	public double getValor() {
		return valor;
	}
	
	public double calcularValorTotal(ArrayList<Servicos> servicos) {
		this.valor = 0;
		
		for (Servicos servico : servicos) {
			this.valor += servico.getValor();
		}
		
		return this.valor;
	}
	
	public String getProximaData(int melhorDia) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Calendar c = Calendar.getInstance();
		
		c.add(Calendar.DATE, 30);  // adicionar 30 dias (um mês)		
		c.set(Calendar.DATE, melhorDia); // setar o melhor dia
		
		proximaData = sdf.format(c.getTime()); 
		
		return proximaData;
	}

}