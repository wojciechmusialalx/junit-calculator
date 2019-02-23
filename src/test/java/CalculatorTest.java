import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {
	
	private Calculator classUnderTest;
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new Calculator();
	}
		
	@After
	public void tearDown() {
		System.out.println("Metoda zostanie wykonana po kazdym tescie");
	}
	
	@Test
    public void testDodawania() throws Exception {
        System.out.println("Metoda testowa");

        double a = 1.0;
        double b = 3.5;

        // to czego sie spodziewamy
        double expected = 4.5;

        // to co faktycznie zwrocila nam funkcja, ktora testujemy
        double actual = classUnderTest.sum(a, b);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testDzielenia() throws Exception {
        System.out.println("Metoda testowa");

        double a = 4.0;
        double b = 2.0;

        // to czego sie spodziewamy
        double expected = 2.0;

        // to co faktycznie zwrocila nam funkcja, ktora testujemy
        double actual = classUnderTest.divide(a, b);

        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDzieleniaPrzezZero() {
        double a = 5.0;
        double b = 0.0;

        classUnderTest.divide(a, b);
    }
}
