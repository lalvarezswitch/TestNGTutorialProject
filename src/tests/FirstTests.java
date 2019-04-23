package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTests {
	
	@Test
	public void miPrimerTest() {
		Assert.assertTrue(1==1);
		Assert.assertTrue('A'=='A');
	}
	
	@Test
	public void miSegundoTest() {
		int i = 1;
		int j = 2;
		Assert.assertFalse(i==j);
	}
	
	@Test
	public void miTercerTest() {
		Assert.assertEquals(5, 5);
		Assert.assertEquals('C', 'C');
	}
	
	@Test
	public void miCuartoTest() {
		Assert.assertNotEquals(4, 8);
		Assert.assertNotEquals('4', 'H');
	}
}
