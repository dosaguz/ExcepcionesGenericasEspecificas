package tests;


import org.junit.jupiter.api.Test;

import excepcionesEspecificasGenericas.AdultoException;
import excepcionesEspecificasGenericas.InfantilException;
import excepcionesEspecificasGenericas.MayorException;
import excepcionesEspecificasGenericas.PruebaEdadPersonas;




public class TestExcepcionesAleatorias2 {


		@Test
		void generaExcepcionEdad() {		
			PruebaEdadPersonas gente = new PruebaEdadPersonas();
			for (int i = 0;i<100;i++) {
					int num = (int) (Math.random()*101+0);
				try {
					gente.generaExcepcionEdad(num);
					} 
				catch (Exception e) {
					System.out.println(e.getMessage());
					}
			}
	}
}