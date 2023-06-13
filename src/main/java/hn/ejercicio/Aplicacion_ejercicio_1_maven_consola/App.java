package hn.ejercicio.Aplicacion_ejercicio_1_maven_consola;

import java.util.Scanner;

public class App 
{
    private static Scanner teclado;
	

	public static void main( String[] args )
    {
		System.out.println( "Calculadora de Áreas| Maven | Junit" );
		int eleccion=0;
		int sino=0;
		
		while(eleccion!=5) {
			Menu();
			eleccion= leerEnteroTeclado("");
			Double respuesta=null;
			if (eleccion==1) {
			respuesta=area_circulo(leerDecimalTeclado("Ingrese el radio del circulo: "));
			}
			else if (eleccion==2) {
				respuesta=area_cuadrado(leerDecimalTeclado("Ingrese el lado: "));
			}
			else if (eleccion==3) {
				respuesta=area_rectangulo(leerDecimalTeclado("Ingrese el lado a: "),leerDecimalTeclado("Ingrese el lado b:"));
			}
			else if (eleccion==4) {
				respuesta=area_triangulo(leerDecimalTeclado("Ingrese la base: "),leerDecimalTeclado("Ingrese la altura:"));
			}
			else {
				System.out.println("--------------------------");
				System.out.println("Finalizando la aplicación.");
				System.out.println("--------------------------");
				break;
			}
			
			System.out.println("El resultado es: "+respuesta);
			System.out.println("-------------------------------");
			System.out.println("¿Desea continuar?| Si=0 | No=-1");
			System.out.println("-------------------------------");
			sino=leerEnteroTeclado("");
			if(sino==-1) {
				System.out.println("--------------------------");
				System.out.println("Finalizando la aplicación.");
				System.out.println("--------------------------");
				break;
			}
			
		}
	
		
    }
    

private static int leerEnteroTeclado(String mensaje) {
	teclado = new Scanner(System.in);
	System.out.println(mensaje);
	return teclado.nextInt();
}

private static double leerDecimalTeclado(String mensaje) {
	teclado = new Scanner(System.in);
	double numero = -1;

    System.out.println(mensaje);
    numero = teclado.nextDouble();

    while (numero < 0) {
        System.out.println("No se permiten números negativos. Inténtalo nuevamente.");
        System.out.println(mensaje);
        numero = teclado.nextDouble();
    }
    return numero;
}

 
 private static void Menu() {
	 System.out.println("**AREA DE FIGURAS GEOMETRICAS**");
	 System.out.println("-------------------------------");
	 System.out.println("**1. Área de un círculo**");
	 System.out.println("**2. Área de un cuadrado**");
	 System.out.println("**3. Área de un rectángulo**");
	 System.out.println("**4. Área de un triángulo**");
	 System.out.println("**5. Salir**");
	 System.out.println("**ELIGE UNA OPCIÓN DEL MENÚ:**");
	 System.out.println("-------------------------------");
	 
 }
 public static double area_circulo(double r) {
	 double resultado=0;
	 
	 if(r<0) {
      System.err.println("No se permiten numeros negativos");
	 }
	 else {
	 resultado=3.1416*(r*r);
	 	 }
	 
	 return resultado;
}
 
 
 
 
 
 public static double area_cuadrado(double lado) {
	 double resultado=0;
	 if(lado<0) {
      System.err.println("No se permiten numeros negativos");
	 }
	 else {
	 resultado=lado*lado;
	
	 }
	 return resultado;
 }
 
 public static double area_rectangulo(double ladoa,double ladob) {
	 double resultado=0;
	 if(ladoa<0 || ladob<0) {
      System.err.println("No se permiten numeros negativos");
      
	 }
	 else {
	 resultado=ladoa*ladob;
	 }
	 return resultado;
 }
 
 public static double area_triangulo(double base,double altura) {
	 double resultado=0;
	 if(base<0 || altura<0) {
      System.err.println("No se permiten numeros negativos");
	 }
	 else {
	 resultado=(base*altura)/2;
	 }
	 return resultado;
 }
}