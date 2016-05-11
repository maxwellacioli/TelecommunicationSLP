import java.util.ArrayList;

/**
 * TODO description
 */
public class Gerenciamento {
	private static Gerenciamento gerenciamentoSingleton;
	private Aplicacao aplicacao;
	
	private Gerenciamento() {
		aplicacao = Aplicacao.getInstance();
	}
	
	public static Gerenciamento getInstance() {
		if(gerenciamentoSingleton == null) {
			gerenciamentoSingleton = new Gerenciamento();
		}
		return gerenciamentoSingleton;
	}
	
}