/**
 * TODO description
 */
public class Aplicacao {
	
	private static Aplicacao aplicacaoSingleton;
	
	public Aplicacao() {
	}
	
	public static Aplicacao getInstance(){
		if(aplicacaoSingleton == null) {
			aplicacaoSingleton = new Aplicacao();
		}
		return aplicacaoSingleton;
	}
}