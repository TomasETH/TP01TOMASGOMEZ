package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.AñoBisiesto;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Mes;
import ar.edu.unju.edm.model.Mes2;
import ar.edu.unju.edm.model.NotaAlumno;
import ar.edu.unju.edm.model.SecuenciaFor;

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
		SecuenciaFor miSecuenciaFor=new SecuenciaFor();
		
		
		System.out.println("El resultado del factorial es:"+" "+miFactorial.factorial());
		System.out.println("El numero"+" "+miBisiesto.getNumero1()+" "+miBisiesto.Obtenerbisiesto());
		System.out.println("El Dato ingresado"+" "+ miMes.CalculoMes());
		System.out.println("El Dato ingresado"+" "+ miMes2.CalculoMes2());
		System.out.println(miNotaAlumno.Calificacion());
		miSecuenciaFor.Secuencia();
		
	}
	
	

}
