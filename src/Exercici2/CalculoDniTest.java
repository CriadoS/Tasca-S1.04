package Exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculoDniTest {
	
	
	@ParameterizedTest
    @CsvSource({
    	
        "53335353D, D",
        "35021950B, B",
        "18778217M, M",
        "09559630W, W",
        "86664077P, P",
        "65850919X, X",
        "49042394T, T",
        "99069338N, N",
        "10317932V, V",
        "54065660C, C"
        
    })
    void testCalcularLetraDni(String numeroDni, char lletraEsperada) {
        char letraCalculada = CalculoDNI.comprovarLletra(numeroDni);
        assertEquals(lletraEsperada, letraCalculada);
    }
	
}