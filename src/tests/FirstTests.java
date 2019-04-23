package tests;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import code.RandomThings;
import data.Users;

public class FirstTests {
	//private int numero1;
	//private int numero2;
	private int[] numerosCodigo;
	
	@BeforeTest
	public void before() {
		System.out.println("------------------------------------------------");
		System.out.println("Ejecutando precondiciones para correr los tests...");
		System.out.println("Creando la base de datos...");
		System.out.println("Creando entorno...");
		System.out.println("------------------------------------------------");		
	}
	
	@AfterTest
	public void after() {
		System.out.println("------------------------------------------------");
		System.out.println("Eliminando base de datos...");
		System.out.println("Eliminando entorno...");
		System.out.println("------------------------------------------------");
	}
	
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
	
	@Test(description = "Verificar que el primer nro sea mayor que el segundo")
	public void classIsNullTest() {
		//Assert.assertTrue(numero1+5 == numero2);
		Assert.assertTrue(numerosCodigo[0] >= numerosCodigo[1], "Se espera que el primero sea mayor al segundo");
		Users persona1 = null;
		Assert.assertNull(persona1);
		persona1 = new Users();
		Assert.assertNotNull(persona1);
	}
	
	@Test(description = "Verificar que ambos nrs. sean iguales")
	public void miPrimerTest() {
		//Assert.assertTrue(numero2 == numero1+5);
		Assert.assertTrue(numerosCodigo[0] == numerosCodigo[1], "Se esperan los dos iguales");
		Assert.assertTrue(1==1);
		Assert.assertTrue('A'=='A');
	}
	
	@Test(description = "Verificar que el primer nro sea mayor a cero")
	public void miSegundoTest() {
		//Assert.assertTrue(numero2-5 == numero1);
		Assert.assertTrue(numerosCodigo[0] > 0, "El primero debe ser mayor a cero");
		int i = 1;
		int j = 2;
		Assert.assertFalse(i==j);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		System.out.println("El test "+ result.getMethod().getDescription()+ " resultó: "+result.getStatus());
		System.out.println("Ejecutando las postcondiciones...");
		System.out.println("Test case finalizado");
	}
}
