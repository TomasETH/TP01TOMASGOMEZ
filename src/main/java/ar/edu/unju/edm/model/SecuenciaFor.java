package ar.edu.unju.edm.model;

public class SecuenciaFor {

private int numero1;
	
	public SecuenciaFor() {}
	
	public SecuenciaFor(int numero1) {
		
		this.numero1=numero1;
		
	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	
	public void  Secuencia() {
		
		for(this.numero1=10 ; this.numero1>=0; this.numero1--) {
			
			System.out.print(this.numero1);
		}
	}
}
