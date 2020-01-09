
public class Moto extends Vehiculo{
	
	private String cilindrada;
	
	public Moto(String marca, String modelo, double precio, String cilindrada) {
		
		super(marca, modelo, precio);
		this.cilindrada = cilindrada;
	}
	
	public String getDato() {
		return this.cilindrada;
		
	}
	
	public String toString(){
		String mostrar = "Marca: " + this.getMarca() + " // Modelo: " + this.getModelo() + " // Cilindrada: " + this.getDato();
		return mostrar;
	}

}
