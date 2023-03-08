package tests;


import org.junit.jupiter.api.Test;

import excepcionesEspecificasGenericas.AdultoException;
import excepcionesEspecificasGenericas.InfantilException;
import excepcionesEspecificasGenericas.MayorException;
import excepcionesEspecificasGenericas.PruebaEdadPersonas;




public class TestExcepcionesAleatorias {


		@Test
		void generaExcepcionEdad() {		
			PruebaEdadPersonas gente = new PruebaEdadPersonas();
			for (int i = 0;i<100;i++) {
					int num = (int) (Math.random()*101+0);
				try {
					gente.generaExcepcionEdad(num);
					} 
				catch (InfantilException e) {
					System.out.println("Edad "+num+ ". "+ e.getMessage());
					}
				catch (AdultoException e) {
				System.out.println("Edad "+ num + ". "+ e.getMessage());
					}
				catch (MayorException e) {
				System.out.println("Edad "+ num + ". "+ e.getMessage());
				}
			}
	}
}