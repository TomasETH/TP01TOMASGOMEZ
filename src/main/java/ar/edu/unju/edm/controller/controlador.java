package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.model.AñoBisiesto;
import ar.edu.unju.edm.model.Factorial;
import ar.edu.unju.edm.model.Mes;
import ar.edu.unju.edm.model.Mes2;
import ar.edu.unju.edm.model.NotaAlumno;
//import ar.edu.unju.edm.model.SecuenciaFor;

@Controller
public class controlador {
	
	
	@GetMapping("/menu")
	
	
	public String obtenermenu() {
		return("index");
	}
	
	@GetMapping("/calculoFactorial")
    public String getFactorial(@RequestParam(name="num1")int num1,Model model) {
		int resultadoF;
		Factorial nuevoFactorial = new Factorial();
    	nuevoFactorial.setNumero1(num1);
    	resultadoF=nuevoFactorial.factorial();
    	model.addAttribute("resultadoF", resultadoF);
		return "punto1";
    	
		
	
	}
	
	@GetMapping("/calculoBisiesto")
    public String getBisiesto(@RequestParam(name="num1")int num1,Model model) {
		String resultadoB;
		AñoBisiesto nuevoBisiesto=new AñoBisiesto();
		nuevoBisiesto.setNumero1(num1);
    	resultadoB=nuevoBisiesto.Obtenerbisiesto();
    	model.addAttribute("resultadoB", resultadoB);
		return "punto2";
   
	}
	
	@GetMapping("/calculoMes")
    public String getMes(@RequestParam(name="num1")int num1,Model model) {
		String resultadoM;
		Mes nuevoMes=new Mes();
		nuevoMes.setNumero1(num1);
    	resultadoM=nuevoMes.CalculoMes();
    	model.addAttribute("resultadoM", resultadoM);
		return "punto4";
   
	}
	
	@GetMapping("/calculoMes2")
    public String getMes2(@RequestParam(name="num1")int num1,Model model) {
		String resultadoM2;
		Mes2 nuevoMes2=new Mes2();
		nuevoMes2.setNumero1(num1);
    	resultadoM2=nuevoMes2.CalculoMes2();
    	model.addAttribute("resultadoM2", resultadoM2);
		return "punto5";
   
	}
	
	@GetMapping("/calculoCalificacion")
    public String getCalificacion(@RequestParam(name="num1")int num1,Model model) {
		String resultadoC;
		NotaAlumno NuevoAlumno=new NotaAlumno();
		NuevoAlumno.setNumero1(num1);
    	resultadoC=NuevoAlumno.Calificacion();
    	model.addAttribute("resultadoC", resultadoC);
		return "punto6";
   
	}
	
	/*
	@GetMapping("/calculoSecuenciaFor")
    public String getSecuenciaFor(@RequestParam(name="num1")int num1,Model model) {
		String resultadoSF;
		SecuenciaFor miSecuenciaFor=new SecuenciaFor();
		miSecuenciaFor.setNumero1(num1);
    	resultadoSF=miSecuenciaFor.Secuencia();
    	model.addAttribute("resultadoSF", (resultadoSF);
		return "punto6";
   
	}
	
	*/
	
	

}


























