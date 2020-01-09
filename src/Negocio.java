import java.util.List;

public interface Negocio {
	
	public void agregarVehiculo(Vehiculo v);
		
	public int obtenerTamañoLista();
	
	public Vehiculo obtenerVehiculo(int i);
	
	public List<Vehiculo> obtenerListaVehiculos();

}
