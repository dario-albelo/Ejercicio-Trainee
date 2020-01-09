
public class Auto extends Vehiculo {
	
	private String puertas;
	
	public Auto(String marca, String modelo, double precio, String puertas) {
		super(marca, modelo, precio);
		this.puertas = puertas;
	}
	

	public String getDato() {
		return this.puertas;
	}
	
	public String toString(){
		String mostrar = "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Puertas: " + this.getDato();
		return mostrar;
	}

}
