package hn.ejercicio.Aplicacion_ejercicio_1_maven_consola;


import static org.junit.Assert.*;
import org.junit.*;


public class AppTest {
	
	
	@BeforeClass
	public static void Inicio() {
		System.out.println("Método de tipo Setup, se ejecuta antes de cada prueba");
	}
	

	@Test
	public void testcir1() {
		assertTrue(App.area_circulo(4)==50.2656);
	}
	
	@Test
	public void testcirdecimal() {
		assertEquals(App.area_circulo(5.5),95.0334,0.0001);
	}
	
	@Test
	public void testcirfalse() {
		assertFalse(App.area_circulo(5.5)==0);
	}
	
	@Test
	public void testcirc4() {
		assertNotNull(App.area_circulo(0)==0);
	}
	
	@Test
	public void testcuadradofalse() {
		assertFalse(App.area_cuadrado(2)==0);
	}
	
	@Test
	public void testcuadradotrue() {
		assertTrue(App.area_cuadrado(4.8)==23.04);
	}

	@Test
	public void testcuadradonull() {
		assertFalse(App.area_cuadrado(-1)==1);
	}
	
	@Test
	public void testcuadradoequals() {
		assertEquals(App.area_cuadrado(30),900,0.0001);
	}
	
	@Test
	public void testrectanguloequals() {
		assertEquals(App.area_rectangulo(3,9),27,0.0001);
	}
	
	@Test
	public void testrectangulotrue() {
		assertTrue(App.area_rectangulo(10.6,5.5)==58.3);
	}
	
	@Test
	public void testrectangulofalse() {
		assertFalse(App.area_rectangulo(21.6,7.6)==100.2);
	}
	
	
	@Test
	public void testrectangulonull() {
		assertFalse(App.area_rectangulo(-1,4)==-4);
	}
	
	@Test
	public void testtrianguloequals() {
		assertEquals(App.area_triangulo(3,4),6,0.0001);
	}
	
	@Test
	public void testtriangulotrue() {
		assertTrue(App.area_triangulo(23.5,7)==82.25);
	}
	
	@Test
	public void testtriangulofalse() {
		assertFalse(App.area_triangulo(4,1)==6);
	}
	
	
	
	
	
	
	
	
	
	@AfterClass
	public static void finalizacionPruebas() {
		System.out.println("Método de tipo TearDown, se ejecuta despues de cada prueba");
	}
	
 
}
