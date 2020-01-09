
public abstract class Vehiculo implements Comparable<Vehiculo> {
	
	private String marca;
	private String modelo;
	private double precio;
	
	public Vehiculo(String marca, String modelo, double precio) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	
	public String getMarca() {
		return this.marca;
		
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public double getPrecio() {
		return this.precio;
	}
	abstract String getDato();
	
	public int compareTo(Vehiculo v) {
		int comparacion;
		if(this.precio != v.precio && this.precio <v.precio) {
			comparacion = (int) (precio - v.precio);
			return comparacion;
		}
		if(this.precio != v.precio && this.precio> v.precio){
			comparacion = (int) (precio - v.precio);
			return comparacion;
		}else{
		
			return 0;
		}
		
	}

}
