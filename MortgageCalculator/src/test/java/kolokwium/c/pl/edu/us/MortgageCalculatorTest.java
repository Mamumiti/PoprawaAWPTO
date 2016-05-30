package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.mockito.Mockito;


@RunWith(Parameterized.class)
public class MortgageCalculatorTest
{
	
	private MortgageCalculator mortgageCalculator;
	private MortgageCalculator  mockedMortgageCalculator;
	
	
	public MortgageCalculatorTest(){
	
		mockedMortgageCalculator = Mockito.mock(MortgageCalculator.class);
	}
	
	@Parameters
	    public static Collection<Object[]> data() {
	      return Arrays.asList(new Object[][] {     
	                 { 1}, { 3,}
	           });
	    }
	
	
	@Test
	public void numberOfInstallmentsTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void valueOfFirstInstallmentsTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void valueOfLastInstallmentsTest() {
		fail("Not yet implemented");
	}
}


//+@RunWith(Parameterized.class)
//public class FizzBuzzTest
//{
//+	@Parameters
//+    public static Collection<Object[]> data() {
//+        return Arrays.asList(new Object[][] {     
//+                 { 1,  "1"}, { 3, "Fizz" }, { 5, "Buzz" }, { 15, "FizzBuzz" }
//+           });
//+    }
//+
//+    private int fInput;
//+
//+    private String fExpected;
//+
//+    public FizzBuzzTest(int input, String expected) {
//+        fInput= input;
//+        fExpected= expected;
//+    }
//+    
//+	
//+	@Test
//+    public void test() {
//+		FizzBuzz tester = new FizzBuzz();
//+        assertEquals("",fExpected, tester.calculate(fInput));
//+    }