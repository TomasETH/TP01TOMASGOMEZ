package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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


@Controller
public class controlador {
	
@Autowired
Punto8 punto8;
	
	
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
	
	@GetMapping("/calculoPar")
    public String getPar(@RequestParam(name="num1")int num1,Model model) {
		String resultadoP;
		NumeroPar miPar = new NumeroPar();
		miPar.setNumero1(num1);
    	resultadoP=miPar.numeroPar();
    	model.addAttribute("resultadoPar", resultadoP);
		return "punto3";
   
	}
	
	
	@GetMapping("/calculoMultiplos")
	public ModelAndView getMultiplo1 (@RequestParam (name= "num1") String numero) {
		punto8.setNumero1(Integer.valueOf(numero));
		String resultadoMultiplos=punto8.generarMultiplos1();
		ModelAndView modelView = new ModelAndView("punto8");
		modelView.addObject("resultadoMultiplos",resultadoMultiplos);
		modelView.addObject("numero",numero);
		return modelView;
		
		
		
		
	}
	
	@Autowired
	Punto9 punto9;
	@GetMapping("/calculoRestante1")
	public ModelAndView getRestante1 (@RequestParam (name= "num1") String numero) {
		punto9.setNumero1(Integer.valueOf(numero));
		String resultadoRestante1=punto9.restante1();
		ModelAndView modelView = new ModelAndView("punto9");
		modelView.addObject("resultado9",resultadoRestante1);
		modelView.addObject("numero",numero);
		return modelView;
		
	}
	
	@Autowired
	Punto10 punto10;
	@GetMapping("/calculoRestante2")
	public ModelAndView getRestante2 (@RequestParam (name= "num1") String numero) {
		punto10.setNumero1(Integer.valueOf(numero));
		String resultadoRestante2=punto10.restante2();
		ModelAndView modelView = new ModelAndView("punto10");
		modelView.addObject("resultado10",resultadoRestante2);
		modelView.addObject("numero",numero);
		return modelView;
		
	}
	
	@Autowired
	Punto11 punto11;
	@GetMapping("/calculoRestante3")
	public ModelAndView getRestante3 (@RequestParam (name= "num1") String numero) {
		punto11.setNumero1(Integer.valueOf(numero));
		String resultadoRestante3=punto11.restante3();
		ModelAndView modelView = new ModelAndView("punto11");
		modelView.addObject("resultado11",resultadoRestante3);
		modelView.addObject("numero",numero);
		return modelView;
		
	}
	
	@Autowired
	Punto12 punto12;
	@GetMapping("/calculoPunto12")
	public ModelAndView getPunto12 (@RequestParam (name= "num1") String numero) {
		punto12.setNumero1(Integer.valueOf(numero));
		String resultadoPunto12=punto12.calculoCaida();
		ModelAndView modelView = new ModelAndView("punto12");
		modelView.addObject("resultado12",resultadoPunto12);
		modelView.addObject("numero",numero);
		return modelView;
		
	}
	
    
		
		
		
	
	
	
	
	

}


























