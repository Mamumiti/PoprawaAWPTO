package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CurrencyTest
{ 
	private Currency c;
	
	@Before
	public void setup(){
		 c = new Currency("USD",2);
	}
	
	@Test
	public void convertFromPlnTest() {
		assertEquals(10,c.convertFromPLN(20));
	}
	
	@Test
	public void convertToPlnTest() {
		assertEquals(10,c.convertToPLN(5));
	}
}