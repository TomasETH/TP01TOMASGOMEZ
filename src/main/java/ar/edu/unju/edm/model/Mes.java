package ar.edu.unju.edm.model;

public class Mes {
	
	private int numero1;
	
	
	public Mes() {}
	
	public Mes(int numero1) {
		
		this.numero1=numero1;
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public String CalculoMes() {
		
		if(this.numero1>0 && this.numero1<=12) {
			return "si es un mes del año";
		}
		else {
			return "no pertenece a un mes del año";
		}
	}
	

}
