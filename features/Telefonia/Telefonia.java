import java.util.concurrent.ThreadLocalRandom;

/**
 * TODO description
 */
public class Telefonia {

	private int numeroTelefonico;
	
	public Telefonia( ) {
		numeroTelefonico = ThreadLocalRandom.current().nextInt(90000000, 99999999);
	}
	
	public int getNumeroTelefonico() {
		return numeroTelefonico;
	}
}