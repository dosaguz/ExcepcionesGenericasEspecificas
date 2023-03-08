package excepcionesEspecificasGenericas;

public class PruebaEdadPersonas {
	
	public void generaExcepcionEdad(int edad) throws AdultoException, InfantilException, MayorException{
		if (edad<18) {
			throw new  InfantilException("Es INFANTIL");
		}
		else if (edad>=18 && edad <= 65) {
			throw new AdultoException("Es ADULTO");
		}
		else if (edad > 65) {
			throw new MayorException("Es ANCIANO");
		}
	}
}
