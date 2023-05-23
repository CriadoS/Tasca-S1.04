package exercici3;
import java.lang.ArrayIndexOutOfBoundsException;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClaseException {

	@Test
	public void llencarExepcio() {
		
		ClaseException prova = new ClaseException(); // Creo una classe 
		
	    assertThrows(ArrayIndexOutOfBoundsException.class, () -> { //primer es posa el tipus d'excepció
	        prova.provocarException();});// això és lambda
	}

}
