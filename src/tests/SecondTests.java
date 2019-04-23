package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTests {
	@Test
	public void miTercerTest() {
		//Assert.assertTrue(numero2-10 == numero1-5);
		Assert.assertEquals(5, 5);
		Assert.assertEquals('C', 'C');
	}
	
	@Test
	public void miCuartoTest() {
		//Assert.assertTrue(numero2-10 == numero1-5);
		Assert.assertNotEquals(4, 8);
		Assert.assertNotEquals('4', 'H');
	}
	
	@Test(enabled = true)
	public void test1() {
		Assert.assertNotEquals(2, 3);		
	}
	
	@Test(enabled = false)
	public void test2() {
		
	}
	
	@Test(enabled = false)
	public void test3() {
		
	}
	
	@Test(enabled = false)
	public void test4() {
		
	}

}
