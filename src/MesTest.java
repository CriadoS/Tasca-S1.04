import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MesTest {

	Mes m = new Mes("prova");

	@Test
	public void testPosicions() {
		
		int esperat = 12;
		
		assertEquals(esperat, m.getLlistaMesos().size()); 
		
	}
	
	@Test
	public void testNull() {
		
		assertNotNull(m.getLlistaMesos());
		
	}
	
	@Test
	public void TestPos() {
		
		assertEquals(m.getLlistaMesos().get(7), "agost");
	}
	

}