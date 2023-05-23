package Exercici2;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculoDniTest {

	@Test
    public void testCalcularLetraDni() {
		
	      assertAll( // Amb assert all puc veure quin dels assert falla  
				()-> assertEquals('D', CalculoDNI.comprovarLletra("53335353D")),//lletra esperada, crido al mètode amb el dni 						
				()-> assertEquals('A', CalculoDNI.comprovarLletra("63603628A")),
				()-> assertEquals('M', CalculoDNI.comprovarLletra("18778217M")),
				()-> assertEquals('W', CalculoDNI.comprovarLletra("09559630W")),
				()-> assertEquals('P', CalculoDNI.comprovarLletra("86664077P")),
				()-> assertEquals('X', CalculoDNI.comprovarLletra("65850919X")),
				()-> assertEquals('T', CalculoDNI.comprovarLletra("49042394T")),
				()-> assertEquals('N', CalculoDNI.comprovarLletra("99069338N")),
				()-> assertEquals('V', CalculoDNI.comprovarLletra("10317932V")),
				()-> assertEquals('C', CalculoDNI.comprovarLletra("54065660C"))					
		
		);
		 				
	}	
}	
		
	
    
	
	

