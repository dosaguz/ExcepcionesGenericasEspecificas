package excepcionesEspecificasGenericas;


public class AdultoException extends Exception {
	public String mens;
	public AdultoException(String mens) {
		super(mens);
	}

}
