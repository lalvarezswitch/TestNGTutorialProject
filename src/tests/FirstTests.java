package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import code.RandomThings;
import data.Users;

public class FirstTests {
	//private int numero1;
	//private int numero2;
	private int[] numerosCodigo;
	
	@BeforeMethod
	public void setUp() {
		//Aca hubo operaciones con el código y las clases a probar que me traen elos siguientes números
		//numero1 = 5;
		//numero2 = 10;
		RandomThings rt = new RandomThings();
		numerosCodigo = rt.returnInts();
		System.out.println(numerosCodigo[0]);
		System.out.println(numerosCodigo[1]);
	}
	
	@Test
	public void classIsNullTest() {
		//Assert.assertTrue(numero1+5 == numero2);
		Assert.assertTrue(numerosCodigo[0] >= numerosCodigo[1], "Se espera que el primero sea mayor al segundo");
		Users persona1 = null;
		Assert.assertNull(persona1);
		persona1 = new Users();
		Assert.assertNotNull(persona1);
	}
	
	@Test
	public void miPrimerTest() {
		//Assert.assertTrue(numero2 == numero1+5);
		Assert.assertTrue(numerosCodigo[0] == numerosCodigo[1], "Se esperan los dos iguales");
		Assert.assertTrue(1==1);
		Assert.assertTrue('A'=='A');
	}
	
	@Test
	public void miSegundoTest() {
		//Assert.assertTrue(numero2-5 == numero1);
		Assert.assertTrue(numerosCodigo[0] > 0);
		int i = 1;
		int j = 2;
		Assert.assertFalse(i==j);
	}
	
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
}
