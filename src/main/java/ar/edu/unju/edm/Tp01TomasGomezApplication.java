package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.AñoBisiesto;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Mes;
import ar.edu.unju.edm.model.Mes2;
import ar.edu.unju.edm.model.NotaAlumno;
import ar.edu.unju.edm.model.NumeroPar;
import ar.edu.unju.edm.model.Punto10;
import ar.edu.unju.edm.model.Punto11;
import ar.edu.unju.edm.model.Punto12;
import ar.edu.unju.edm.model.Punto8;
import ar.edu.unju.edm.model.Punto9;


@SpringBootApplication
public class Tp01TomasGomezApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp01TomasGomezApplication.class, args);
		
		
		String nombre = "Tomas Valentino Gomez";
		System.out.println("Hola Mundo"+""+nombre);
		
		Factorial miFactorial = new Factorial(4,0);
		AñoBisiesto miBisiesto=new AñoBisiesto(2008);
		Mes miMes= new Mes(5);
		Mes2 miMes2= new Mes2(13);
		NotaAlumno miNotaAlumno = new NotaAlumno(8);
		NumeroPar miNumeroPar = new NumeroPar(18);
		Punto8 miPunto8 = new Punto8(4);
		Punto9 miPunto9 = new Punto9(320);
		Punto10 miPunto10= new Punto10 (320);
		Punto11 miPunto11 = new Punto11(320);
		Punto12 miPunto12 = new Punto12(8);
		
		System.out.println("El resultado del factorial es:"+" "+miFactorial.factorial());
		System.out.println("El numero"+" "+miBisiesto.getNumero1()+" "+miBisiesto.Obtenerbisiesto());
		System.out.println("El Dato ingresado"+" "+ miMes.CalculoMes());
		System.out.println("El Dato ingresado"+" "+ miMes2.CalculoMes2());
		System.out.println(miNotaAlumno.Calificacion());
		System.out.println("Numero ingresado es"+" "+ miNumeroPar.numeroPar());
		System.out.println("es: "+miPunto9.restante1());
		System.out.println("es: " +miPunto10.restante2());
		System.out.println("es: " + miPunto11.restante3());
		System.out.println("es: " + miPunto8.generarMultiplos1());
		System.out.println("es: " + miPunto12.calculoCaida());
	}
	
	

}
